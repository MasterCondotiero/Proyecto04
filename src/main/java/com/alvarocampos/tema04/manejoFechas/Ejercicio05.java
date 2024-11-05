package com.alvarocampos.tema04.manejoFechas;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Ejercicio05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la fecha y hora de salida (dd/MM/yyyy HH:mm:ss): ");
        String fechaSalidaStr = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime fechaSalida = LocalDateTime.parse(fechaSalidaStr, formatter);

        System.out.print("Ingrese la velocidad de la nave en km/h: ");
        double velocidad = scanner.nextDouble();
        scanner.close();

        calcularYMostrarFechaLlegada(fechaSalida, velocidad, formatter);
    }

    /**
     *
     * @param fechaSalida   Fecha y hora de salida de la nave desde la Tierra.
     * @param velocidad     Velocidad de la nave en km/h.
     * @param formatter     Formato de fecha y hora.
     */
    public static void calcularYMostrarFechaLlegada(LocalDateTime fechaSalida, double velocidad, DateTimeFormatter formatter) {
        final double DISTANCIAMARTETIERRA = 225000000;
        double tiempoTotalHoras = DISTANCIAMARTETIERRA / velocidad;


        long dias = (long) (tiempoTotalHoras / 24);
        long horas = (long) (tiempoTotalHoras % 24);
        long minutos = (long) ((tiempoTotalHoras * 60) % 60);
        long segundos = (long) ((tiempoTotalHoras * 3600) % 60);

        // Calcular la fecha y hora estimada de llegada
        LocalDateTime fechaLlegada = fechaSalida.plus((long) tiempoTotalHoras, ChronoUnit.HOURS) //fechaSalida.plus(...) toma fechaSalida y le va sumando en secuencia, las horas, minutos y segundos necesarios para calcular la fecha de llegada.
                .plus((long) ((tiempoTotalHoras * 60) % 60), ChronoUnit.MINUTES)
                .plus((long) ((tiempoTotalHoras * 3600) % 60), ChronoUnit.SECONDS);

        // Mostrar los resultados
        System.out.println("\n--- Resultado del viaje ---");
        System.out.printf("Tiempo total de viaje: %d días, %d horas, %d minutos y %d segundos%n", dias, horas, minutos, segundos);
        System.out.println("Fecha y hora estimada de llegada a Marte: " + fechaLlegada.format(formatter));
    }

}
