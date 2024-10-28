package com.alvarocampos.tema04.lib;

import java.util.Scanner;

/**
 * InputOuput
 * License: Public Domain
 *
 * @author Alvaro Campos Bolufer: Student at IES la mar in Javea/Xabia <alvaro.campos.bolufer.a@gmail.com>
 * @version 0.1, 2024-10-22
 * @since 2024-10-22
 */
public class IO {
    /**
     * Solicita un texto y valida su longitud este comprendida entre longitudMinima y longitudMaxima
     * @param mensaje Mensaje que se le mostrara al usuario.
     * @param lengthMin Numero minimo de caracteres que debe tener el texto.
     * @param lengthMax Numero maximo de caracteres que debe tener el texto.
     * @return El texto leido validado
     */
    public static String requestString(String mensaje, int lengthMin, int lengthMax){
        String mensajeLeido;
        boolean valido;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println(mensaje);
            mensajeLeido = sc.nextLine();
            valido = mensajeLeido.length() >= lengthMin && mensajeLeido.length() <= lengthMax;
            if (!valido){
                System.err.printf("El dato facilitado debe ser mas largo que [%d] y mas corto que [%d]\n", lengthMax, lengthMin);
            }
        } while (!valido);
        sc.close();

        System.out.println(mensaje);
        return mensajeLeido;
    }
    public static int requestInt(String mensaje, int valorMin, int valorMax){
        int valorLeido;
        boolean valido;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println(mensaje);
            valorLeido = Integer.parseInt(sc.nextLine());
            valido = valorLeido>=valorMin && valorLeido<= valorMax;
            if (!valido){
                System.err.printf("El dato facilitado debe ser menor que [%d] y mayor que [%d]\n", valorMax, valorMin);
            }
        } while (!valido);
        sc.close();

        System.out.println(mensaje);
        return valorLeido;
    }
    /**
     * Solicita dos numeros y confirmar cual es mayor y cual es menor
     * @param x primer numero.
     * @param y segundo numero.
     * @return El texto leido validado
     */
    //Ejerciio03
    public static String compareTwoInt(int x, int y){
        //x = 10;
        //y = 12;
        if (x > y) {
            return x + " es mayor que " + y;
        } else if (y > x) {
            return y + " es mayor que " + x;
        } else {
            return y + " es igual a " + x;
        }
    }
    /**
     * Solicita cuatro numeros y confirmar cual es mayor y cual es menor
     * @param x primer numero.
     * @param y segundo numero.
     * @return El texto leido validado
     */
    //Ejercicio04
    public static String compareFourInt(int x, int y, int n, int m){
        //x=5;
        //y=6;
        //n=12;
        //m=234;

        if (x > y && x > n && x > m) {
            return x + " es el numero mayor";
        } else if (y > x && y > n && y > m) {
            return y + " es el numero mayor";
        } else if (n > x && n > y && n > m){
            return n + " es el numero mayor";
        } else if (m > y && m > n && m > x) {
            return m + " es el numero mayor";
        } else {
            return x + ", " + y + ", " + n + " y " + m + " son todos iguales";
        }
    }
    /**
     * Solicita un texto y valida su longitud este comprendida entre longitudMinima y longitudMaxima
     * @param caracter Caracter que se le mostrara al usuario.
     * @param columns Numero de veces que se mostrara el caracter.
     * @return El texto leido validado
     */
    //Ejercicio05
    public static String repitChar(char caracter, int columns){
        if (columns<=0){
            return null;
            /*
            String resultado = caracter("B",-5)
            if (resultado==null){
             System.err.print("Debes indicar un numero positivo");
            } else {
            System.out.println(resultado);
            }
             */
        }
        String resultado = "";
        for (int i=(columns); i >= 0 ; i--){
            resultado += caracter;
        }
        return resultado;
    }
    /**
     * Solicita un texto y valida su longitud este comprendida entre longitudMinima y longitudMaxima
     * @param caracter Caracter que se le mostrara al usuario.
     * @param columns Numero de veces que se mostrara el caracter.
     * @param rows Numero de veces que se mostrara el caracter por columna.
     * @return El texto leido validado
     */
    public static String repitCharColumn(char caracter, int columns, int rows){
        String resultado="";
        for (int i = 0; i<rows; i++){
            resultado += repitChar(caracter, columns) + "\n";
        }
        return resultado;
    }
    public static long factorial(long n) {
        if (n <0) {
            return n=-1;
        } else if (n != 0) {
            return n * factorial(n - 1);
        } else {
            return n=-2;
        }
    }
}
