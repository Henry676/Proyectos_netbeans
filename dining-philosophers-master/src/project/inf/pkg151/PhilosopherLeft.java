package project.inf.pkg151;

import static java.lang.Thread.sleep;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import project.inf.pkg151.Fork;

class PhilosopherLeft extends Thread {
    private int number;
    private Fork forkLeft;
    private Fork forkRight;
    private JLabel E1, E2, E3, I, S;

    public PhilosopherLeft(Fork izq, Fork der, int num, JLabel E1, JLabel E2, JLabel E3, JLabel I, JLabel S) {
        forkLeft = izq;
        forkRight = der;
        this.number = num;
        this.E1 = E1;
        this.E2 = E2;
        this.E3 = E3;
        this.I = I;
        this.S = S;
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            E3.setText("waiting");
            I.setIcon(new ImageIcon(getClass().getResource("/Images/wait.gif")));
            S.setIcon(new ImageIcon(getClass().getResource("/Images/red.JPG")));

            forkLeft.decrease();
            this.showMessage("left fork OK");
            try {
                sleep(3000);
            } catch (InterruptedException ex) {
                Logger.getLogger(PhilosopherLeft.class.getName()).log(Level.SEVERE, null, ex);
            }

            this.showMessage("waiting");
            I.setIcon(new ImageIcon(getClass().getResource("/Images/wait.gif")));
            forkRight.decrease();

            this.showMessage("right fork OK");
            try {
                sleep(3000);
            } catch (InterruptedException ex) {
                Logger.getLogger(PhilosopherLeft.class.getName()).log(Level.SEVERE, null, ex);
            }

            I.setIcon(new ImageIcon(getClass().getResource("/Images/eat.gif")));
            this.showMessage("eating");
            S.setIcon(new ImageIcon(getClass().getResource("/Images/green.JPG")));

            try {
                sleep(4000);
            } catch (InterruptedException ex) {
                Logger.getLogger(PhilosopherLeft.class.getName()).log(Level.SEVERE, null, ex);
            }


            this.showMessage("right fork left");
            forkRight.increase();
            try {
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(PhilosopherLeft.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.showMessage("left fork left");
            forkLeft.increase();
            try {
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(PhilosopherLeft.class.getName()).log(Level.SEVERE, null, ex);
            }

            S.setIcon(new ImageIcon(getClass().getResource("/Images/yellow.JPG")));
            I.setIcon(new ImageIcon(getClass().getResource("/Images/sleep.gif")));

            this.showMessage("sleeping");
            try {
                sleep(3000);
            } catch (InterruptedException ex) {
                Logger.getLogger(PhilosopherLeft.class.getName()).log(Level.SEVERE, null, ex);
            }

            I.setIcon(new ImageIcon(getClass().getResource("/Images/think.gif")));

            this.showMessage("thinking");
            try {
                sleep(3000);
            } catch (InterruptedException ex) {
                Logger.getLogger(PhilosopherLeft.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    public void showMessage(String x) {
        String aux1 = E3.getText();
        String aux2 = E2.getText();

        E3.setText(x);
        E2.setText(aux1);
        E1.setText(aux2);

    }
}