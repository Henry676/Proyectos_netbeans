/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cenaFilosofos;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Mesa {

    private JLabel ef1, ef2, ef3, ef4, ef5;
    //Paso 1: declarar array booleano para tenedores
    private boolean[] tenedores;

    public Mesa(int numtenedores, JLabel ef1, JLabel ef2, JLabel ef3, JLabel ef4, JLabel ef5) {
        this.tenedores = new boolean[numtenedores];//array de 5 posiciones, donde estaran los 5 tenedores
        this.ef1 = ef1;
        this.ef2 = ef2;
        this.ef3 = ef3;
        this.ef4 = ef4;
        this.ef5 = ef5;
    }

    public int tenedorIzq(int i) {//i es el indice del filosofo
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
                ImageIcon esperando = new ImageIcon(getClass().getResource("/Imagenes/esperando.gif"));
                if (indiceFilosofo == 0) {
                    ef1.setIcon(esperando);
                }
                if (indiceFilosofo == 1) {
                    ef2.setIcon(esperando);
                }
                if (indiceFilosofo == 2) {
                    ef3.setIcon(esperando);
                }
                if (indiceFilosofo == 3) {
                    ef4.setIcon(esperando);
                }
                if (indiceFilosofo == 4) {
                    ef5.setIcon(esperando);
                }
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Mesa.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        tenedores[tenedorIzq(indiceFilosofo)] = true;//Se indica que ya se han tomado los tenedores
        tenedores[tenedorDer(indiceFilosofo)] = true;
    }

    public synchronized void dejarTenedores(int indiceFilosofo) {
        tenedores[tenedorIzq(indiceFilosofo)] = false;//Se indica que ya se soltaron los tenedores
        tenedores[tenedorDer(indiceFilosofo)] = false;
        notifyAll();//El hilo o filosofo que termino su procesamiento, notifica a todos los demas hilos que estaban esperando, salgan de su estado e intenten agarrar tenedores
    }
}
