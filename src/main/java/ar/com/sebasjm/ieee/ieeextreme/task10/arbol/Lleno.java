/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.com.sebasjm.ieee.ieeextreme.task10.arbol;

import ar.com.sebasjm.ieee.ieeextreme.task10.api.arbol.Arbol;
import ar.com.sebasjm.ieee.ieeextreme.task10.api.arbol.Nodo;
import ar.com.sebasjm.rigel.core.metadata.Interfaces;
import ar.com.sebasjm.rigel.core.metadata.Name;

/**
 *
 * @author sebasjm at computer dot org
 */
@Name(Lleno.class)
@Interfaces({
    @Name(Arbol.class)
})
public class Lleno {

    private Nodo raiz;

    public Lleno(Nodo raiz){
        this.raiz = raiz;
    }

    public Nodo getRaiz() { return raiz;}
    
}
