package com.alvarocampos.tema04.metodos;

import java.util.Scanner;

public class Ejercicio07 {
    public static long factorial(int n) {
        if (n <0) {
            return n=-1;
        } else if (n != 0) {
            return n * factorial(n - 1);
        } else {
            return n=-2;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        int numero = Integer.parseInt(sc.nextLine());

        long resultado = factorial(numero);
        System.out.println("El factorial de " + numero + " es: " + resultado);
    }
}
