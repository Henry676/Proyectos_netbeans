/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hilos4;

/**
 *
 * @author hertz676
 */
public class principalHilos4 {

    public static void main(String[] args) {
        Hilo hilo1 = new Hilo(1);
        Hilo hilo2 = new Hilo(2);
        Hilo hilo3 = new Hilo(3);
        Hilo hilo4 = new Hilo(4);
        Hilo hilo5 = new Hilo(5);

        Thread miHilo1 = new Thread(hilo1);
        Thread miHilo2 = new Thread(hilo2);
        Thread miHilo3 = new Thread(hilo3);
        Thread miHilo4 = new Thread(hilo4);
        Thread miHilo5 = new Thread(hilo5);

        miHilo1.start();
        miHilo2.start();
        miHilo3.start();
        miHilo4.start();
        miHilo5.start();
        
        System.out.println("Este es el hilo principal");

    }
}
