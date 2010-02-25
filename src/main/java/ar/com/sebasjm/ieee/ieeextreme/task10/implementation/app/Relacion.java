/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.com.sebasjm.ieee.ieeextreme.task10.implementation.app;

import ar.com.sebasjm.ieee.ieeextreme.task10.api.arbol.Nodo;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author sebasjm
 */
public class Relacion implements Comparable<Relacion>{
    private Nodo condicion = null;
    private Direccion valor = null;
    private Set<Relacion> valores = new HashSet<Relacion>();

    public Relacion(Nodo condicion, Direccion valor) {
        this.condicion = condicion;
        this.valor = valor;
//        this.valores = condicion.getValores();
        this.valores.add(this);
    }

    public Nodo getCondicion() {
        return condicion;
    }

    public Direccion getValor() {
        return valor;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Relacion other = (Relacion) obj;
        if (this.condicion != other.condicion && (this.condicion == null || !this.condicion.getNombre().equals(other.condicion.getNombre()) )) {
            return false;
        }
        if (this.valor != other.valor) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + (this.condicion != null ? this.condicion.getNombre().hashCode() : 0);
        hash = 11 * hash + this.valor.hashCode();
        return hash;
    }

    public int compareTo(Relacion dos) {
        return Integer.signum( this.condicion.getNombre().compareTo( dos.condicion.getNombre().toString() ) )*2 +
               Integer.signum( this.valor.compareTo( dos.valor )                                 );
    }

    @Override
    public String toString() {
        return "Relacion(condicion="+condicion.getNombre()+",valor="+valor+")";
    }

    public Set<Relacion> getValores() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

}
