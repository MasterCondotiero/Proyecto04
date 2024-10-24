package com.alvarocampos.tema04.metodos;

import com.alvarocampos.tema04.lib.IO;

public class Ejercicio08 {
    public static boolean esCapicua(int n1, int n2, int n3, int n4) {
        String capicua = "" + n1 + n2 + n3 + n4;
        return capicua.charAt(0) == capicua.charAt(3) && capicua.charAt(1) == capicua.charAt(2);
    }
    public static void main(String[] args) {

        int num = IO.requestInt("Facilite un numero entre 1000 y 9999: ", 1000, 9999);

        int primerDig = num / 1000;
        int segundoDig = (num % 1000) / 100;
        int tercerDig = (num % 100) / 10;
        int cuartoDig = num % 10;

        System.out.println(esCapicua(primerDig, segundoDig, tercerDig, cuartoDig));

    }
}
