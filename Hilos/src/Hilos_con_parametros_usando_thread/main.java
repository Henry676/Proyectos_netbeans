package Hilos_con_parametros_usando_thread;

public class main {

    public static void main(String[] args) {
        Proceso hilo1 = new Proceso(" Hilo 1");
        Proceso hilo2 = new Proceso(" Hilo 2");
        Proceso hilo3 = new Proceso(" Hilo 3");

        hilo1.tomarValor(5);
        hilo2.tomarValor(10);
        hilo3.tomarValor(5);

        hilo1.start();
        hilo2.start();
        hilo3.start();
    }
}
