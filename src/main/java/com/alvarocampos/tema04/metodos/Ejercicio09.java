package com.alvarocampos.tema04.metodos;

import java.util.Scanner;

public class Ejercicio09 {
    public static long sumatorio(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n + sumatorio(n - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        int num = Integer.parseInt(sc.nextLine());

        long resultado = sumatorio(num);
        if (num==-1){
            System.out.println(num + " es un numero negativo, no se puede hacer");
        }
        System.out.println("El sumatorio de " + num + " es: " + resultado);
    }
}
