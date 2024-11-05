package com.alvarocampos.tema04.manejoFechas;
import java.util.Timer;
import java.util.TimerTask;

public class Ejercicio06 {

    public static void main(String[] args) throws InterruptedException {
        Timer timer = new Timer();
            timer.scheduleAtFixedRate(new TimerTask() {
                @Override
                public void run() {
                    System.out.println("Hola mundo");
                }
            }, 0, 1000);
            Thread.sleep(4000);
            timer.cancel();
    }
}
