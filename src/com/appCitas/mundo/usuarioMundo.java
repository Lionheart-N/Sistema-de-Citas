/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.appCitas.mundo;
import com.appCitas.configuacion.ServiceLocator;
import java.sql.*;
import java.util.logging.*;
/**
 *
 * @author Gabriel Dubuc
 */
public class usuarioMundo {
    
    private Connection con = null;
    private Statement prepStmt = null;
    private String strSQL = "";
    private ServiceLocator ser = null;
    
    
    
    public usuarioMundo(){
        ser = new ServiceLocator();
        this.con = ser.getServiceLocator();
        try{
            this.prepStmt = this.con.createStatement();
        }catch(Exception e){
            Logger.getLogger(usuarioMundo.class.getName()).log(Level.SEVERE, null, e);
        }
    
    }
    //++++
    public ResultSet getUsuario(String usuario){
        try{
            this.strSQL = "SELECT * FROM usuario WHERE usuario = '" + usuario +"'";
            ResultSet Rs = this.prepStmt.executeQuery(strSQL);
            return Rs;
        }catch(Exception e){
            Logger.getLogger(usuarioMundo.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;
    }
    
}
