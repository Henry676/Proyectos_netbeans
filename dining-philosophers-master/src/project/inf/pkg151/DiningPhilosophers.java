package project.inf.pkg151;

import javax.swing.ImageIcon;

import project.inf.pkg151.Fork;

public class DiningPhilosophers extends javax.swing.JFrame {

    public DiningPhilosophers() {
        initComponents();

        F.setIcon(new ImageIcon(getClass().getResource("/Images/background.JPG")));

        I1.setIcon(new ImageIcon(getClass().getResource("/Images/think.gif")));
        I2.setIcon(new ImageIcon(getClass().getResource("/Images/think.gif")));
        I3.setIcon(new ImageIcon(getClass().getResource("/Images/think.gif")));
        I4.setIcon(new ImageIcon(getClass().getResource("/Images/think.gif")));
        I5.setIcon(new ImageIcon(getClass().getResource("/Images/think.gif")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        E11 = new javax.swing.JLabel();
        E12 = new javax.swing.JLabel();
        E13 = new javax.swing.JLabel();
        B1 = new javax.swing.JButton();
        I1 = new javax.swing.JLabel();
        S1 = new javax.swing.JLabel();
        I2 = new javax.swing.JLabel();
        S2 = new javax.swing.JLabel();
        E21 = new javax.swing.JLabel();
        E22 = new javax.swing.JLabel();
        E23 = new javax.swing.JLabel();
        I3 = new javax.swing.JLabel();
        S3 = new javax.swing.JLabel();
        E31 = new javax.swing.JLabel();
        E32 = new javax.swing.JLabel();
        E33 = new javax.swing.JLabel();
        I4 = new javax.swing.JLabel();
        S4 = new javax.swing.JLabel();
        E41 = new javax.swing.JLabel();
        E42 = new javax.swing.JLabel();
        E43 = new javax.swing.JLabel();
        I5 = new javax.swing.JLabel();
        S5 = new javax.swing.JLabel();
        E51 = new javax.swing.JLabel();
        E52 = new javax.swing.JLabel();
        E53 = new javax.swing.JLabel();
        F = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        E11.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        E11.setForeground(new java.awt.Color(255, 255, 255));
        E11.setText(".");
        getContentPane().add(E11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, 140, 40));

        E12.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        E12.setForeground(new java.awt.Color(255, 255, 255));
        E12.setText(".");
        getContentPane().add(E12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 620, 140, 40));

        E13.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        E13.setForeground(new java.awt.Color(255, 255, 255));
        E13.setText(".");
        getContentPane().add(E13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 660, 140, 40));

        B1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        B1.setText("Start");
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });
        getContentPane().add(B1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 120, 50));

        I1.setText(".");
        getContentPane().add(I1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 120, 110));

        S1.setText(".");
        getContentPane().add(S1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 120, 50));

        I2.setText(".");
        getContentPane().add(I2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 110, 110, 110));

        S2.setText(".");
        getContentPane().add(S2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 480, 120, 50));

        E21.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        E21.setForeground(new java.awt.Color(255, 255, 255));
        E21.setText(".");
        getContentPane().add(E21, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 580, 140, 40));

        E22.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        E22.setForeground(new java.awt.Color(255, 255, 255));
        E22.setText(".");
        getContentPane().add(E22, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 620, 140, 40));

        E23.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        E23.setForeground(new java.awt.Color(255, 255, 255));
        E23.setText(".");
        getContentPane().add(E23, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 660, 140, 40));

        I3.setText(".");
        getContentPane().add(I3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, 120, 110));

        S3.setText(".");
        getContentPane().add(S3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 480, 120, 50));

        E31.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        E31.setForeground(new java.awt.Color(255, 255, 255));
        E31.setText(".");
        getContentPane().add(E31, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 580, 140, 40));

        E32.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        E32.setForeground(new java.awt.Color(255, 255, 255));
        E32.setText(".");
        getContentPane().add(E32, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 620, 140, 40));

        E33.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        E33.setForeground(new java.awt.Color(255, 255, 255));
        E33.setText(".");
        getContentPane().add(E33, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 660, 140, 40));

        I4.setText(".");
        getContentPane().add(I4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 120, 120));

        S4.setText(".");
        getContentPane().add(S4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 480, 120, 50));

        E41.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        E41.setForeground(new java.awt.Color(255, 255, 255));
        E41.setText(".");
        getContentPane().add(E41, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 580, 140, 40));

        E42.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        E42.setForeground(new java.awt.Color(255, 255, 255));
        E42.setText(".");
        getContentPane().add(E42, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 620, 140, 40));

        E43.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        E43.setForeground(new java.awt.Color(255, 255, 255));
        E43.setText(".");
        getContentPane().add(E43, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 660, 140, 40));

        I5.setText(".");
        getContentPane().add(I5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 120, 120));

        S5.setText(".");
        getContentPane().add(S5, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 480, 120, 50));

        E51.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        E51.setForeground(new java.awt.Color(255, 255, 255));
        E51.setText(".");
        getContentPane().add(E51, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 580, 140, 40));

        E52.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        E52.setForeground(new java.awt.Color(255, 255, 255));
        E52.setText(".");
        getContentPane().add(E52, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 620, 140, 40));

        E53.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        E53.setForeground(new java.awt.Color(255, 255, 255));
        E53.setText(".");
        getContentPane().add(E53, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 660, 140, 40));

        F.setForeground(new java.awt.Color(255, 255, 255));
        F.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background.JPG"))); // NOI18N
        getContentPane().add(F, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 760));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed

        Fork fork1 = new Fork();
        Fork fork2 = new Fork();
        Fork fork3 = new Fork();
        Fork fork4 = new Fork();
        Fork fork5 = new Fork();

        PhilosopherLeft p1 = new PhilosopherLeft(fork2, fork1, 1, E11, E12, E13, I1, S1);
        PhilosopherRight p2 = new PhilosopherRight(fork3, fork2, 2, E21, E22, E23, I2, S2);
        PhilosopherLeft p3 = new PhilosopherLeft(fork4, fork3, 3, E31, E32, E33, I3, S3);
        PhilosopherRight p4 = new PhilosopherRight(fork5, fork4, 4, E41, E42, E43, I4, S4);
        PhilosopherLeft p5 = new PhilosopherLeft(fork1, fork5, 5, E51, E52, E53, I5, S5);

        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();

    }//GEN-LAST:event_B1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DiningPhilosophers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B1;
    private javax.swing.JLabel E11;
    private javax.swing.JLabel E12;
    private javax.swing.JLabel E13;
    private javax.swing.JLabel E21;
    private javax.swing.JLabel E22;
    private javax.swing.JLabel E23;
    private javax.swing.JLabel E31;
    private javax.swing.JLabel E32;
    private javax.swing.JLabel E33;
    private javax.swing.JLabel E41;
    private javax.swing.JLabel E42;
    private javax.swing.JLabel E43;
    private javax.swing.JLabel E51;
    private javax.swing.JLabel E52;
    private javax.swing.JLabel E53;
    private javax.swing.JLabel F;
    private javax.swing.JLabel I1;
    private javax.swing.JLabel I2;
    private javax.swing.JLabel I3;
    private javax.swing.JLabel I4;
    private javax.swing.JLabel I5;
    private javax.swing.JLabel S1;
    private javax.swing.JLabel S2;
    private javax.swing.JLabel S3;
    private javax.swing.JLabel S4;
    private javax.swing.JLabel S5;
    // End of variables declaration//GEN-END:variables
}
