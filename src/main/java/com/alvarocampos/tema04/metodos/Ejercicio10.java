package com.alvarocampos.tema04.metodos;

import java.util.Scanner;

public class Ejercicio10 {
    public static void multi(int n) {
        for (int i = 1; i <= 10; i--){
            System.out.println(n + " * " + i + " = " + i * n);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        int numero = Integer.parseInt(sc.nextLine());

        multi(numero);
    }
}
