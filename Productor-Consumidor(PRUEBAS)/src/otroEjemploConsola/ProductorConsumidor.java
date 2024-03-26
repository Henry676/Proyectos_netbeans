/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package otroEjemploConsola;

import java.util.LinkedList;
import java.util.Queue;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hertz676
 */
public class ProductorConsumidor {

    private final int capacidad = 5;
    private Queue<Integer> almacen = new LinkedList<>();

    public synchronized void producir() throws InterruptedException {
        int elemento = 0;
        while (true) {
            while (almacen.size() == capacidad) {
                System.out.println("Almacen lleno, productor esperando");
                wait();
            }
            System.out.println("Productor produce: " + (elemento + 1));
            elemento++;
            almacen.add(elemento);
            notify();
            Thread.sleep(1000);
        }
    }

    public synchronized void consumir() throws InterruptedException {
        while (true) {
            while (almacen.isEmpty()) {
                System.out.println("Almacen vacio, consumidor esperando");
                wait();
            }
            int elemento = almacen.poll();
            System.out.println("Consumidor consume: " + elemento);
            elemento--;
            notify();
            Thread.sleep(1000);
        }
    }

    public static void main(String[] args) {
        ProductorConsumidor pc = new ProductorConsumidor();
        Thread productor1 = new Thread(() -> {
            try {
                pc.producir();
            } catch (InterruptedException ex) {
                Logger.getLogger(ProductorConsumidor.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        Thread productor2 = new Thread(() -> {
            try {
                pc.producir();
            } catch (InterruptedException ex) {
                Logger.getLogger(ProductorConsumidor.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        Thread productor3 = new Thread(() -> {
            try {
                pc.producir();
            } catch (InterruptedException ex) {
                Logger.getLogger(ProductorConsumidor.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        Thread productor4 = new Thread(() -> {
            try {
                pc.producir();
            } catch (InterruptedException ex) {
                Logger.getLogger(ProductorConsumidor.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        Thread productor5 = new Thread(() -> {
            try {
                pc.producir();
            } catch (InterruptedException ex) {
                Logger.getLogger(ProductorConsumidor.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
               

        Thread consumidor1 = new Thread(() -> {
            try {
                pc.consumir();
            } catch (InterruptedException ex) {
                Logger.getLogger(ProductorConsumidor.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        Thread consumidor2 = new Thread(() -> {
            try {
                pc.consumir();
            } catch (InterruptedException ex) {
                Logger.getLogger(ProductorConsumidor.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        Thread consumidor3 = new Thread(() -> {
            try {
                pc.consumir();
            } catch (InterruptedException ex) {
                Logger.getLogger(ProductorConsumidor.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        Thread consumidor4 = new Thread(() -> {
            try {
                pc.consumir();
            } catch (InterruptedException ex) {
                Logger.getLogger(ProductorConsumidor.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        Thread consumidor5 = new Thread(() -> {
            try {
                pc.consumir();
            } catch (InterruptedException ex) {
                Logger.getLogger(ProductorConsumidor.class.getName()).log(Level.SEVERE, null, ex);
            }
        });

        productor1.start();
        productor2.start();
        productor3.start();
        productor4.start();
        productor5.start();
        consumidor1.start();
        consumidor2.start();
        consumidor3.start();
        consumidor4.start();
        consumidor5.start();

    }

}
