package Hilos_y_Arrays;

public class clasePrincipal {

    public static void main(String[] args) {
        Hilos[] array = new Hilos[5];

        for (int i = 0; i < array.length; i++) {//For encargado de crear e inicializar cada hilo
            array[i] = new Hilos(i + 1);//Inicializacion de cada elemento del array
            array[i].start();
            //new Thread(array[i]).start();//Creacion y ejecucion de cada hilo con la interfaz runnable
        }

        try {
            for (int i = 0; i < array.length; i++) {
                array[i].join();//Metodos join sirve para que el hilo principal espere a algun hilo en especifico a que termine de ejecutarse
            }
        } catch (Exception ex) {
        }
        System.out.println("Soy el hilo principal");
    }
}
