/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CicloDeVida_de_un_Hilo;

/**
 *
 * @author hertz676
 */
public class Hilo_Proceso extends Thread {

    public Hilo_Proceso(String nombreHilo){
        super(nombreHilo);
    }
    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(i+" "+getName());
            try {
                Hilo_Proceso.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error dentro de la clase: " + e);
            }
        }
    }
}
