
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author hertz676
 */
public class Proceso1 extends Thread {//La desventaja de extends es que no se puede implementar en otra clase

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Proceso 1");
        }
        System.out.println("");
    }
}
