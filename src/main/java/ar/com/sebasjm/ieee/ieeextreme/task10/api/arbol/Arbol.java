/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.com.sebasjm.ieee.ieeextreme.task10.api.arbol;

import ar.com.sebasjm.rigel.core.Alias;
import ar.com.sebasjm.rigel.core.Component;
import ar.com.sebasjm.rigel.core.metadata.Name;

/**
 *
 * @author sebasjm at computer dot org
 */
@Name(Arbol.class)
public interface Arbol extends Component {

    public void marcarComoLleno(Alias ... alias);
    public void agregar(Nodo nodo, Alias ... alias);
    public Nodo getUltimaRamaIncompleta(Alias ... alias);
    public Nodo getRaiz();
//    public Set getHojasPorNombre(String nombre);
    
}
