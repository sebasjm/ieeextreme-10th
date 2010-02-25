/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.com.sebasjm.ieee.ieeextreme.task10;

import org.testng.annotations.DataProvider;

/**
 *
 * @author sebasjm
 */
public class DatosPrueba {

    @DataProvider(name="valores_consistentes")
    public static Object[][] generarValoresConsistentes(){
        return new Object[][]{
                { new String[]{"hoja"} },
                { new String[]{"?lives in water","?meows","dog","cat","?has gills","dolphin","?flies","herring","flying fish" } }, // ejemplo del ejercio
                { new String[]{"?vive en el agua","?tiene 4 patas","?tiene 4 patas","perro","pajaro","humano","pez" } },
                { new String[]{"?tiene cuatro patas","?tiene respaldo","?es acolchonado","sillon","silla","?apoyas la cola","banqueta","mesa","?tiene 3 patas","tripode","?tiene una pata","mastil","no se" } },
            };
    }

    @DataProvider(name="valores_inconsistentes")
    public static Object[][] generarValoresInconsistentes(){
        return new Object[][]{
                { new String[]{"?lives in water","?meows","?meows","dog","cat","tiger","?has gills","dolphin","?flies","?meows","dog","cat fish","flying fish" } }, // ejemplo del ejercio
                { new String[]{"?vive en el agua","?tiene 4 patas","?tiene 4 patas","perro","pajaro","pajaro","pez" } },
            };
    }

}
