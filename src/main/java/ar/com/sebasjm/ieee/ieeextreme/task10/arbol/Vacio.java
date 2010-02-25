/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.com.sebasjm.ieee.ieeextreme.task10.arbol;

import ar.com.sebasjm.ieee.ieeextreme.task10.api.arbol.Nodo;
import ar.com.sebasjm.rigel.core.Self;
import static ar.com.sebasjm.rigel.implementation.core.Sugar.*;

/**
 *
 * @author sebasjm at computer dot org
 */
public class Vacio {
    
    public Vacio() {}

    public void agregar(Self self, Nodo nodo) {
        self.become( name(Incompleto.class) );
    }

    public void marcarComoLleno(Self self) {
        self.become( name(Lleno.class) );
    }

}
