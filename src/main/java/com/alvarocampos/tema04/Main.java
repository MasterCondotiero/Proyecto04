package com.alvarocampos.tema04;

import com.alvarocampos.tema04.lib.IO;

public class Main {
    public static void main(String[] args) {
        String nombreProducto = IO.requestString("Indica nombre", 5, 20);
        System.out.println(nombreProducto);

        String comparaDos = IO.compareTwoInt(5,10);
        System.out.println(comparaDos);

        String comparaCuatro = IO.compareFourInt(5,10,8, 340);
        System.out.println(comparaCuatro);


    }
}