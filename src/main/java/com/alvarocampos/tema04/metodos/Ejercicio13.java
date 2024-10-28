package com.alvarocampos.tema04.metodos;

import java.util.Scanner;

public class Ejercicio13 {
    public static String saludo(String nombre, String idioma) {
        if (idioma.equals("a")) {
            return "Bon dia " + nombre;
        } else if (idioma.equals("b")) {
            return "Buenos dias " + nombre;
        } else if (idioma.equals("c")) {
            return "Good day " + nombre;
        } else {
            return "Manito esto no va";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean valido;

        System.out.print("Hola dime como te llamas: ");
        String nombre = sc.nextLine();
        do {
            System.out.print("Seleccione su idioma de preferencia:\n a)Valenciano\n b)Castellano\n c)Ingles\n");
            String idioma = sc.nextLine();
            valido = idioma.equals("a") || idioma.equals("b") || idioma.equals("c");
            if (!valido) {
                System.out.println(nombre + " el valor de idioma no es valido");
            } else {
                System.out.println(saludo(nombre, idioma));
            }
        } while(!valido);
    }
}
