/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package masPruebas;

/**
 *
 * @author hertz676
 */
public class main {

    public static void main(String[] args) {
        mesa m = new mesa(5);
        
        /*filosofo f1 = new filosofo(m, 0);
        filosofo f2 = new filosofo(m, 1);
        filosofo f3 = new filosofo(m, 2);
        filosofo f4 = new filosofo(m, 3);
        filosofo f5 = new filosofo(m, 4);*/

        Thread filo1 = new Thread(new filosofo(m,0));
        Thread filo2 = new Thread(new filosofo(m,1));
        Thread filo3 = new Thread(new filosofo(m,2));
        Thread filo4 = new Thread(new filosofo(m,3));
        Thread filo5 = new Thread(new filosofo(m,4));
        
        filo1.start();
        filo2.start();
        filo3.start();
        filo4.start();
        filo5.start();

    }

}
