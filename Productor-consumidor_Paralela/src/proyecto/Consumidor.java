/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import static java.lang.Thread.sleep;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hertz676
 */
public class Consumidor extends Thread{
    private ChefCliente mesa;
    private Random numAleatorio;
    private int nconsumidor;

    public Consumidor(ChefCliente m,int consumidor) {
        this.mesa = m;
        this.nconsumidor=consumidor;
    }

    @Override
    public void run() {
        while (true) {
            int valor = this.mesa.consumir(nconsumidor);
            try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(ChefCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
            System.out.println("Consumidor "+nconsumidor+" agarro el valor: "+valor);
            try {
                sleep(1500);
            } catch (InterruptedException ex) {
                Logger.getLogger(Consumidor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
