package com.alvarocampos.tema04.metodos;

public class Ejercicio12 {
   /* public enum grades{
        EXCELENTE,
        NOTABLE,
        BIEN,
        SUFICIENTE,
        INSUFICIENTE,
        
    }*/
    public static String grades(double grades){
        if (grades >= 9 && grades <=10) {
            return "EXCELENTE";
        } else if (grades >= 7 && grades < 9) {
            return "NOTABLE";
        } else if (grades >= 6 && grades < 7) {
            return "BIEN";
        } else if (grades >= 5 && grades < 6) {
            return "SUFICIENTE";
        } else {
            return "INSUFICIENTE";
        }
    }

    public static void main(String[] args) {
        double random;
        for (int i = 1; i <=50; i++){
            random = (Math.random()*10);
            System.out.println(random);
            System.out.println(grades(random));
        }
    }
}
