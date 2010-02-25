/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.com.sebasjm.ieee.ieeextreme.task10.app;
import ar.com.sebasjm.ieee.ieeextreme.task10.api.system.UserInput;
import ar.com.sebasjm.ieee.ieeextreme.task10.api.system.ArgList;
import ar.com.sebasjm.ieee.ieeextreme.task10.api.arbol.Arbol;
import ar.com.sebasjm.ieee.ieeextreme.task10.api.arbol.Nodo;
import ar.com.sebasjm.ieee.ieeextreme.task10.api.system.Log;
import ar.com.sebasjm.rigel.core.Factory;
import ar.com.sebasjm.rigel.core.metadata.States;
import ar.com.sebasjm.rigel.core.metadata.States.Dimension;
import ar.com.sebasjm.rigel.core.metadata.Interfaces;
import ar.com.sebasjm.rigel.core.metadata.Name;
import static ar.com.sebasjm.rigel.implementation.core.Sugar.*;

/**
 *
 * @author sebasjm at computer dot org
 */
@Name(AppComponent.class)
@Interfaces({
    @Name(Runnable.class)
})
@States({
    @Dimension({
        @Name(AppComponent.class)
    })
})
public class AppComponent {

    private Log log;

    public AppComponent(Log log) {
        this.log = log;
    }

    public void run(ArgList argList, Factory<Nodo> nodoMaker, Arbol arbol) {
        for ( UserInput valor : argList ) {
            arbol.agregar( nodoMaker.create( alias(UserInput.class, valor ) ) );
        }
        
        log.print( arbol );
    }


}
