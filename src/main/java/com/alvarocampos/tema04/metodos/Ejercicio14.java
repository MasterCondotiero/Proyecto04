package com.alvarocampos.tema04.metodos;

import java.util.Scanner;


public class Ejercicio14 {
    public static long factorial(long n) {
        if (n <0) {
            return n=-1;
        } else if (n != 0) {
            return n * factorial(n - 1);
        } else {
            return n=1;
        }
    }
    public static float Operacion(int n, int m) {
        long resultadoN = factorial(n);
        long resultadoM = factorial(m);
        int resta = n - m;
        long restafactorial = factorial(resta);
        float resultado = (float) resultadoN/(resultadoM * restafactorial);
        return resultado;
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduzca un numero");
        int n = Integer.parseInt(leer.nextLine());
        System.out.println("Introduzca otro numero");
        int m = Integer.parseInt(leer.nextLine());
        leer.close();
        float resultado = Operacion(n,m);
        System.out.println(resultado);
    }
}