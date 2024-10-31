package com.alvarocampos.tema04.recursividad;

import java.util.Scanner;

public class Ejercicio01 {
    public static long regresivo(int n) {
        if (n < 1) {
            return 0;
        } else {
            System.out.println(n);
            return regresivo(n - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        int num = Integer.parseInt(sc.nextLine());

        regresivo(num);
    }
}
