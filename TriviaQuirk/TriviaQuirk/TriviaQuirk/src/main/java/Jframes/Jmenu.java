/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Jframes;


import Logica.Jugador;
import Logica.LogicaJuego;
import java.awt.Image;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.Timer;





/**
 *
 * @author esteb
 */
public class Jmenu extends javax.swing.JFrame {



    /**
     * Variables animaciones paneles
     */
    private final Timer animationTimer;
    private int animationX = 900;
    private int animationY = 560;
    private int animationY2 = -360;
    private int animationYC = 620;
    
    
    /**
     * Variables de la animación de entrada del boton de salir
     */
    private final Timer animationTimer2;
    private int animationXSalida = -600;

    
    
    /**
     * Variables animacion logo
     */
    private int animationYLogo = -250;
   
            

 





   /**
    * Constructor
    */
    public Jmenu() {
        initComponents();
        
         // Inicializa el temporizador de animación
        animationTimer = new Timer(10, (ActionEvent e) -> {
            animatePanel1();
            animatePanel2();
            animatePanel3();
            animateLogo();
            animatePanelContainer();
            
        });

        // Inicia la animación al iniciar el programa
        animationTimer.start();
        
        
        
         // Inicializa el temporizador de animación
        animationTimer2 = new Timer(10, (ActionEvent e) -> {
        animatePanelSalida();
            
        });

        // Inicia la animación al iniciar el programa
        animationTimer2.start();
        


    }
    
    



    /**
     * Metodo para la animación del panel 1
     */
    private void animatePanel1() {
        // Incrementa la posición X del panelDeco1
        panelDeco1.setLocation(animationX, panelDeco1.getY());

        // Detiene la animación cuando llega a la posición deseada
        if (animationX == 624) {
            animationTimer.stop();
        }

        // Incrementa la posición X en cada iteración
        animationX -= 6;
    
    }
    
    
    
    
       /**
     * Metodo para la animación del panel 2
     */
    private void animatePanel2() {
        // Incrementa la posición X del panelDeco1
        panelDeco2.setLocation(panelDeco2.getX(), animationY);



        // Incrementa la posición X en cada iteración
        animationY -= 6;
    
    }
    
    
       /**
        * Metodo para la animación del panel 3
        */
    private void animatePanel3() {
        // Incrementa la posición X del panelDeco1
        panelDeco3.setLocation(panelDeco3.getX(), animationY2);



        // Incrementa la posición X en cada iteración
        animationY2 += 6;
    
    }
    
    
           /**
        * Metodo para la animación del logo
        */
        private void animateLogo() {
        // Incrementa la posición X del panelDeco1
        jlLogo.setLocation(jlLogo.getX(), animationYLogo);



        // Incrementa la posición X en cada iteración
        animationYLogo += 6;
    
    }
        
       /**
        * Metodo para la animación del panel  de los botones de jugar
        */
    private void animatePanelContainer() {
        // Incrementa la posición X del panelDeco1
        panelContainer.setLocation(panelContainer.getX(), animationYC);



        // Incrementa la posición X en cada iteración
        animationYC -= 6;
    
    }
    
    
    
