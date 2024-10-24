package com.alvarocampos.tema04.lib;
/**
 * Scanner
 * License: Public Domain
 *
 * @author Alvaro Campos Bolufer: Student at IES la mar in Javea/Xabia <alvaro.campos.bolufer.a@gmail.com>
 * @version 0.1, 2024-10-22
 * @since 2024-10-22
 */
public class Scanner {

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void dispose(){
        scanner.close();
    }
}
