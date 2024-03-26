/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebasFilosofos;

import java.util.LinkedList;
import java.util.Queue;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hertz676
 */
public class Tenedor {
    private int valor = 1;
    
    
    public void disminuir(){//Funcion para soltar el tenedor
        while(valor <= 0){
            try {
                System.out.println("Filosofo esperando");
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Tenedor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("Filosofo agarro el tenedor");
        valor--;
    }
    
    public void aumentar(){//Funcion para agarrar el tenedor y notificar a los demas hilos que ya esta disponible, que salgan de su estado wait
        valor++;
        notify();
    }
    public int valor(){
        return valor;
    }
}
