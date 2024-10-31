package com.alvarocampos.tema04.recursividad;

import java.util.Scanner;
public class Ejercicio02 {
    public static int sumarHastaN(int n) {
        if (n <= 1) {
            return n;
        } else {
            System.out.println(n);
            return n + sumarHastaN(n - 1);

        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un numero: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("El numero debe ser positivo.");
        } else {
            int resultado = sumarHastaN(n);
            System.out.println("La suma de todos los numeros hasta " + n + " es: " + resultado);
        }

        scanner.close();
    }
}
