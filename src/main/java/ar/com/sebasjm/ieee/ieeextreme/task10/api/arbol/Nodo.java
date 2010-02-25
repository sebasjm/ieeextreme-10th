/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.com.sebasjm.ieee.ieeextreme.task10.api.arbol;

import ar.com.sebasjm.ieee.ieeextreme.task10.api.system.UserInput;
import ar.com.sebasjm.ieee.ieeextreme.task10.implementation.app.Relacion;
import ar.com.sebasjm.rigel.core.Alias;
import ar.com.sebasjm.rigel.core.Component;
import ar.com.sebasjm.rigel.core.info.NameComponent;
import java.util.Set;

/**
 *
 * @author sebasjm at computer dot org
 */
public interface Nodo extends Component {

    public void sosLaRaizDelArbol(Alias ... alias);
    /**
     *
     * @param alias
     * @return
     */
    public Nodo getProximaRama(Alias ... alias);

    /**
     *
     * @param nodo hijo
     * @return la relacion padre/hijo
     */
    public Relacion agregarHijo(Nodo nodo, Alias ... alias);

    /**
     *  Devuelve el proximo estado de un arbol cuando se agregue este nodo
     *      siendo vacio el estado actual del arbol
     *
     * @return nombre del proximo estado
     */
    public NameComponent getEvolucionDeUnArbolVacio(Alias ... alias);


    /**
     *  Devuelve el nombre del nodo
     * @return
     */
    public UserInput getNombre(Alias ... alias); // DefaultNodo

    /**
     *  Devuelve el nodo padre del nodo
     * @return
     */
    public Nodo getPadre(Alias ... alias); // DefaultNodo

}
