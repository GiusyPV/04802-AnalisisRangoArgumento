/*
 * Copyright 2019 Josefina Pugliese Vazquez - josefinamilagros.pugliese.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.libraries;

/**
 *
 * @author Josefina Pugliese Vazquez - josefinamilagros.pugliese.alum@iescamp.es
 */
public class UtilesPrimitivos {
    
    //Constantes minimo, máximo y número
    public static final double NUM = 0;
    public static final double MIN = 1;
    public static final double MAX = 10;
    
    //Constantes switch
    public static final String DENTRO = "DENTRO";
    public static final String FUERA_ABAJO = "FUERA ( Abajo )";
    public static final String FUERA_ARRIBA = "FUERA ( Arriba )";

    public static final String analizarRango(double num, double min, double max) {

        String test;

        if (num < min) {
            test = FUERA_ABAJO;
        } else if (num <= max) {
            test = DENTRO;
        } else {
            test = FUERA_ARRIBA;
        }

        return test;
    }
}
