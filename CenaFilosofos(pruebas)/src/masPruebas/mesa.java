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
public class mesa {//Monitor que gestione los wait y notify

    private boolean[] tenedores;

    public mesa(int numtenedores) {
        this.tenedores = new boolean[numtenedores];//array de 5 posiciones, donde estaran los 5 tenedores
    }

    public int tenedorIzq(int i) {//i es el filosofo
        return i; //si i es el filosofo 1, se va a agarrar el tenedor que esta en su izq [tenedor1]
    }

    public int tenedorDer(int i) {
        if (i == 0) {//0 = filosofo 1, indice 0
            return this.tenedores.length - 1; //regresa el indice del tenedor correspondiente, en este caso es el indice 4 que tendria el tenedor 5
        } else {
            return i - 1;
        }
    }

    public synchronized void agarrarTenedores(int indiceFilosofo) {
        while (tenedores[tenedorIzq(indiceFilosofo)] || tenedores[tenedorDer(indiceFilosofo)]) {//Si el tenedor de la izquierda o derecha estan ocupados, el filosofo esperara
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(mesa.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        tenedores[tenedorIzq(indiceFilosofo)] = true;//Se indica que ya se han tomado los tenedores
        tenedores[tenedorDer(indiceFilosofo)] = true;
    }
    
    public synchronized void dejarTenedores(int indiceFilosofo){
        tenedores[tenedorIzq(indiceFilosofo)] = false;//Se indica que ya se soltaron los tenedores
        tenedores[tenedorDer(indiceFilosofo)] = false;
        notifyAll();//El hilo o filosofo, notifica a todos los demas hilos que estaban esperando, salgan de su estado e intenten agarrar tenedores
    }
}
