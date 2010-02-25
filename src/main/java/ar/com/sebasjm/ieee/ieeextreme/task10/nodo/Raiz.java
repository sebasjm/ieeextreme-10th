/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.com.sebasjm.ieee.ieeextreme.task10.nodo;

import ar.com.sebasjm.ieee.ieeextreme.task10.api.arbol.Nodo;
import ar.com.sebasjm.ieee.ieeextreme.task10.api.system.UserInput;
import ar.com.sebasjm.rigel.core.Self;
import static ar.com.sebasjm.rigel.implementation.core.Sugar.*;

/**
 *
 * @author sebasjm at computer dot org
 */
public class Raiz {

    private Nodo padre;
    private UserInput userInput;

    public Raiz(Nodo padre, UserInput userInput) {
        this.padre = padre;
        this.userInput = userInput;
    }

    public void sosLaRaizDelArbol() { }

    public void getProximaRama( ) { }

    public void agregarHijo( Nodo nodo ) {
        
    }

    public UserInput getNombre() {
        return userInput;
    }

    public Nodo getPadre() {
        return padre;
    }

}
