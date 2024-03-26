/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sincronizacion_De_hilos;

/**
 *
 * @author hertz676
 */
public class Sincronizacion {

    public static void main(String[] args) {
        Hilo1 hilo1 = new Hilo1();
        Hilo2 hilo2 = new Hilo2();
        Hilo3 hilo3 = new Hilo3();
        Hilo4 hilo4 = new Hilo4();
        
        hilo1.start();
        try{//Paso 1 para lograr la sincronizacion de hilos: Bloquear temporalmente cada hilo (incluyendo las clases hilos)
            hilo1.sleep(10);
        }catch(InterruptedException e){
            System.out.println("Error en hilo1 "+e);
        }
        hilo2.start();
        try{
            hilo2.sleep(10);
        }catch(InterruptedException e){
            System.out.println("Error en hilo2 "+e);
        }
        hilo3.start();
        try{
            Hilo3.sleep(10);
        }catch(InterruptedException e){
            System.out.println("Error en Hilo3 "+e);
        }
        hilo4.start();
        try{
            Hilo4.sleep(10);
        }catch(InterruptedException e){
            System.out.println("Error en Hilo4 "+e);
        }
    }
}
