package com.alvarocampos.tema04.metodos;

import java.util.Scanner;

public class Ejercicio10 {
    public static void multi(int n) {
        for (int i = 1; i <= 10; i++){
            int total = i*n;
            System.out.println(n + " * " + i + " = " + total);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero=1;

        while (numero>0){
            System.out.println("Ingresa un numero: ");
            numero = Integer.parseInt(sc.nextLine());
            if (numero>0){
                multi(numero);
            } else {
                System.out.println("El numero era negativo, no se ha podido mostrar la tabla de ese numero");
            }
        }
    }
}
