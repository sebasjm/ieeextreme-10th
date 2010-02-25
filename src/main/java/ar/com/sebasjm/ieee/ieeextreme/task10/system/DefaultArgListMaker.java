/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.com.sebasjm.ieee.ieeextreme.task10.system;

import ar.com.sebasjm.ieee.ieeextreme.task10.app.makers.UserInputMaker;
import ar.com.sebasjm.ieee.ieeextreme.task10.app.makers.ArgListMaker;
import ar.com.sebasjm.ieee.ieeextreme.task10.api.system.UserInput;
import ar.com.sebasjm.rigel.core.metadata.Interfaces;
import ar.com.sebasjm.rigel.core.metadata.Name;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sebasjm at computer dot org
 */
@Name(DefaultArgListMaker.class)
@Interfaces({
    @Name(ArgListMaker.class)
})
public class DefaultArgListMaker {

    public DefaultArgListMaker() {

    }

    public Iterable<UserInput> create(UserInputMaker userInputMaker) {
        try {
            BufferedReader bis = new BufferedReader( new InputStreamReader(System.in) );
            String linea = null;
            List<UserInput> instance = new ArrayList<UserInput>();
            while ((linea = bis.readLine()) != null) {
                instance.add( userInputMaker.create(linea) );
            }
            return instance;
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

}
