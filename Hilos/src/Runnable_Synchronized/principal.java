package Runnable_Synchronized;

import java.util.logging.Level;
import java.util.logging.Logger;

public class principal implements Runnable{
    private static int cont=0;
    private static Object obj = new Object();//Clase objet es una clase que todos los objetos creados, van a heredar de dicha clase
    @Override
    public void run() {
        for (int i = 0; i < 20000; i++) {
            synchronized(obj){//Los hilos accederan a las variables de 1 en 1, resolviendo la exclusion mutua
                cont++;//Todo esto es una seccion critica controlada
            }
        }
    }
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        int nNucleos=runtime.availableProcessors();//Ver el numero de nucleos
        Thread[] hilos = new Thread[nNucleos];
        for (int i = 0; i < hilos.length; i++) {
            Runnable runnable = new principal();
            hilos[i]=new Thread(runnable);
            hilos[i].start();
        }
        for (int i = 0; i < hilos.length; i++) {
            try {
                hilos[i].join();
            } catch (InterruptedException ex) {
                Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println(cont);
    }
}
