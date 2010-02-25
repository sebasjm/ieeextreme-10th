/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.com.sebasjm.ieee.ieeextreme.task10.implementation.app;

import ar.com.sebasjm.ieee.ieeextreme.task10.api.arbol.Arbol;
import ar.com.sebasjm.ieee.ieeextreme.task10.app.makers.ArbolLlenoHandler;
import ar.com.sebasjm.rigel.core.metadata.Interfaces;
import ar.com.sebasjm.rigel.core.metadata.Name;

/**
 *
 * @author sebasjm at computer dot org
 */
@Name(DefaultArbolLlenoHandler.class)
@Interfaces({
    @Name(ArbolLlenoHandler.class)
})
public class DefaultArbolLlenoHandler {

    public DefaultArbolLlenoHandler() {
    }

    public void handle(Arbol arbol) {
        arbol.marcarComoLleno();
    }


}
