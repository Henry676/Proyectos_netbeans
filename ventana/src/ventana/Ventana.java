package ventana;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends JFrame {

    public Ventana() {
        this.setSize(500, 500);
        this.setTitle("Mi Ventana");
        //setLocation(50,50);Establecemos la posicion inicial de la ventana
        //setBounds(250,250,500,500);
        this.setLocationRelativeTo(null);//Establecemos la ventana en el centro
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        JPanel panel = new JPanel();
        this.getContentPane().add(panel);//Agregamos el panel a la ventana
        panel.setBackground(Color.BLUE);
        JLabel etiqueta = new JLabel("Hola");
        panel.add(etiqueta);
    }

}
