package com.alvarocampos.tema04.manejoFechas;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ejercicio07 {
    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaCalculada = LocalDateTime.now().format(formatter);

        mostrarMenuUno(fechaCalculada);

    }
    public static void mostrarMenuUno(String fechaCalculada) {
        Scanner sc = new Scanner(System.in);
        boolean salida = true;

        while (salida){
            System.out.printf("**********************************\n" + "*** FECHA CALCULADA:" + fechaCalculada + " ***\n" + "**********************************\n");
            System.out.println("1. Modificar fecha calculada\n" + "2. Operaciones...\n" + "------------------------------------------\n" + "0. Salir del programa\n");
            String opcion = sc.nextLine();
            System.out.println();

            switch (opcion) {
                case "1" -> {
                    System.out.println("Ingrese la nueva fecha (dd/mm/aaaa): ");
                    fechaCalculada = sc.nextLine();
                }
                case "2" -> {
                    System.out.println("Operaciones..");
                    mostrarMenuDos(fechaCalculada);
                }
                case "0" -> {
                    System.out.println("Saliendo del programa...");
                    salida = false;
                }
                default -> {
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
                }
            }
        }
    }
    public static void mostrarMenuDos(String fechaCalculada) {
        Scanner sc= new Scanner(System.in);
        boolean volver = true;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fecha = LocalDate.parse(fechaCalculada, formatter);

        while (volver){
            System.out.printf("**********************************\n" + "*** OPERACIONES ***\n" + "*** FECHA CALCULADA:" + fecha + " ***\n" + "**********************************\n");
            System.out.println("1. Sumar anyos\n" + "2. Sumar meses\n" + "3. Sumar dias\n" + "4. Restar anyos\n" + "5. Restar meses\n" + "6. Restar dias\n" + "------------------------------------------\n" + "0. Volver al menú principal\n");
            String opcion = sc.nextLine();
            System.out.println();

            switch (opcion) {
                case "1" -> {
                    System.out.print("Ingrese la cantidad de años a sumar: ");
                    int anos = Integer.parseInt(sc.nextLine());
                    fecha = fecha.plusYears(anos);
                    fechaCalculada = fecha.format(formatter);
                }
                case "2" -> {
                    System.out.print("Ingrese la cantidad de meses a sumar: ");
                    int meses = Integer.parseInt(sc.nextLine());
                    fecha = fecha.plusMonths(meses);
                    fechaCalculada = fecha.format(formatter);
                }
                case "3" -> {
                    System.out.print("Ingrese la cantidad de días a sumar: ");
                    int dias = Integer.parseInt(sc.nextLine());
                    fecha = fecha.plusDays(dias);
                    fechaCalculada = fecha.format(formatter);
                }
                case "4" -> {
                    System.out.print("Ingrese la cantidad de años a restar: ");
                    int anos = Integer.parseInt(sc.nextLine());
                    fecha = fecha.minusYears(anos);
                    fechaCalculada = fecha.format(formatter);
                }
                case "5" -> {
                    System.out.print("Ingrese la cantidad de meses a restar: ");
                    int meses = Integer.parseInt(sc.nextLine());
                    fecha = fecha.minusMonths(meses);
                    fechaCalculada = fecha.format(formatter);
                }
                case "6" -> {
                    System.out.print("Ingrese la cantidad de días a restar: ");
                    int dias = Integer.parseInt(sc.nextLine());
                    fecha = fecha.minusDays(dias);
                    fechaCalculada = fecha.format(formatter);
                }
                case "0" -> {
                    volver = false;
                }
                default -> {
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
                }
            }
        }
    }
}

