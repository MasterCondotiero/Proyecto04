package com.alvarocampos.tema04.manejoFechas;

import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.Period;


public class Ejercicio01 {

    public static int calculoEdad(LocalDate nacimiento) {
        LocalDate now = LocalDate.now();
        Period time = Period.between(nacimiento, now);
        return time.getYears();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime tu fecha de nacimiento (dd/MM/yyyy)");
        String dateText = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNacimiento = LocalDate.parse(dateText, formatter);
        System.out.printf("Tienes %d años\n ", calculoEdad(fechaNacimiento));
        sc.close();
    }
}
