package proyecto;

import java.awt.Image;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ChefCliente {

    private final int capacidad = 8;
    private int[] mesa;
    private boolean estaVacio;
    private boolean estaLlena;
    private int siguiente = 0;
    private JLabel p0, p1, p2, p3, p4, p5, p6, p7, p8, ech, ej, dormir, c1, c2, c3, c4, c5, c6, c7, c8;

    public ChefCliente(int size, JLabel p0, JLabel p1, JLabel p2, JLabel p3, JLabel p4, JLabel p5, JLabel p6, JLabel p7, JLabel p8, JLabel ech, JLabel ej, JLabel dormir, JLabel c1, JLabel c2, JLabel c3, JLabel c4, JLabel c5, JLabel c6, JLabel c7, JLabel c8) {
        this.p0 = p0;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
        this.p5 = p5;
        this.p6 = p6;
        this.p7 = p7;
        this.p8 = p8;
        this.ech = ech;
        this.ej = ej;
        this.dormir = dormir;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.c4 = c4;
        this.c5 = c5;
        this.c6 = c6;
        this.c7 = c7;
        this.c8 = c8;

        this.mesa = new int[size];
        this.estaVacio = true;
        this.estaLlena = false;
    }

    public synchronized void producir(int pizza) {
        // Obtén la imagen original
        ImageIcon originalIcon = new ImageIcon(getClass().getResource("/imagenes/producto.png"));
        Image originalImage = originalIcon.getImage();

        ImageIcon pizzaServida = new ImageIcon(getClass().getResource("/imagenes/pizzaservida.png"));
        Image pizzaParaComer = pizzaServida.getImage();

        ImageIcon estadoChef = new ImageIcon(getClass().getResource("/imagenes/dormir.gif"));

        // Obtiene las dimensiones del JLabel
        int labelWidth0 = p0.getWidth();
        int labelWidth1 = p1.getWidth();
        int labelWidth2 = p2.getWidth();
        int labelWidth3 = p3.getWidth();
        int labelWidth4 = p4.getWidth();
        int labelWidth5 = p5.getWidth();
        int labelWidth6 = p6.getWidth();
        int labelWidth7 = p7.getWidth();
        int labelWidth8 = p8.getWidth();

        int labelHeight0 = p0.getHeight();
        int labelHeight1 = p1.getHeight();
        int labelHeight2 = p2.getHeight();
        int labelHeight3 = p3.getHeight();
        int labelHeight4 = p4.getHeight();
        int labelHeight5 = p5.getHeight();
        int labelHeight6 = p6.getHeight();
        int labelHeight7 = p7.getHeight();
        int labelHeight8 = p8.getHeight();

        // Redimensiona la imagen al tamaño del JLabel
        Image resizedImage0 = originalImage.getScaledInstance(labelWidth0, labelHeight0, Image.SCALE_SMOOTH);
        Image resizedImage1 = pizzaParaComer.getScaledInstance(labelWidth1, labelHeight1, Image.SCALE_SMOOTH);
        Image resizedImage2 = pizzaParaComer.getScaledInstance(labelWidth2, labelHeight2, Image.SCALE_SMOOTH);
        Image resizedImage3 = pizzaParaComer.getScaledInstance(labelWidth3, labelHeight3, Image.SCALE_SMOOTH);
        Image resizedImage4 = pizzaParaComer.getScaledInstance(labelWidth4, labelHeight4, Image.SCALE_SMOOTH);
        Image resizedImage5 = pizzaParaComer.getScaledInstance(labelWidth5, labelHeight5, Image.SCALE_SMOOTH);
        Image resizedImage6 = pizzaParaComer.getScaledInstance(labelWidth6, labelHeight6, Image.SCALE_SMOOTH);
        Image resizedImage7 = pizzaParaComer.getScaledInstance(labelWidth7, labelHeight7, Image.SCALE_SMOOTH);
        Image resizedImage8 = pizzaParaComer.getScaledInstance(labelWidth8, labelHeight8, Image.SCALE_SMOOTH);

        // Crea un nuevo ImageIcon con la imagen redimensionada
        ImageIcon resizedIcon0 = new ImageIcon(resizedImage0);
        ImageIcon resizedIcon1 = new ImageIcon(resizedImage1);
        ImageIcon resizedIcon2 = new ImageIcon(resizedImage2);
        ImageIcon resizedIcon3 = new ImageIcon(resizedImage3);
        ImageIcon resizedIcon4 = new ImageIcon(resizedImage4);
        ImageIcon resizedIcon5 = new ImageIcon(resizedImage5);
        ImageIcon resizedIcon6 = new ImageIcon(resizedImage6);
        ImageIcon resizedIcon7 = new ImageIcon(resizedImage7);
        ImageIcon resizedIcon8 = new ImageIcon(resizedImage8);

        while (this.estaLlena) {
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(ChefCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        mesa[siguiente] = pizza;
        siguiente++;
        ech.setText("Chambeando ando");
        if (siguiente == 1) {
            p1.setIcon(resizedIcon1);
        }
        if (siguiente == 2) {
            p2.setIcon(resizedIcon1);
        }
        if (siguiente == 3) {
            p3.setIcon(resizedIcon1);
        }
        if (siguiente == 4) {
            p4.setIcon(resizedIcon1);
        }
        if (siguiente == 5) {
            p5.setIcon(resizedIcon1);
        }
        if (siguiente == 6) {
            p6.setIcon(resizedIcon1);
        }
        if (siguiente == 7) {
            p7.setIcon(resizedIcon1);
        }
        if (siguiente == 8) {
            p8.setIcon(resizedIcon1);
        }
        this.estaVacio = false;
        if (siguiente == this.mesa.length) {
            System.out.println("Se lleno la mesa,productores esperando");
            ech.setText("Clientes satisfechos, hora de descansar");
            this.estaLlena = true;
        }
        notifyAll();
    }

    public synchronized int consumir(int nConsumidor) {
        ImageIcon esperando = new ImageIcon(getClass().getResource("/imagenes/esperar.gif"));
        ImageIcon comiendo = new ImageIcon(getClass().getResource("/imagenes/comiendo.gif"));

        while (this.estaVacio) {
            try {
                ej.setText("Quiero comida");
                System.out.println("Consumidores esperando, mesa vacia");
                if (nConsumidor == 1) {
                    c1.setIcon(esperando);
                }
                if (nConsumidor == 2) {
                    c2.setIcon(esperando);
                }
                if (nConsumidor == 3) {
                    c3.setIcon(esperando);
                }
                if (nConsumidor == 4) {
                    c4.setIcon(esperando);
                }
                if (nConsumidor == 5) {
                    c5.setIcon(esperando);
                }
                if (nConsumidor == 6) {
                    c6.setIcon(esperando);
                }
                if (nConsumidor == 7) {
                    c7.setIcon(esperando);
                }
                if (nConsumidor == 8) {
                    c8.setIcon(esperando);
                }
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(ChefCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        siguiente--;
        ej.setText("Comiendo rico");

        if (nConsumidor == 1) {
            c1.setIcon(comiendo);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ChefCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
            p1.setIcon(null);
        }
        if (nConsumidor == 2) {
            c2.setIcon(comiendo);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ChefCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
            p2.setIcon(null);
        }
        if (nConsumidor == 3) {
            c3.setIcon(comiendo);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ChefCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
            p3.setIcon(null);
        }
        if (nConsumidor == 4) {
            c4.setIcon(comiendo);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ChefCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
            p4.setIcon(null);
        }
        if (nConsumidor == 5) {
            c5.setIcon(comiendo);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ChefCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
            p5.setIcon(null);
        }
        if (nConsumidor == 6) {
            c6.setIcon(comiendo);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ChefCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
            p6.setIcon(null);
        }
        if (nConsumidor == 7) {
            c7.setIcon(comiendo);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ChefCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
            p7.setIcon(null);
        }
        if (nConsumidor == 8) {
            c8.setIcon(comiendo);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ChefCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
            p8.setIcon(null);
        }
        this.estaLlena = false;
        if (siguiente == 0) {
            this.estaVacio = true;
        }
        notifyAll();
        return this.mesa[this.siguiente];
    }
}