         /**
        * Metodo para la animación del panel de salida
        */
     private void animatePanelSalida() {
        // Incrementa la posición X del panelDeco1
        panelBtnSalir.setLocation(animationXSalida, panelBtnSalir.getY());

        // Detiene la animación cuando llega a la posición deseada
        if (animationXSalida == -12) {
            animationTimer2.stop();
        }

        // Incrementa la posición X en cada iteración
        animationXSalida += 6;
        
    
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
        panelContainer = new com.poo.triviaquirk.PanelRound();
        panelBtnJugar = new com.poo.triviaquirk.PanelRound();
        btnJugar = new javax.swing.JButton();
        panelBtnMultijugador = new com.poo.triviaquirk.PanelRound();
        btnMultijugador = new javax.swing.JButton();
        panelDeco1 = new com.poo.triviaquirk.PanelRound();
        panelBtnSalir = new com.poo.triviaquirk.PanelRound();
        btnSalir = new javax.swing.JButton();
        panelDeco2 = new com.poo.triviaquirk.PanelRound();
        panelDeco3 = new com.poo.triviaquirk.PanelRound();
        jlLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Trivia Quirk");
        setResizable(false);

        bgPanel.setBackground(new java.awt.Color(84, 13, 110));

        panelContainer.setBackground(new java.awt.Color(238, 66, 102));
        panelContainer.setRoundBottomLeft(60);
        panelContainer.setRoundBottomRight(60);
        panelContainer.setRoundTopLeft(60);
        panelContainer.setRoundTopRight(60);

        panelBtnJugar.setBackground(new java.awt.Color(255, 210, 63));
        panelBtnJugar.setRoundBottomLeft(60);
        panelBtnJugar.setRoundBottomRight(60);
        panelBtnJugar.setRoundTopLeft(60);
        panelBtnJugar.setRoundTopRight(60);

        btnJugar.setBackground(new java.awt.Color(0, 0, 0));
        btnJugar.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        btnJugar.setForeground(new java.awt.Color(255, 102, 0));
        btnJugar.setText("Jugar");
        btnJugar.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnJugar.setContentAreaFilled(false);
        btnJugar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBtnJugarLayout = new javax.swing.GroupLayout(panelBtnJugar);
        panelBtnJugar.setLayout(panelBtnJugarLayout);
        panelBtnJugarLayout.setHorizontalGroup(
            panelBtnJugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtnJugarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnJugar, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBtnJugarLayout.setVerticalGroup(
            panelBtnJugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtnJugarLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btnJugar)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        panelBtnMultijugador.setBackground(new java.awt.Color(255, 210, 63));
        panelBtnMultijugador.setRoundBottomLeft(60);
        panelBtnMultijugador.setRoundBottomRight(60);
        panelBtnMultijugador.setRoundTopLeft(60);
        panelBtnMultijugador.setRoundTopRight(60);

        btnMultijugador.setBackground(new java.awt.Color(0, 0, 0));
        btnMultijugador.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        btnMultijugador.setForeground(new java.awt.Color(255, 102, 0));
        btnMultijugador.setText("Multijugador");
        btnMultijugador.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnMultijugador.setContentAreaFilled(false);
        btnMultijugador.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnMultijugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultijugadorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBtnMultijugadorLayout = new javax.swing.GroupLayout(panelBtnMultijugador);
        panelBtnMultijugador.setLayout(panelBtnMultijugadorLayout);
        panelBtnMultijugadorLayout.setHorizontalGroup(
            panelBtnMultijugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBtnMultijugadorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMultijugador, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        panelBtnMultijugadorLayout.setVerticalGroup(
            panelBtnMultijugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtnMultijugadorLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnMultijugador)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelContainerLayout = new javax.swing.GroupLayout(panelContainer);
        panelContainer.setLayout(panelContainerLayout);
        panelContainerLayout.setHorizontalGroup(
            panelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContainerLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(panelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panelBtnMultijugador, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(panelBtnJugar, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );
        panelContainerLayout.setVerticalGroup(
            panelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContainerLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(panelBtnJugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelBtnMultijugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        panelDeco1.setBackground(new java.awt.Color(238, 66, 102));
        panelDeco1.setRoundBottomLeft(60);
        panelDeco1.setRoundTopLeft(60);

        javax.swing.GroupLayout panelDeco1Layout = new javax.swing.GroupLayout(panelDeco1);
        panelDeco1.setLayout(panelDeco1Layout);
        panelDeco1Layout.setHorizontalGroup(
            panelDeco1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 284, Short.MAX_VALUE)
        );
        panelDeco1Layout.setVerticalGroup(
            panelDeco1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 96, Short.MAX_VALUE)
        );

        panelBtnSalir.setBackground(new java.awt.Color(255, 210, 63));
        panelBtnSalir.setRoundBottomRight(60);
        panelBtnSalir.setRoundTopRight(60);

        btnSalir.setBackground(new java.awt.Color(255, 0, 0));
        btnSalir.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(204, 0, 51));
        btnSalir.setText("Salir");
        btnSalir.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnSalir.setContentAreaFilled(false);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBtnSalirLayout = new javax.swing.GroupLayout(panelBtnSalir);
        panelBtnSalir.setLayout(panelBtnSalirLayout);
        panelBtnSalirLayout.setHorizontalGroup(
            panelBtnSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBtnSalirLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        panelBtnSalirLayout.setVerticalGroup(
            panelBtnSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtnSalirLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnSalir)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        panelDeco2.setBackground(new java.awt.Color(238, 66, 102));
        panelDeco2.setRoundTopLeft(60);
        panelDeco2.setRoundTopRight(60);

        javax.swing.GroupLayout panelDeco2Layout = new javax.swing.GroupLayout(panelDeco2);
        panelDeco2.setLayout(panelDeco2Layout);
        panelDeco2Layout.setHorizontalGroup(
            panelDeco2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
        );
        panelDeco2Layout.setVerticalGroup(
            panelDeco2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 338, Short.MAX_VALUE)
        );

        panelDeco3.setBackground(new java.awt.Color(238, 66, 102));
        panelDeco3.setRoundBottomLeft(60);
        panelDeco3.setRoundBottomRight(60);

        javax.swing.GroupLayout panelDeco3Layout = new javax.swing.GroupLayout(panelDeco3);
        panelDeco3.setLayout(panelDeco3Layout);
        panelDeco3Layout.setHorizontalGroup(
            panelDeco3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
        );
        panelDeco3Layout.setVerticalGroup(
            panelDeco3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 338, Short.MAX_VALUE)
        );

        jlLogo.setIcon(new javax.swing.ImageIcon("src\\main\\java\\com\\poo\\triviaquirk\\logo.png"));

        javax.swing.GroupLayout bgPanelLayout = new javax.swing.GroupLayout(bgPanel);
        bgPanel.setLayout(bgPanelLayout);
        bgPanelLayout.setHorizontalGroup(
            bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgPanelLayout.createSequentialGroup()
                .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelBtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bgPanelLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(panelDeco3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgPanelLayout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(panelContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addComponent(jlLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)))
                .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgPanelLayout.createSequentialGroup()
                        .addComponent(panelDeco2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addComponent(panelDeco1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        bgPanelLayout.setVerticalGroup(
            bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgPanelLayout.createSequentialGroup()
                .addComponent(panelDeco3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelBtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
            .addGroup(bgPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jlLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addGroup(bgPanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(panelDeco1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(panelDeco2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMultijugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultijugadorActionPerformed
         this.setVisible(false);
        JCategoriasMultijugador categoriasMultijugador = new JCategoriasMultijugador();
        categoriasMultijugador.setVisible(true);
    }//GEN-LAST:event_btnMultijugadorActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed
        LogicaJuego primerPantalla = new LogicaJuego();
        primerPantalla.activarCategorias(this);
    }//GEN-LAST:event_btnJugarActionPerformed

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
            java.util.logging.Logger.getLogger(Jmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jmenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgPanel;
    private javax.swing.JButton btnJugar;
    private javax.swing.JButton btnMultijugador;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jlLogo;
    private com.poo.triviaquirk.PanelRound panelBtnJugar;
    private com.poo.triviaquirk.PanelRound panelBtnMultijugador;
    private com.poo.triviaquirk.PanelRound panelBtnSalir;
    private com.poo.triviaquirk.PanelRound panelContainer;
    private com.poo.triviaquirk.PanelRound panelDeco1;
    private com.poo.triviaquirk.PanelRound panelDeco2;
    private com.poo.triviaquirk.PanelRound panelDeco3;
    // End of variables declaration//GEN-END:variables
}
