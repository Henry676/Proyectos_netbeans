/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package masPruebas;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hertz676
 */
public class filosofo extends Thread {

    private mesa mesa;
    private int filosofo;
    private int indiceFilosofo;

    public filosofo(mesa m, int filosofo) {
        this.filosofo = filosofo;
        this.mesa = m;
        this.indiceFilosofo = filosofo - 1;
    }

    @Override
    public void run() {
        while (true) {
            this.pensando();
            this.mesa.agarrarTenedores(indiceFilosofo);
            this.comiendo();
            System.out.println("Filosofo " + filosofo + " deja de comer, tenedores libres: " + (this.mesa.tenedorIzq(this.indiceFilosofo) + 1) + ", " + (this.mesa.tenedorDer(this.indiceFilosofo) + 1));
            this.mesa.dejarTenedores(indiceFilosofo);
        }
    }

    public void pensando() {
        System.out.println("Filosofo " + filosofo + " esta pensando");
        try {
            sleep((long) Math.random() * 4000);
        } catch (InterruptedException ex) {
        }
    }

    public void comiendo() {
        System.out.println("Filosofo " + filosofo + " esta comiendo");
    }

}
