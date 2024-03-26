/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebasFilosofos;

/**
 *
 * @author hertz676
 */
public class principalFilosofos {

    public static void main(String[] args) {
        Tenedor t1 = new Tenedor();
        Tenedor t2 = new Tenedor();
        Tenedor t3 = new Tenedor();
        Tenedor t4 = new Tenedor();
        Tenedor t5 = new Tenedor();

        Filosofo f1 = new Filosofo(t1,t5,"izquierda");
        Filosofo f2 = new Filosofo(t2,t1,"derecha");
        Filosofo f3 = new Filosofo(t3,t2,"izquierda");
        Filosofo f4 = new Filosofo(t4,t3,"derecha");
        Filosofo f5 = new Filosofo(t5,t4,"izquierda");
        
        f1.start();
        f2.start();
        f3.start();
        f4.start();
        f5.start();
        
    }
}
