/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.appCitas.vistas;

import Desvanecimiento.Desvanecimiento;
import com.appCitas.controladores.controladoresMenu;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.sql.ResultSet;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import rojerusan.RSPanelsSlider;

/**
 *
 * @author Gabriel Dubuc
 */
public class Menu extends javax.swing.JFrame {
    
    private controladoresMenu conMenu;
    private int xMouse, yMouse;
    private Desvanecimiento efecto;
    private String idUsuario;
    /**
     * Creates new form Menu
     */
    public Menu() {
        conMenu=new controladoresMenu();
        initComponents();
        this.setLocationRelativeTo(this);

        efecto=new Desvanecimiento();
        efecto.Abrir(this, 25);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu_background = new javax.swing.JPanel();
        panel_menu = new javax.swing.JPanel();
        btn_home = new rojerusan.RSButtonIconI();
        btn_citas = new rojerusan.RSButtonIconI();
        btn_usuarios = new rojerusan.RSButtonIconI();
        btn_clientes = new rojerusan.RSButtonIconI();
        btn_acerca = new rojerusan.RSButtonIconI();
        jLabel1 = new javax.swing.JLabel();
        lblfoto = new javax.swing.JLabel();
        rSButtonIconI1 = new rojerusan.RSButtonIconI();
        panel_cards = new rojerusan.RSPanelsSlider();
        panel_home = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        panel_citas = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        panel_usuarios = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        panel_clientes = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        panel_acerca = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        menu_background.setBackground(new java.awt.Color(255, 255, 255));
        menu_background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_menu.setBackground(new java.awt.Color(147, 100, 68));

        btn_home.setBackground(new java.awt.Color(147, 100, 68));
        btn_home.setBorder(null);
        btn_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/appCitas/recursos/Menu_home.png"))); // NOI18N
        btn_home.setText("HOME");
        btn_home.setBorderPainted(false);
        btn_home.setColorHover(new java.awt.Color(134, 91, 68));
        btn_home.setFocusable(false);
        btn_home.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_home.setSelected(true);
        btn_home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_homeMouseClicked(evt);
            }
        });
        btn_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_homeActionPerformed(evt);
            }
        });

        btn_citas.setBackground(new java.awt.Color(147, 100, 68));
        btn_citas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/appCitas/recursos/Menu_citas.png"))); // NOI18N
        btn_citas.setText("CITAS");
        btn_citas.setBorderPainted(false);
        btn_citas.setColorHover(new java.awt.Color(134, 91, 68));
        btn_citas.setFocusable(false);
        btn_citas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_citas.setMargin(new java.awt.Insets(2, 14, 2, 12));
        btn_citas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_citasActionPerformed(evt);
            }
        });

        btn_usuarios.setBackground(new java.awt.Color(147, 100, 68));
        btn_usuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/appCitas/recursos/Menu_usuarios.png"))); // NOI18N
        btn_usuarios.setText("USUARIOS");
        btn_usuarios.setBorderPainted(false);
        btn_usuarios.setColorHover(new java.awt.Color(134, 91, 68));
        btn_usuarios.setFocusable(false);
        btn_usuarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_usuarios.setMargin(new java.awt.Insets(2, 34, 2, 0));
        btn_usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_usuariosActionPerformed(evt);
            }
        });

        btn_clientes.setBackground(new java.awt.Color(147, 100, 68));
        btn_clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/appCitas/recursos/Menu_clientes.png"))); // NOI18N
        btn_clientes.setText("CLIENTES");
        btn_clientes.setBorderPainted(false);
        btn_clientes.setColorHover(new java.awt.Color(134, 91, 68));
        btn_clientes.setFocusable(false);
        btn_clientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_clientes.setMargin(new java.awt.Insets(2, 31, 2, 0));
        btn_clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clientesActionPerformed(evt);
            }
        });

        btn_acerca.setBackground(new java.awt.Color(147, 100, 68));
        btn_acerca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/appCitas/recursos/Menu_acerca.png"))); // NOI18N
        btn_acerca.setText("ACERCA DE");
        btn_acerca.setBorderPainted(false);
        btn_acerca.setColorHover(new java.awt.Color(134, 91, 68));
        btn_acerca.setFocusable(false);
        btn_acerca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_acerca.setMargin(new java.awt.Insets(2, 41, 2, 0));
        btn_acerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_acercaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NOMBRE Y APELLIDO");

        rSButtonIconI1.setBackground(new java.awt.Color(147, 100, 68));
        rSButtonIconI1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/appCitas/recursos/Menu_cerrar.png"))); // NOI18N
        rSButtonIconI1.setText("SALIR");
        rSButtonIconI1.setBorderPainted(false);
        rSButtonIconI1.setColorHover(new java.awt.Color(134, 91, 68));
        rSButtonIconI1.setFocusable(false);
        rSButtonIconI1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rSButtonIconI1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIconI1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_menuLayout = new javax.swing.GroupLayout(panel_menu);
        panel_menu.setLayout(panel_menuLayout);
        panel_menuLayout.setHorizontalGroup(
            panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_menuLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_menuLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_home, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_citas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_usuarios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_clientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_acerca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonIconI1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        panel_menuLayout.setVerticalGroup(
            panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_menuLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btn_home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_citas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_clientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_acerca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rSButtonIconI1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        menu_background.add(panel_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 500));

        panel_cards.setBackground(new java.awt.Color(255, 255, 255));

        panel_home.setBackground(new java.awt.Color(255, 255, 255));
        panel_home.setName("panel_home"); // NOI18N

        jLabel2.setText("jLabel1");

        javax.swing.GroupLayout panel_homeLayout = new javax.swing.GroupLayout(panel_home);
        panel_home.setLayout(panel_homeLayout);
        panel_homeLayout.setHorizontalGroup(
            panel_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_homeLayout.createSequentialGroup()
                .addGap(271, 271, 271)
                .addComponent(jLabel2)
                .addContainerGap(295, Short.MAX_VALUE))
        );
        panel_homeLayout.setVerticalGroup(
            panel_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_homeLayout.createSequentialGroup()
                .addContainerGap(271, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(215, 215, 215))
        );

        panel_cards.add(panel_home, "card2");

        panel_citas.setBackground(new java.awt.Color(255, 255, 255));
        panel_citas.setName("panel_citas"); // NOI18N

        jLabel3.setText("jLabel2");

        javax.swing.GroupLayout panel_citasLayout = new javax.swing.GroupLayout(panel_citas);
        panel_citas.setLayout(panel_citasLayout);
        panel_citasLayout.setHorizontalGroup(
            panel_citasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_citasLayout.createSequentialGroup()
                .addGap(234, 234, 234)
                .addComponent(jLabel3)
                .addContainerGap(332, Short.MAX_VALUE))
        );
        panel_citasLayout.setVerticalGroup(
            panel_citasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_citasLayout.createSequentialGroup()
                .addContainerGap(251, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(235, 235, 235))
        );

        panel_cards.add(panel_citas, "card3");

        panel_usuarios.setBackground(new java.awt.Color(255, 255, 255));
        panel_usuarios.setName("panel_usuarios"); // NOI18N

        jLabel4.setText("jLabel3");

        javax.swing.GroupLayout panel_usuariosLayout = new javax.swing.GroupLayout(panel_usuarios);
        panel_usuarios.setLayout(panel_usuariosLayout);
        panel_usuariosLayout.setHorizontalGroup(
            panel_usuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_usuariosLayout.createSequentialGroup()
                .addGap(282, 282, 282)
                .addComponent(jLabel4)
                .addContainerGap(284, Short.MAX_VALUE))
        );
        panel_usuariosLayout.setVerticalGroup(
            panel_usuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_usuariosLayout.createSequentialGroup()
                .addContainerGap(249, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(237, 237, 237))
        );

        panel_cards.add(panel_usuarios, "card4");

        panel_clientes.setBackground(new java.awt.Color(255, 255, 255));
        panel_clientes.setName("panel_clientes"); // NOI18N

        jLabel5.setText("jLabel4");

        javax.swing.GroupLayout panel_clientesLayout = new javax.swing.GroupLayout(panel_clientes);
        panel_clientes.setLayout(panel_clientesLayout);
        panel_clientesLayout.setHorizontalGroup(
            panel_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_clientesLayout.createSequentialGroup()
                .addGap(274, 274, 274)
                .addComponent(jLabel5)
                .addContainerGap(292, Short.MAX_VALUE))
        );
        panel_clientesLayout.setVerticalGroup(
            panel_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_clientesLayout.createSequentialGroup()
                .addGap(237, 237, 237)
                .addComponent(jLabel5)
                .addContainerGap(249, Short.MAX_VALUE))
        );

        panel_cards.add(panel_clientes, "card5");

        panel_acerca.setBackground(new java.awt.Color(255, 255, 255));
        panel_acerca.setName("panel_acerca"); // NOI18N

        jLabel6.setText("jLabel5");

        javax.swing.GroupLayout panel_acercaLayout = new javax.swing.GroupLayout(panel_acerca);
        panel_acerca.setLayout(panel_acercaLayout);
        panel_acercaLayout.setHorizontalGroup(
            panel_acercaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_acercaLayout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(jLabel6)
                .addContainerGap(296, Short.MAX_VALUE))
        );
        panel_acercaLayout.setVerticalGroup(
            panel_acercaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_acercaLayout.createSequentialGroup()
                .addContainerGap(266, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(220, 220, 220))
        );

        panel_cards.add(panel_acerca, "card6");

        menu_background.add(panel_cards, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 600, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu_background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu_background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation( x - this.xMouse, y - this.yMouse);
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void btn_homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_homeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_homeMouseClicked

    private void btn_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_homeActionPerformed
        // TODO add your handling code here:
        if(!this.btn_home.isSelected()){
            this.btn_home.setSelected(true);
            this.btn_citas.setSelected(false);
            this.btn_clientes.setSelected(false);
            this.btn_usuarios.setSelected(false);
            this.btn_acerca.setSelected(false);
            
            panel_cards.setPanelSlider(20, panel_home, RSPanelsSlider.DIRECT.RIGHT);
        }
    }//GEN-LAST:event_btn_homeActionPerformed

    private void btn_citasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_citasActionPerformed
        // TODO add your handling code here:
        if(!this.btn_citas.isSelected()){
            this.btn_home.setSelected(false);
            this.btn_citas.setSelected(true);
            this.btn_clientes.setSelected(false);
            this.btn_usuarios.setSelected(false);
            this.btn_acerca.setSelected(false);
            
            panel_cards.setPanelSlider(20, panel_citas, RSPanelsSlider.DIRECT.RIGHT);
        }
    }//GEN-LAST:event_btn_citasActionPerformed

    private void btn_usuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_usuariosActionPerformed
        // TODO add your handling code here:
        if(!this.btn_usuarios.isSelected()){
            this.btn_home.setSelected(false);
            this.btn_citas.setSelected(false);
            this.btn_clientes.setSelected(false);
            this.btn_usuarios.setSelected(true);
            this.btn_acerca.setSelected(false);
            
            panel_cards.setPanelSlider(20, panel_usuarios, RSPanelsSlider.DIRECT.RIGHT);
        }
    }//GEN-LAST:event_btn_usuariosActionPerformed

    private void btn_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clientesActionPerformed
        // TODO add your handling code here:
        if(!this.btn_clientes.isSelected()){
            this.btn_home.setSelected(false);
            this.btn_citas.setSelected(false);
            this.btn_clientes.setSelected(true);
            this.btn_usuarios.setSelected(false);
            this.btn_acerca.setSelected(false);
            
            panel_cards.setPanelSlider(20, panel_clientes, RSPanelsSlider.DIRECT.RIGHT);
        }
    }//GEN-LAST:event_btn_clientesActionPerformed

    private void btn_acercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_acercaActionPerformed
        // TODO add your handling code here:
        if(!this.btn_acerca.isSelected()){
            this.btn_home.setSelected(false);
            this.btn_citas.setSelected(false);
            this.btn_clientes.setSelected(false);
            this.btn_usuarios.setSelected(false);
            this.btn_acerca.setSelected(true);
            
            panel_cards.setPanelSlider(20, panel_acerca, RSPanelsSlider.DIRECT.RIGHT);
        }
    }//GEN-LAST:event_btn_acercaActionPerformed

    private void rSButtonIconI1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIconI1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_rSButtonIconI1ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }
    
    private void datosUsuario(){ 
       
        jLabel1.setText(conMenu.nombreUsuario(idUsuario));
        lblfoto.setIcon(conMenu.getImagen(idUsuario));
    }
    
    public void setIdUsuario(String idUsuario){
        this.idUsuario=idUsuario;
        datosUsuario();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSButtonIconI btn_acerca;
    private rojerusan.RSButtonIconI btn_citas;
    private rojerusan.RSButtonIconI btn_clientes;
    private rojerusan.RSButtonIconI btn_home;
    private rojerusan.RSButtonIconI btn_usuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblfoto;
    private javax.swing.JPanel menu_background;
    private javax.swing.JPanel panel_acerca;
    private rojerusan.RSPanelsSlider panel_cards;
    private javax.swing.JPanel panel_citas;
    private javax.swing.JPanel panel_clientes;
    private javax.swing.JPanel panel_home;
    private javax.swing.JPanel panel_menu;
    private javax.swing.JPanel panel_usuarios;
    private rojerusan.RSButtonIconI rSButtonIconI1;
    // End of variables declaration//GEN-END:variables
}
