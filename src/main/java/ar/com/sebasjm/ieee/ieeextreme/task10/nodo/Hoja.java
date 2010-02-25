/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.com.sebasjm.ieee.ieeextreme.task10.nodo;

import ar.com.sebasjm.ieee.ieeextreme.task10.app.makers.ArbolLlenoHandler;
import ar.com.sebasjm.ieee.ieeextreme.task10.api.arbol.Nodo;
import ar.com.sebasjm.ieee.ieeextreme.task10.api.system.UserInput;
import ar.com.sebasjm.ieee.ieeextreme.task10.implementation.app.Relacion;
import ar.com.sebasjm.rigel.core.Alias;
import ar.com.sebasjm.rigel.core.Component;
import java.util.Set;

/**
 *
 * @author sebasjm at computer dot org
 */
public class Hoja {

    private Nodo padre;
    private UserInput userInput;

    public Hoja(Nodo nodo, UserInput userInput) {
        this.padre = nodo;
        this.userInput = userInput;
    }

    public void sosLaRaizDelArbol(ArbolLlenoHandler arbolLlenoHandler) {
        arbolLlenoHandler.handle();
    }

    public void getProximaRama() { }

    public void agregarHijo( ) { }

    public UserInput getNombre() {
        return userInput;
    }

    public Nodo getPadre() {
        return padre;
    }

}
