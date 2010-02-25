/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.com.sebasjm.ieee.ieeextreme.task10.nodo;

import ar.com.sebasjm.ieee.ieeextreme.task10.api.arbol.Nodo;
import ar.com.sebasjm.rigel.core.Self;

/**
 *
 * @author sebasjm at computer dot org
 */
public class Lleno {

    public void sosLaRaizDelArbol() { }

    public Nodo getProximaRama( Self self) { 
        return ((Nodo)self.reference()).getPadre();
    }

    public void agregarHijo( ) {

    }

    public void getNombre() { }

    public void getPadre() { }

}
