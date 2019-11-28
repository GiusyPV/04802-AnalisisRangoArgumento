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
package org.japo.java.app;

import java.util.Locale;
import java.util.Scanner;
import org.japo.java.libraries.UtilesPrimitivos;

/**
 *
 * @author Josefina Pugliese Vazquez - josefinamilagros.pugliese.alum@iescamp.es
 */
public final class App {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static final String MSG_USR = "Número ......: ";
    public static final String MSG_ERR = "ERROR: Entrada incorrecta";

    public final void launchApp() {
        //Cabecera
        System.out.println("ANÁLISIS DE RANGO");
        System.out.println("=================");

        //Entrada número
        int n = leerNumero(MSG_USR, MSG_ERR);

        //Separador
        System.out.println("---");
        
        //Minimos y máximos
        System.out.printf("Mínimo ......: %.0f%n", UtilesPrimitivos.MIN);
        System.out.printf("Máximo ......: %.0f%n", UtilesPrimitivos.MAX);

        //Separador
        System.out.println("---");
        
        //Salida analisis
        System.out.printf("Análisis ....: %s%n", UtilesPrimitivos.analizarRango(n, UtilesPrimitivos.MIN, UtilesPrimitivos.MAX) );
    }

    //Metodo obtener número de usuario
    public static final double obtener(String msgUsr, String msgErr) {
        double numero = 0;
        boolean errorOK = true;

        do {
            try {

                System.out.print(MSG_USR);
                numero = SCN.nextDouble();
                errorOK = false;

            } catch (Exception e) {
                System.out.println(MSG_ERR);

            } finally {
                SCN.nextLine();
            }

        } while (errorOK);
        return numero;
    }
     public static final int leerNumero(String msgUsr, String msgErr) {
        return (int) obtener(msgUsr, msgErr);
    }

}
