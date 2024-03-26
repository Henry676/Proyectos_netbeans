/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hilos_Indeteterminismo;

/**
 *
 * @author hertz676
 */
public class clasePrincipal {
    public static void main(String[] args) {
        Hilos[] array = new Hilos[1000];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Hilos();
            array[i].start();
        }
        System.out.println(Hilos.getContador());
    }
}
