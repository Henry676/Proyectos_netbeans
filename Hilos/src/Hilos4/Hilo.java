/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hilos4;

/**
 *
 * @author hertz676
 */
public class Hilo implements Runnable{
    private int id;

    public Hilo(int id) {
        this.id = id;
    }
    
    @Override
    public void run(){
        System.out.println("Este es el hilo: "+id);
    }
}
