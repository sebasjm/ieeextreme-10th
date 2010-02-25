/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.com.sebasjm.ieee.ieeextreme.task10.nodo;

import ar.com.sebasjm.ieee.ieeextreme.task10.api.arbol.Nodo;
import ar.com.sebasjm.ieee.ieeextreme.task10.implementation.app.Relacion;
import ar.com.sebasjm.rigel.core.metadata.States;
import ar.com.sebasjm.rigel.core.metadata.States.Dimension;
import ar.com.sebasjm.rigel.core.metadata.Interfaces;
import ar.com.sebasjm.rigel.core.metadata.Name;
import java.util.Set;

/**
 * Representa cualquier valor que puede tomar el nodo de un arbol
 *
 * @author sebasjm at computer dot org
 */
@Name(NodoComponent.class)
@Interfaces({
    @Name(Nodo.class)
})
@States({
    @Dimension({
        @Name(Incompleto.class),
        @Name(Lleno.class)
    }),
    @Dimension({
        @Name(Raiz.class),
        @Name(Rama.class),
        @Name(Hoja.class)
    })
})
public abstract class NodoComponent {

}
