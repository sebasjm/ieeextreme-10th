/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.com.sebasjm.ieee.ieeextreme.task10.arbol;

import ar.com.sebasjm.ieee.ieeextreme.task10.api.arbol.Nodo;
import ar.com.sebasjm.ieee.ieeextreme.task10.api.system.UserInput;
import ar.com.sebasjm.rigel.core.Self;
import static ar.com.sebasjm.rigel.implementation.core.Sugar.*;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author sebasjm at computer dot org
 */
public class Consistente {

    private Set<UserInput> hojas = new HashSet<UserInput>();

    public Consistente() {
    }

    public void agregar( Nodo nodo, Self self ) {
        if (hojas.contains( nodo.getNombre() ))
            self.become( name(Inconsistente.class) );
        else
            hojas.add( nodo.getNombre() );
    }

}
