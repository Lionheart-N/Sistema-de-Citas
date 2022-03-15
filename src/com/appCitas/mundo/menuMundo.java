/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.appCitas.mundo;

import com.appCitas.configuacion.ServiceLocator;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gabriel Dubuc
 */
public class menuMundo {
    
    private Connection con = null;
    private Statement prepStmt = null;
    private String strSQL = "";
    private ServiceLocator ser = null;
    
    public menuMundo(){
        ser = new ServiceLocator();
        this.con = ser.getServiceLocator();
        try{
            this.prepStmt = this.con.createStatement();
        }catch(Exception e){
            Logger.getLogger(usuarioMundo.class.getName()).log(Level.SEVERE, null, e);
        }    
    }
    
    public ResultSet getNombreCompleto(String idUsuario){
        try{
            this.strSQL = "SELECT nombre, apellidouno FROM usuario WHERE k_id_usuario = '" + idUsuario +"'";
            ResultSet Rs = this.prepStmt.executeQuery(strSQL);
            return Rs;
        }catch(Exception e){
            Logger.getLogger(usuarioMundo.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;
    }
    
    public ResultSet getFoto(String idUsuario){
        try{
            this.strSQL = "SELECT foto FROM usuario WHERE k_id_usuario = '" + idUsuario +"'";
            ResultSet Rs = this.prepStmt.executeQuery(strSQL);
            return Rs;
        }catch(Exception e){
            Logger.getLogger(usuarioMundo.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;
    }
    
}
