/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cenaFilosofos;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author hertz676
 */
public class Filosofo extends Thread {

    private Mesa mesa;
    private int filosofo;
    private int indiceFilosofo;
    private JLabel ef1, ef2, ef3, ef4, ef5;

    public Filosofo(Mesa m, int filosofo, JLabel ef1, JLabel ef2, JLabel ef3, JLabel ef4, JLabel ef5) {
        this.mesa = m;
        this.filosofo = filosofo;
        this.indiceFilosofo = filosofo - 1;
        this.ef1 = ef1;
        this.ef2 = ef2;
        this.ef3 = ef3;
        this.ef4 = ef4;
        this.ef5 = ef5;
    }

    @Override
    public void run() {
        ImageIcon durmiendo = new ImageIcon(getClass().getResource("/Imagenes/durmiendo.gif"));
        while (true) {
            this.pensando();
            this.mesa.agarrarTenedores(indiceFilosofo);
            this.comiendo();
            if (filosofo == 1) {
                ef1.setIcon(durmiendo);
            }
            if (filosofo == 2) {
                ef2.setIcon(durmiendo);
            }
            if (filosofo == 3) {
                ef3.setIcon(durmiendo);
            }
            if (filosofo == 4) {
                ef4.setIcon(durmiendo);
            }
            if (filosofo == 5) {
                ef5.setIcon(durmiendo);
            }
            try {
                sleep(4000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Filosofo.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Filosofo " + filosofo + " deja de comer, tenedores libres: " + (this.mesa.tenedorIzq(this.indiceFilosofo) + 1) + ", " + (this.mesa.tenedorDer(this.indiceFilosofo) + 1));
            this.mesa.dejarTenedores(indiceFilosofo);
        }
    }

    public void pensando() {
        ImageIcon pensando = new ImageIcon(getClass().getResource("/Imagenes/pensando.gif"));
        System.out.println("Filosofo " + filosofo + " esta pensando");
        if (filosofo == 1) {
            ef1.setIcon(pensando);
        }
        if (filosofo == 2) {
            ef2.setIcon(pensando);
        }
        if (filosofo == 3) {
            ef3.setIcon(pensando);
        }
        if (filosofo == 4) {
            ef4.setIcon(pensando);
        }
        if (filosofo == 5) {
            ef5.setIcon(pensando);
        }
        try {
            sleep(3000);
        } catch (InterruptedException ex) {
        }
    }

    public void comiendo() {
        ImageIcon comiendo = new ImageIcon(getClass().getResource("/Imagenes/comiendo.gif"));
        System.out.println("Filosofo " + filosofo + " esta comiendo");
        if (filosofo == 1) {
            ef1.setIcon(comiendo);
        }
        if (filosofo == 2) {
            ef2.setIcon(comiendo);
        }
        if (filosofo == 3) {
            ef3.setIcon(comiendo);
        }
        if (filosofo == 4) {
            ef4.setIcon(comiendo);
        }
        if (filosofo == 5) {
            ef5.setIcon(comiendo);
        }
        try {
            sleep(4000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Filosofo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
