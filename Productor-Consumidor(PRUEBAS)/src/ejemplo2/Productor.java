/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo2;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hertz676
 */
public class Productor extends Thread {

    private mesaServida mesa;
    private Random numAleatorio;
    private int nProductor;

    public Productor(mesaServida m, int nProductor) {
        this.mesa = m;
        this.numAleatorio = new Random();
        this.nProductor = nProductor;
    }

    @Override
    public void run() {
        while (true) {
            int valor = numAleatorio.nextInt(5) + 1;
            mesa.producir(valor);
            System.out.println("Productor "+ nProductor +" produciendo " + valor);
            try {
                sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Productor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
