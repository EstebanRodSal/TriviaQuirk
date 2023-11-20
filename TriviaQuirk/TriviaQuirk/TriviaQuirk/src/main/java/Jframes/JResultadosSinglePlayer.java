/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Jframes;


import java.awt.event.ActionEvent;
import javax.swing.Timer;





/**
 *
 * @author esteb
 */
public class JResultadosSinglePlayer extends javax.swing.JFrame {




   /**
    * Constructor
    */
    public JResultadosSinglePlayer() {
        initComponents();

    }
    
    




    
    
    

    
    
    
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgPanel = new javax.swing.JPanel();
        panelPregunta = new com.poo.triviaquirk.PanelRound();
        lbPuntosGanados = new javax.swing.JLabel();
        lbNumeroPuntosGanados = new javax.swing.JLabel();
        lbPreguntasAcertadas = new javax.swing.JLabel();
        lbNumeroPreguntasAcertadas = new javax.swing.JLabel();
        lbPreguntasIncorrectas = new javax.swing.JLabel();
        lbNumeroPreguntasIncorrectas = new javax.swing.JLabel();
        panelOpcion3 = new com.poo.triviaquirk.PanelRound();
        btnOpcionC = new javax.swing.JButton();
        panelCategoria = new com.poo.triviaquirk.PanelRound();
        lbCategoria = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Trivia Quirk");
        setResizable(false);

        bgPanel.setBackground(new java.awt.Color(84, 13, 110));
        bgPanel.setPreferredSize(new java.awt.Dimension(961, 535));

        panelPregunta.setBackground(new java.awt.Color(255, 255, 255));
        panelPregunta.setRoundBottomLeft(60);
        panelPregunta.setRoundBottomRight(60);
        panelPregunta.setRoundTopLeft(60);
        panelPregunta.setRoundTopRight(60);

        lbPuntosGanados.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lbPuntosGanados.setForeground(new java.awt.Color(238, 66, 102));
        lbPuntosGanados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPuntosGanados.setText("Cantidad de puntos ganados:");

        lbNumeroPuntosGanados.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lbNumeroPuntosGanados.setForeground(new java.awt.Color(0, 102, 153));
        lbNumeroPuntosGanados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNumeroPuntosGanados.setText("150");

        lbPreguntasAcertadas.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lbPreguntasAcertadas.setForeground(new java.awt.Color(238, 66, 102));
        lbPreguntasAcertadas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPreguntasAcertadas.setText("Cantidad de respuestas acertadas:");

        lbNumeroPreguntasAcertadas.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lbNumeroPreguntasAcertadas.setForeground(new java.awt.Color(0, 102, 153));
        lbNumeroPreguntasAcertadas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNumeroPreguntasAcertadas.setText("15");

        lbPreguntasIncorrectas.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lbPreguntasIncorrectas.setForeground(new java.awt.Color(238, 66, 102));
        lbPreguntasIncorrectas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPreguntasIncorrectas.setText("Cantidad de respuestas incorrectas:");

        lbNumeroPreguntasIncorrectas.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lbNumeroPreguntasIncorrectas.setForeground(new java.awt.Color(0, 102, 153));
        lbNumeroPreguntasIncorrectas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNumeroPreguntasIncorrectas.setText("15");

