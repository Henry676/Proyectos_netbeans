/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hilos2;
//Hilos con parametros usando implements runnable
/**
 *
 * @author hertz676
 */
public class principalHilos2 {
    
    public static void main(String[] args) {
        
        Proceso1 hilo1_proceso1 = new Proceso1();
        hilo1_proceso1.tomarValor(5);
        
        Proceso1 hilo2_proceso1 = new Proceso1();
        hilo2_proceso1.tomarValor(10);
        
        Thread hilo1 = new Thread(hilo1_proceso1);
        Thread hilo2 = new Thread(hilo2_proceso1);
        
        hilo1.start();
        hilo2.start();
    }
}
