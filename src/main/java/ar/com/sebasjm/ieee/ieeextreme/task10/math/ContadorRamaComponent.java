/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.com.sebasjm.ieee.ieeextreme.task10.math;

import ar.com.sebasjm.ieee.ieeextreme.task10.api.system.math.Contador;
import ar.com.sebasjm.rigel.core.metadata.States;
import ar.com.sebasjm.rigel.core.metadata.States.Dimension;
import ar.com.sebasjm.rigel.core.metadata.Interfaces;
import ar.com.sebasjm.rigel.core.metadata.Name;

/**
 *
 * @author sebasjm at computer dot org
 */
@Name(ContadorRamaComponent.class)
@Interfaces({
    @Name(Contador.class)
})
@States({
    @Dimension({
        @Name(Cuatro.class),
        @Name(Tres.class),
        @Name(Dos.class),
        @Name(Uno.class),
        @Name(Cero.class)
    })
})
public class ContadorRamaComponent {

}