        javax.swing.GroupLayout panelPreguntaLayout = new javax.swing.GroupLayout(panelPregunta);
        panelPregunta.setLayout(panelPreguntaLayout);
        panelPreguntaLayout.setHorizontalGroup(
            panelPreguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPreguntaLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lbPuntosGanados, javax.swing.GroupLayout.DEFAULT_SIZE, 711, Short.MAX_VALUE)
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(panelPreguntaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbNumeroPuntosGanados, javax.swing.GroupLayout.DEFAULT_SIZE, 735, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelPreguntaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPreguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPreguntaLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(lbPreguntasAcertadas, javax.swing.GroupLayout.DEFAULT_SIZE, 717, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbNumeroPreguntasAcertadas, javax.swing.GroupLayout.DEFAULT_SIZE, 741, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(panelPreguntaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPreguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPreguntaLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(lbPreguntasIncorrectas, javax.swing.GroupLayout.DEFAULT_SIZE, 717, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbNumeroPreguntasIncorrectas, javax.swing.GroupLayout.DEFAULT_SIZE, 741, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelPreguntaLayout.setVerticalGroup(
            panelPreguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPreguntaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbPuntosGanados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbNumeroPuntosGanados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbPreguntasAcertadas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbNumeroPreguntasAcertadas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbPreguntasIncorrectas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbNumeroPreguntasIncorrectas)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        panelOpcion3.setBackground(new java.awt.Color(255, 210, 63));
        panelOpcion3.setRoundBottomLeft(60);
        panelOpcion3.setRoundBottomRight(60);
        panelOpcion3.setRoundTopLeft(60);
        panelOpcion3.setRoundTopRight(60);

        btnOpcionC.setBackground(new java.awt.Color(0, 0, 0));
        btnOpcionC.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        btnOpcionC.setForeground(new java.awt.Color(255, 102, 0));
        btnOpcionC.setText("Volver al menú");
        btnOpcionC.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnOpcionC.setContentAreaFilled(false);
        btnOpcionC.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnOpcionC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpcionCbtnJugarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelOpcion3Layout = new javax.swing.GroupLayout(panelOpcion3);
        panelOpcion3.setLayout(panelOpcion3Layout);
        panelOpcion3Layout.setHorizontalGroup(
            panelOpcion3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOpcion3Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(btnOpcionC, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        panelOpcion3Layout.setVerticalGroup(
            panelOpcion3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOpcion3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnOpcionC)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        panelCategoria.setBackground(new java.awt.Color(238, 66, 102));
        panelCategoria.setRoundBottomLeft(60);
        panelCategoria.setRoundBottomRight(60);

        lbCategoria.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        lbCategoria.setForeground(new java.awt.Color(255, 255, 255));
        lbCategoria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCategoria.setText("Resultados");
        lbCategoria.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelCategoriaLayout = new javax.swing.GroupLayout(panelCategoria);
        panelCategoria.setLayout(panelCategoriaLayout);
        panelCategoriaLayout.setHorizontalGroup(
            panelCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCategoriaLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        panelCategoriaLayout.setVerticalGroup(
            panelCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCategoriaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout bgPanelLayout = new javax.swing.GroupLayout(bgPanel);
        bgPanel.setLayout(bgPanelLayout);
        bgPanelLayout.setHorizontalGroup(
            bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgPanelLayout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgPanelLayout.createSequentialGroup()
                        .addComponent(panelPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgPanelLayout.createSequentialGroup()
                        .addComponent(panelOpcion3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(199, 199, 199))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgPanelLayout.createSequentialGroup()
                        .addComponent(panelCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(244, 244, 244))))
        );
        bgPanelLayout.setVerticalGroup(
            bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgPanelLayout.createSequentialGroup()
                .addComponent(panelCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(panelPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(panelOpcion3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 905, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
 * Acción realizada al presionar el botón relacionado con una opción específica para jugar en la interfaz.
 * Oculta la ventana actual y muestra un nuevo menú para opciones de juego.
 *
 * @param evt El evento de acción que desencadena este método al hacer clic en el botón correspondiente.
 */
    private void btnOpcionCbtnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpcionCbtnJugarActionPerformed
        this.setVisible(false);
        Jmenu menu = new Jmenu();
        menu.setVisible(true);
    }//GEN-LAST:event_btnOpcionCbtnJugarActionPerformed

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
            java.util.logging.Logger.getLogger(JResultadosSinglePlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JResultadosSinglePlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JResultadosSinglePlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JResultadosSinglePlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JResultadosSinglePlayer().setVisible(true);
            }
        });
    }
    
public void setPreguntaText(int respuestasCorrectas, int respuestasIncorrectas, int totalPuntos) {
    lbNumeroPreguntasAcertadas.setText(String.valueOf(respuestasCorrectas)); // Correctas
    lbNumeroPreguntasIncorrectas.setText(String.valueOf(respuestasIncorrectas)); // Incorrectas
    lbNumeroPuntosGanados.setText(String.valueOf(totalPuntos)); // Total puntos
}


    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgPanel;
    private javax.swing.JButton btnOpcionC;
    private javax.swing.JLabel lbCategoria;
    private javax.swing.JLabel lbNumeroPreguntasAcertadas;
    private javax.swing.JLabel lbNumeroPreguntasIncorrectas;
    private javax.swing.JLabel lbNumeroPuntosGanados;
    private javax.swing.JLabel lbPreguntasAcertadas;
    private javax.swing.JLabel lbPreguntasIncorrectas;
    private javax.swing.JLabel lbPuntosGanados;
    private com.poo.triviaquirk.PanelRound panelCategoria;
    private com.poo.triviaquirk.PanelRound panelOpcion3;
    private com.poo.triviaquirk.PanelRound panelPregunta;
    // End of variables declaration//GEN-END:variables
}