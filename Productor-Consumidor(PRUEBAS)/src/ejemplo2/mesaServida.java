/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo2;


import java.util.logging.Level;
import java.util.logging.Logger;


public class mesaServida {
    
    private int[] mesa;
    private boolean estaVacio;
    private boolean estaLlena;
    private int siguiente = 0;

    public mesaServida(int size) {
        this.mesa = new int[size];
        this.estaVacio = true;
        this.estaLlena = false;
    }

    public synchronized void producir(int pizza) {
        while (this.estaLlena) {
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(mesaServida.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        mesa[siguiente] = pizza;
        siguiente++;
        this.estaVacio = false;
        if (siguiente == this.mesa.length) {
            System.out.println("Se lleno la mesa,productores esperando");
            this.estaLlena = true;
        }
        notifyAll();
    }

    public synchronized int consumir() {
        while (this.estaVacio) {
            try {
                System.out.println("Consumidor esperando, mesa vacia");
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(mesaServida.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        siguiente--;
        this.estaLlena = false;
        if (siguiente == 0) {
            this.estaVacio = true;
        }
        notifyAll();
        return this.mesa[this.siguiente];
    }
}
