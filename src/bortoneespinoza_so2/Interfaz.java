/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bortoneespinoza_so2;

/**
 *
 * @author isabe
 */
public class Interfaz extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        
        int i = 0;
        
        initComponents();
        this.setLocationRelativeTo(null);
        
        //iniciar 20 hilos, 10 y 10. POR HACER 
        
        while (true) {          

            i++;

            Node node = new Node();

            if (i==10) { break;}

        }   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TituloT = new javax.swing.JLabel();
        TituloS = new javax.swing.JLabel();
        Vs = new javax.swing.JLabel();
        H2 = new javax.swing.JLabel();
        Habilidades2 = new javax.swing.JLabel();
        H1 = new javax.swing.JLabel();
        Habilidades1 = new javax.swing.JLabel();
        Pvida2 = new javax.swing.JLabel();
        Puntos2 = new javax.swing.JLabel();
        Pvida1 = new javax.swing.JLabel();
        Puntos1 = new javax.swing.JLabel();
        F1 = new javax.swing.JLabel();
        Fuerza1 = new javax.swing.JLabel();
        F2 = new javax.swing.JLabel();
        Fuerza2 = new javax.swing.JLabel();
        A1 = new javax.swing.JLabel();
        Agilidad1 = new javax.swing.JLabel();
        A2 = new javax.swing.JLabel();
        Agilidad2 = new javax.swing.JLabel();
        TextGanador = new javax.swing.JLabel();
        Ganador = new javax.swing.JLabel();
        Jugador1 = new javax.swing.JLabel();
        Jugador2 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TituloT.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        TituloT.setForeground(new java.awt.Color(0, 102, 0));
        TituloT.setText("Tears of the Kingdom");
        jPanel1.add(TituloT, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 250, 40));

        TituloS.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        TituloS.setForeground(new java.awt.Color(0, 0, 204));
        TituloS.setText("Street Fighter 6");
        jPanel1.add(TituloS, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, -1, -1));

        Vs.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Vs.setForeground(new java.awt.Color(204, 0, 102));
        Vs.setText("Vs.");
        jPanel1.add(Vs, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, -1, -1));

        H2.setText("Habilidades:");
        jPanel1.add(H2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, -1, -1));
        jPanel1.add(Habilidades2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 370, 110, 20));

        H1.setText("Habilidades:");
        jPanel1.add(H1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));
        jPanel1.add(Habilidades1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 110, 20));

        Pvida2.setText("Puntos de vida:");
        jPanel1.add(Pvida2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 400, -1, -1));
        jPanel1.add(Puntos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 400, 110, 20));

        Pvida1.setText("Puntos de vida:");
        jPanel1.add(Pvida1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));
        jPanel1.add(Puntos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, 110, 20));

        F1.setText("Fuerza:");
        jPanel1.add(F1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, -1, -1));
        jPanel1.add(Fuerza1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, 110, 20));

        F2.setText("Fuerza:");
        jPanel1.add(F2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 430, -1, -1));
        jPanel1.add(Fuerza2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 430, 110, 20));

        A1.setText("Agilidad:");
        jPanel1.add(A1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, -1, -1));
        jPanel1.add(Agilidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, 110, 20));

        A2.setText("Agilidad:");
        jPanel1.add(A2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 460, -1, -1));
        jPanel1.add(Agilidad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 460, 110, 20));

        TextGanador.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        TextGanador.setForeground(new java.awt.Color(204, 0, 102));
        TextGanador.setText("Ganador:");
        jPanel1.add(TextGanador, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 500, -1, -1));
        jPanel1.add(Ganador, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 500, 130, 30));

        Jugador1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(Jugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 270, 40));

        Jugador2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(Jugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, 270, 40));
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 540));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel A1;
    private javax.swing.JLabel A2;
    private javax.swing.JLabel Agilidad1;
    private javax.swing.JLabel Agilidad2;
    private javax.swing.JLabel F1;
    private javax.swing.JLabel F2;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Fuerza1;
    private javax.swing.JLabel Fuerza2;
    private javax.swing.JLabel Ganador;
    private javax.swing.JLabel H1;
    private javax.swing.JLabel H2;
    private javax.swing.JLabel Habilidades1;
    private javax.swing.JLabel Habilidades2;
    private javax.swing.JLabel Jugador1;
    private javax.swing.JLabel Jugador2;
    private javax.swing.JLabel Puntos1;
    private javax.swing.JLabel Puntos2;
    private javax.swing.JLabel Pvida1;
    private javax.swing.JLabel Pvida2;
    private javax.swing.JLabel TextGanador;
    private javax.swing.JLabel TituloS;
    private javax.swing.JLabel TituloT;
    private javax.swing.JLabel Vs;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
