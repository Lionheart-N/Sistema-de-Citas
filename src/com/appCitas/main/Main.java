/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.appCitas.main;
import com.appCitas.controladores.controladoresUsuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Gabriel Dubuc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new controladoresUsuario().index();
    }
    
}
