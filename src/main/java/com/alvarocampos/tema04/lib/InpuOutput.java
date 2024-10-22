package com.alvarocampos.tema04.lib;

import java.util.Scanner;

/**
 * InputOuput
 * License: Public Domain
 *
 * @author Germán Gascon: Proffesor at IES la mar in Javea/Xabia <ggascon@gmail.com>
 *     Alvaro Campos Bolufer: Student at IES la mar in Javea/Xabia <alvaro.campos.bolufer.a@gmail.com>
 * @version 0.1, 2024-10-22
 * @since 2024-10-22
 */
public class InpuOutput {
    /**
     * Solicita un texto y valida su longitud este comprendida entre longitudMinima y longitudMaxima
     * @param mensaje Mensaje que se le mostrara al usuario.
     * @param longuitudMinima Numero minimo de caracteres que debe tener el texto.
     * @param longuitudMaxima Numero maximo de caracteres que debe tener el texto.
     * @return El texto leido validado
     */
    public static String solicitarString(String mensaje, int longuitudMinima, int longuitudMaxima){
        Scanner sc = new Scanner(System.in);
        System.out.println(mensaje);
        String nombre="";
    }
}
