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
 * @author sebasjm
 */
public class Incompleto {

    private Nodo raiz = null;

    private Nodo indice = null;

    public Incompleto(Nodo nodo) {
        this.raiz = nodo;
        this.indice = raiz;
        this.indice.sosLaRaizDelArbol();
    }

    public Nodo getIndice() {
        return indice;
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void agregar(Nodo nodo){
        indice.agregarHijo( nodo );
        indice = nodo.getProximaRama();
    }

    public void marcarComoLleno(Self self) {
        self.become( name(Lleno.class) );
    }


}
