/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CicloDeVida_de_un_Hilo;

/**
 *
 * @author hertz676
 */
public class EstadosHilo {

    public static void main(String[] args) {
        Hilo_Proceso hilo1 = new Hilo_Proceso("Hilo 1");//Primer estado (new), no esta en ejecucion pero está creado
        Hilo_Proceso hilo2 = new Hilo_Proceso("Hilo 2");//Primer estado (new)

        hilo1.start();//Segundo estado (start), aqui se manda a ejecutar el hilo //1000 ms = 1 segundo

        try {
            hilo1.sleep(1000);//Tercer estado (sleep), el hilo se encuentra en ejecucion pero hay una tarea o actividad del mismo hilo que lo impide
        } catch (InterruptedException e) {
            System.out.println("Error en el hilo1 " + e);
        }

        hilo2.start();
        hilo2.stop();//Cuarto estado: Muerte o detencion forzosa de un hilo, aqui matamos el proceso
        try {
            hilo2.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Error en el hilo2 " + e);
        }
    }
}
