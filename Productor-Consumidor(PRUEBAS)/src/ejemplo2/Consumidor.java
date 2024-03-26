/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo2;

import static java.lang.Thread.sleep;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hertz676
 */
public class Consumidor extends Thread{
    private mesaServida mesa;
    private Random numAleatorio;
    private int numConsumidor;

    public Consumidor(mesaServida m,int consumidor) {
        this.mesa = m;
        this.numConsumidor = consumidor;
    }

    @Override
    public void run() {
        while (true) {
            int valor = this.mesa.consumir();
            System.out.println("Consumidor "+numConsumidor+" agarro el valor: "+valor);
            try {
                sleep(1500);
            } catch (InterruptedException ex) {
                Logger.getLogger(Consumidor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
