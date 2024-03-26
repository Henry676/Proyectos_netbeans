/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo2;

/**
 *
 * @author hertz676
 */
public class principal {

    public static void main(String[] args) {
        mesaServida m = new mesaServida(8);
        Productor p1 = new Productor(m, 1);
        Productor p2 = new Productor(m, 2);
        Productor p3 = new Productor(m, 3);
        Productor p4 = new Productor(m, 4);
        Productor p5 = new Productor(m, 5);
        Productor p6 = new Productor(m, 6);

        Consumidor c1 = new Consumidor(m, 1);
        Consumidor c2 = new Consumidor(m, 2);
        Consumidor c3 = new Consumidor(m, 3);
        Consumidor c4 = new Consumidor(m, 4);
        Consumidor c5 = new Consumidor(m, 5);
        Consumidor c6 = new Consumidor(m, 6);

        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
        p6.start();
        c1.start();
        c2.start();
        c3.start();
        c4.start();
        c5.start();
        c6.start();

    }
}
