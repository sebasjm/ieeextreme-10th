/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.com.sebasjm.ieee.ieeextreme.task10.implementation.app;

/**
 * Las direcciones que tiene una rama
 * 
 * @author sebasjm
 */
public enum Direccion {
    izquierda,
    derecha__;

    /**
     * Indica la proxima direccion.
     * La implementacion de este metodo contiene el algoritmo de llenado de una rama
     *
     * @param d La direccion actual
     * @return La proxima direccion, null si no hay proxima direccion
     */
    public static Direccion getProximaDireccion(Direccion d){
        return Direccion.values().length == d.ordinal()+1 ? null : Direccion.values()[d.ordinal()+1];
    }
}
