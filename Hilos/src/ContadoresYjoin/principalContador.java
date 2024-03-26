/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ContadoresYjoin;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hertz676
 */
public class principalContador {

    public static void main(String[] args) {
        Contador c1 = new Contador("Contador 1", 40);
        Contador c2 = new Contador("Contador 2", 50);
        Contador c3 = new Contador("Contador 3", 20);
        Contador c4 = new Contador("Contador 4", 70);

        Thread hilo1 = new Thread(c1);
        Thread hilo2 = new Thread(c2);
        Thread hilo3 = new Thread(c3);
        Thread hilo4 = new Thread(c4);

        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();

        
        try {
            hilo1.join();
            hilo2.join();
            hilo3.join();
            hilo4.join();
        } catch (InterruptedException e) {
            System.out.println("Error en los join " + e);
        }
        System.out.println("Fin del programa");
    }
}
