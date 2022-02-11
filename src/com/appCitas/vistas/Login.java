/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.appCitas.vistas;

import com.appCitas.controladores.controladoresUsuario;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel Dubuc
 */
public class Login extends javax.swing.JFrame {
   
    private int xMouse, yMouse;
    private controladoresUsuario conUser = null;
    private Aceptado acepVista = null;
    private Rechazado rechazadoVista = null;
    private Menu menu;
    
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        this.setLocationRelativeTo(this);
        conUser = new controladoresUsuario();
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
        lbl_imagen = new javax.swing.JLabel();
        lbl_logo = new javax.swing.JLabel();
        lbl_iniciarSesion = new javax.swing.JLabel();
        lbl_usuario = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        sep_usuario = new javax.swing.JSeparator();
        lbl_contraseña = new javax.swing.JLabel();
        pass_contraseña = new javax.swing.JPasswordField();
        sep_contraseña = new javax.swing.JSeparator();
        panel_barra = new javax.swing.JPanel();
        panel_cerrar = new javax.swing.JPanel();
        lbl_cerrar = new javax.swing.JLabel();
        panel_boton = new javax.swing.JPanel();
        lbl_boton = new javax.swing.JLabel();
        lbl_notificacion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/appCitas/recursos/Login__imagen.png"))); // NOI18N
        jPanel1.add(lbl_imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 290, 500));

        lbl_logo.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        lbl_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/appCitas/recursos/Login__icon.png"))); // NOI18N
        lbl_logo.setText("LOGO");
        jPanel1.add(lbl_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 150, 50));

        lbl_iniciarSesion.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        lbl_iniciarSesion.setText("INICIAR SESION");
        jPanel1.add(lbl_iniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 320, 50));

        lbl_usuario.setFont(new java.awt.Font("Roboto Light", 1, 11)); // NOI18N
        lbl_usuario.setText("USUARIO");
        jPanel1.add(lbl_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 350, 30));

        txt_usuario.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        txt_usuario.setForeground(new java.awt.Color(204, 204, 204));
        txt_usuario.setText("Ingrese su usuario");
        txt_usuario.setBorder(null);
        txt_usuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_usuarioMouseClicked(evt);
            }
        });
        txt_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usuarioActionPerformed(evt);
            }
        });
        jPanel1.add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 390, 30));
        jPanel1.add(sep_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 410, -1));

        lbl_contraseña.setFont(new java.awt.Font("Roboto Light", 1, 11)); // NOI18N
        lbl_contraseña.setText("CONTRASEÑA");
        jPanel1.add(lbl_contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 350, 30));

        pass_contraseña.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        pass_contraseña.setForeground(new java.awt.Color(204, 204, 204));
        pass_contraseña.setText("********");
        pass_contraseña.setBorder(null);
        pass_contraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pass_contraseñaMouseClicked(evt);
            }
        });
        jPanel1.add(pass_contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 410, 30));
        jPanel1.add(sep_contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 410, -1));

        panel_barra.setBackground(new java.awt.Color(255, 255, 255));
        panel_barra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panel_barraMouseDragged(evt);
            }
        });
        panel_barra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel_barraMousePressed(evt);
            }
        });

        panel_cerrar.setBackground(new java.awt.Color(255, 255, 255));

        lbl_cerrar.setBackground(new java.awt.Color(255, 255, 255));
        lbl_cerrar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lbl_cerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_cerrar.setText("X");
        lbl_cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_cerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_cerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_cerrarMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lbl_cerrarMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout panel_cerrarLayout = new javax.swing.GroupLayout(panel_cerrar);
        panel_cerrar.setLayout(panel_cerrarLayout);
        panel_cerrarLayout.setHorizontalGroup(
            panel_cerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_cerrarLayout.createSequentialGroup()
                .addComponent(lbl_cerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel_cerrarLayout.setVerticalGroup(
            panel_cerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_cerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel_barraLayout = new javax.swing.GroupLayout(panel_barra);
        panel_barra.setLayout(panel_barraLayout);
        panel_barraLayout.setHorizontalGroup(
            panel_barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_barraLayout.createSequentialGroup()
                .addComponent(panel_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 753, Short.MAX_VALUE))
        );
        panel_barraLayout.setVerticalGroup(
            panel_barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_cerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(panel_barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 30));

        panel_boton.setBackground(new java.awt.Color(202, 202, 202));

        lbl_boton.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        lbl_boton.setForeground(new java.awt.Color(51, 51, 51));
        lbl_boton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_boton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/appCitas/recursos/Login__entrar.png"))); // NOI18N
        lbl_boton.setText("Log in");
        lbl_boton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_boton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_botonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel_botonLayout = new javax.swing.GroupLayout(panel_boton);
        panel_boton.setLayout(panel_botonLayout);
        panel_botonLayout.setHorizontalGroup(
            panel_botonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_boton, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        panel_botonLayout.setVerticalGroup(
            panel_botonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_boton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.add(panel_boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 110, 50));

        lbl_notificacion.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lbl_notificacion.setForeground(new java.awt.Color(255, 255, 255));
        lbl_notificacion.setText("Por favor rellena todos los campos");
        jPanel1.add(lbl_notificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 200, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usuarioActionPerformed

    private void lbl_cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_cerrarMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_lbl_cerrarMouseClicked

    private void panel_barraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_barraMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation( x - this.xMouse, y - this.yMouse);
    }//GEN-LAST:event_panel_barraMouseDragged

    private void panel_barraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_barraMousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_panel_barraMousePressed

    private void lbl_cerrarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_cerrarMouseReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_lbl_cerrarMouseReleased

    private void lbl_cerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_cerrarMouseEntered
        // TODO add your handling code here:
        panel_cerrar.setBackground(Color.red);
        lbl_cerrar.setForeground(Color.white);
    }//GEN-LAST:event_lbl_cerrarMouseEntered

    private void lbl_cerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_cerrarMouseExited
        // TODO add your handling code here:
        panel_cerrar.setBackground(Color.white);
        lbl_cerrar.setForeground(Color.black);
    }//GEN-LAST:event_lbl_cerrarMouseExited

    private void txt_usuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_usuarioMouseClicked
        // TODO add your handling code here:
        if(txt_usuario.getText().equals("Ingrese su usuario")){
            txt_usuario.setText("");
            txt_usuario.setForeground(Color.black);
        }     
        if(new String(pass_contraseña.getPassword()).isEmpty()){
            pass_contraseña.setText("********");
            pass_contraseña.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txt_usuarioMouseClicked

    private void pass_contraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pass_contraseñaMouseClicked
        // TODO add your handling code here:
        if(new String(pass_contraseña.getPassword()).equals("********")){
            pass_contraseña.setText("");
            pass_contraseña.setForeground(Color.black);
        }     
        if(txt_usuario.getText().isEmpty()){
            txt_usuario.setText("Ingrese su usuario");
            txt_usuario.setForeground(Color.gray);
        }

    }//GEN-LAST:event_pass_contraseñaMouseClicked

    private void lbl_botonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_botonMouseClicked
        // TODO add your handling code here:
        if(!txt_usuario.getText().isEmpty() && ! new String(pass_contraseña.getPassword()).isEmpty()){      
            lbl_notificacion.setForeground(Color.white); 
            if(conUser.checkLogin(txt_usuario.getText(), new String(pass_contraseña.getPassword()))){
                acepVista = new Aceptado(Login.this);
                acepVista.setVisible(true);
                this.dispose();
                
            }else{
                rechazadoVista = new Rechazado(Login.this);
                rechazadoVista.setVisible(true);
            }
            
        }else{
            lbl_notificacion.setForeground(Color.red);
        }
    }//GEN-LAST:event_lbl_botonMouseClicked

    public void confirmarSalida(){
        this.dispose();
    }
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_boton;
    private javax.swing.JLabel lbl_cerrar;
    private javax.swing.JLabel lbl_contraseña;
    private javax.swing.JLabel lbl_imagen;
    private javax.swing.JLabel lbl_iniciarSesion;
    private javax.swing.JLabel lbl_logo;
    private javax.swing.JLabel lbl_notificacion;
    private javax.swing.JLabel lbl_usuario;
    private javax.swing.JPanel panel_barra;
    private javax.swing.JPanel panel_boton;
    private javax.swing.JPanel panel_cerrar;
    private javax.swing.JPasswordField pass_contraseña;
    private javax.swing.JSeparator sep_contraseña;
    private javax.swing.JSeparator sep_usuario;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
