/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hilos_Indeteterminismo;

/**
 *
 * @author hertz676
 */
public class Hilos extends Thread{
    private static int contador=0;
    
    @Override
    public void run(){
        for (int i = 0; i < 1000; i++) {
            contador++;
        }
    }
    public static int getContador(){
        return contador;
    }
}
