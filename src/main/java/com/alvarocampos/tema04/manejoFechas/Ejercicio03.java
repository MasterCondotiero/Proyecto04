package com.alvarocampos.tema04.manejoFechas;

import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ejercicio03 {

    public enum Planet{
        MERCURIO, VENUS, TIERRA, MARTE, JUPITER, SATURNO, URANO, NEPTUNO
    }

    public static long calculoDias(LocalDate nacimiento){
        LocalDate now = LocalDate.now();
        return ChronoUnit.DAYS.between(nacimiento, now);
    }

    public static double days(Planet planet){
        double orbitDays;
        orbitDays = switch (planet){
            case MERCURIO -> 87.9;
            case VENUS -> 224.7;
            case TIERRA -> 365.25;
            case MARTE -> 687;
            case JUPITER -> 4333;
            case SATURNO -> 10759;
            case URANO -> 30668;
            case NEPTUNO -> 60182;
        };
        return orbitDays;
    }
    public static void main(String args[] ){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu fecha de nacimiento (dd/MM/yyyy):");
        String fechaStr = scanner.nextLine();
        System.out.println("Introduce el planeta");

        for (int i =0; i < Planet.values().length; i++) {
            System.out.println((i +1) + ". " + Planet.values()[i].toString());
        }
        int numPlanet = Integer.parseInt(scanner.nextLine());
        scanner.close();
        Planet planet = Planet.values()[numPlanet -1];
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNacimiento = LocalDate.parse(fechaStr, formatter);
        double year = calculoDias(fechaNacimiento)/days(planet);
        System.out.printf("Tienes %.2f años en " + planet, year);
    }
}
