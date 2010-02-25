/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.com.sebasjm.ieee.ieeextreme.task10.arbol;

import ar.com.sebasjm.ieee.ieeextreme.task10.api.arbol.Arbol;
import ar.com.sebasjm.rigel.core.metadata.States;
import ar.com.sebasjm.rigel.core.metadata.States.Dimension;
import ar.com.sebasjm.rigel.core.metadata.Interfaces;
import ar.com.sebasjm.rigel.core.metadata.Name;

/**
 *
 * @author sebasjm at computer dot org
 */
@Name(ArbolComponent.class)
@Interfaces({
    @Name(Arbol.class)
})
@States({
    @Dimension({
        @Name(Vacio.class),
        @Name(Incompleto.class),
        @Name(Lleno.class)
    }),
    @Dimension({
        @Name(Consistente.class),
        @Name(Inconsistente.class)
    })
})
public abstract class ArbolComponent {

}
