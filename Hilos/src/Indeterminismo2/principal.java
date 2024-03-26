/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Indeterminismo2;

import java.util.Random;

/**
 *
 * @author hertz676
 */
public class principal extends Thread {

    private static int tam = 8;
    private static int[] vec = new int[tam];
    
    private int ini, fin;

    public principal(int ini, int fin) {
        this.ini = ini;
        this.fin = fin;
    }
    

    @Override
    public void run() {
        for (int i = ini; i < fin; i++) {//ini=0 y fin=4
            vec[i] = vec[i]*10;
        }
    }

    public static void main(String[] args) {
        Random rand = new Random(System.nanoTime());
        for (int i = 0; i < vec.length; i++) {
            vec[i] = rand.nextInt(10);//Numero random entre 0 y 9
        }
        principal hilo1 = new principal(0,4);
        principal hilo2 = new principal(4,8);
        hilo1.start();
        hilo2.start();
        try {
            hilo1.join();
            hilo2.join();
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        }
        for (int i = 0; i < vec.length; i++) {
            System.out.print(vec[i] + " ");
        }
    }
}
