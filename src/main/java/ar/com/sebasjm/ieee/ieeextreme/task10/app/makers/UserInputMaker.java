/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.com.sebasjm.ieee.ieeextreme.task10.app.makers;

import ar.com.sebasjm.ieee.ieeextreme.task10.api.system.UserInput;
import ar.com.sebasjm.rigel.core.Alias;
import ar.com.sebasjm.rigel.core.Component;

/**
 *
 * @author sebasjm at computer dot org
 */
public interface UserInputMaker extends Component {

    public UserInput create(String value, Alias ... alias);

}
