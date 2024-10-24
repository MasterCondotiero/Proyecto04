package com.alvarocampos.tema04.metodos;

import java.util.Scanner;

public class Ejercicio10 {
    public static int multi(int n) {
        for (int i = 1; i <= 10; i--){
            return n * multi(+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        int numero = Integer.parseInt(sc.nextLine());

        int resultado = multi(numero);
        System.out.println("La tabla de multiplicar de " + numero + " es: " + resultado);
    }
}
