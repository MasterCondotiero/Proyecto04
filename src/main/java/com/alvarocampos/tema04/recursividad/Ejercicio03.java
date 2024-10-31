package com.alvarocampos.tema04.recursividad;

import java.util.Scanner;
public class Ejercicio03 {
    public static int contarDigitos(int n) {
        if (n < 10) {
            return 1;
        } else {
            return 1 + contarDigitos(n / 10);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número entero positivo: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("El número debe ser positivo.");
        } else {
            int resultado = contarDigitos(n);
            System.out.println("El número de dígitos de " + n + " es: " + resultado);
        }

        scanner.close();
    }
}
