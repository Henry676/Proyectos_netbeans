/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hertz676
 */
public class main {

    public static void main(String[] args) {
        Proceso1 proceso1 = new Proceso1();
        Proceso1 proceso3 = new Proceso1();
        Thread proceso2 = new Thread(new Proceso2());

        proceso1.start();
        proceso2.start();
        proceso3.start();
    }
}
