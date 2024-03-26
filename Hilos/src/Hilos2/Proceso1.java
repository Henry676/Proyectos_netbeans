package Hilos2;

public class Proceso1 implements Runnable {

    int num_entero;

    public void tomarValor(int num_entero) {
        this.num_entero = num_entero;
    }

    @Override
    public void run() {
        for (int i = 0; i < num_entero; i++) {
            System.out.println(i);
        }
        System.out.println("");
    }

}
