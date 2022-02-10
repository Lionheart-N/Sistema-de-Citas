/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.appCitas.controladores;

import com.appCitas.mundo.usuarioMundo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gabriel Dubuc
 */
public class controladoresUsuario {
    
    private com.appCitas.mundo.usuarioMundo usuarioMundo;
    
    public controladoresUsuario(){
        this.usuarioMundo = new usuarioMundo();
        
    }
    
    public void index(){
        new com.appCitas.vistas.Login().setVisible(true);
    }
    public boolean checkLogin(String usuario, String contraseña){
        
        try {
            ResultSet Rs = this.usuarioMundo.getUsuario(usuario);
            
            if(Rs.next()){
                if(Rs.getString("contraseña").equals(contraseña) && Rs.getString("usuario").equals(usuario)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(controladoresUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
}
