/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sincronizacion_De_hilos;

/**
 *
 * @author hertz676
 */
public class Hilo4 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("K");
            try {
                Hilo4.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error en la clase hilo4 " + e);
            }
        }
    }
}