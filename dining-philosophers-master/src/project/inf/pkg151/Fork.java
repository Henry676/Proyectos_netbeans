package project.inf.pkg151;

public class Fork {
    private int valor = 1;

    public Fork() {
        valor = 1;
    }

    synchronized void decrease() {
        while (valor <= 0) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        valor--;
    }

    synchronized void increase() {
        valor++;
        notify();
    }

    public int Valor() {
        return valor;
    }
}