package proyecto;

import java.awt.Image;
import java.util.LinkedList;
import java.util.Queue;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class ChefCliente {

    private final int capacidad = 8;
    private Queue<Integer> almacen = new LinkedList<>();
    private JLabel p0, p1, p2, p3, p4, p5, p6, p7, p8, ech, ej, dormir, joeyEsperando;

    public ChefCliente(JLabel p0, JLabel p1, JLabel p2, JLabel p3, JLabel p4, JLabel p5, JLabel p6, JLabel p7, JLabel p8, JLabel ech, JLabel ej, JLabel dormir, JLabel joeyEsperar) {
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
        this.joeyEsperando = joeyEsperar;
    }

    public synchronized void producir() throws InterruptedException {
        int elemento = 0;
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

        while (true) {
            while (almacen.size() == capacidad) {
                System.out.println("Almacen lleno, productor esperando");
                ech.setText("Se lleno la mesa, hora de descansar");
                p0.setIcon(null);
                dormir.setIcon(estadoChef);
                wait();
            }

            // Establece el nuevo ImageIcon en el JLabel
            dormir.setIcon(null);
            p0.setIcon(resizedIcon0);
            ech.setText("Chambeando ando");
            System.out.println("Chef produciendo pizza #" + (elemento + 1));
            elemento++;
            almacen.add(elemento);
            notify();
            Thread.sleep(1000);
            p0.setIcon(null);
            ech.setText("Sirviendo al que le rugen las tripas");
            for (int i = 0; i <= almacen.size(); i++) {
                if ("Sirviendo al que le rugen las tripas".equals(ech.getText()) && i == almacen.size()) {
                    if (p1.getIcon() == null && i == 1) {
                        p1.setIcon(resizedIcon1);
                        Thread.sleep(1500);//Tiempo sirviendo
                        wait();
                    }
                    if (p2.getIcon() == null && i == 2) {
                        p2.setIcon(resizedIcon2);
                        Thread.sleep(1500);//Tiempo sirviendo
                        wait();
                    }

                    if (p3.getIcon() == null && i == 3) {
                        p3.setIcon(resizedIcon3);
                        Thread.sleep(1500);//Tiempo sirviendo
                        wait();

                    }
                    if (p4.getIcon() == null && i == 4) {
                        p4.setIcon(resizedIcon4);
                        Thread.sleep(1500);//Tiempo sirviendo
                        wait();
                    }

                    if (p5.getIcon() == null && i == 5) {
                        p5.setIcon(resizedIcon5);
                        Thread.sleep(1500);//Tiempo sirviendo
                        wait();
                    }

                    if (p6.getIcon() == null && i == 6) {
                        p6.setIcon(resizedIcon6);
                        Thread.sleep(1500);//Tiempo sirviendo
                        wait();
                    }

                    if (p7.getIcon() == null && i == 7) {
                        p7.setIcon(resizedIcon7);
                        Thread.sleep(1500);//Tiempo sirviendo
                        wait();
                    }

                    if (p8.getIcon() == null && i == 8) {
                        p8.setIcon(resizedIcon8);
                        Thread.sleep(1500);//Tiempo sirviendo
                        wait();
                    }
                }
            }
        }
    }//Se agregaron los wait, para hacer que el productor y consumidor se esten ejecutando simultaneamente
    //Si se quitan los waits de los if, el consumidor comera hasta que el almacen este lleno

    public synchronized void consumir() throws InterruptedException {
        ImageIcon esperando = new ImageIcon(getClass().getResource("/imagenes/esperar.gif"));
        ImageIcon comiendo = new ImageIcon(getClass().getResource("/imagenes/comiendo.gif"));

        while (true) {
            while (almacen.isEmpty()) {
                System.out.println("Almacen vacio, consumidor esperando");
                ej.setText("Quiero pizzas");
                joeyEsperando.setIcon(esperando);
                //ej.setIcon(esperando);
                wait();
            }
            int elemento = almacen.poll();
            joeyEsperando.setIcon(null);
            ej.setText("Comiendo muy rico");
            joeyEsperando.setIcon(comiendo);
            System.out.println("Consumidor consume: " + elemento);
            elemento--;
            notify();
            Thread.sleep(2000);
            //ej.setIcon(null);
            for (int i = almacen.size(); i >= almacen.size(); i--) {
                if ("Comiendo muy rico".equals(ej.getText()) && i <= almacen.size()) {

                    if (p1.getIcon() != null && i == 0) {
                        p1.setIcon(null);
                        Thread.sleep(1500);//Tiempo comiendo cada pizza (es gordo)
                    }
                    if (p2.getIcon() != null && i == 1) {
                        p2.setIcon(null);
                        Thread.sleep(1500);//Tiempo sirviendo
                    }

                    if (p3.getIcon() != null && i == 2) {
                        p3.setIcon(null);
                        Thread.sleep(1500);//Tiempo sirviendo

                    }
                    if (p4.getIcon() != null && i == 3) {
                        p4.setIcon(null);
                        Thread.sleep(1500);//Tiempo sirviendo
                    }

                    if (p5.getIcon() != null && i == 4) {
                        p5.setIcon(null);
                        Thread.sleep(1500);//Tiempo sirviendo
                    }

                    if (p6.getIcon() != null && i == 5) {
                        p6.setIcon(null);
                        Thread.sleep(1500);//Tiempo sirviendo
                    }

                    if (p7.getIcon() != null && i == 6) {
                        p7.setIcon(null);
                        Thread.sleep(1500);//Tiempo sirviendo
                    }

                    if (p8.getIcon() != null && i == 7) {
                        p8.setIcon(null);
                        Thread.sleep(1500);//Tiempo sirviendo
                    }
                }
            }
        }
    }
}
