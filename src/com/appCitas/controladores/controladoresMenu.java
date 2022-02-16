/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.appCitas.controladores;

import com.appCitas.mundo.menuMundo;
import com.appCitas.vistas.Menu;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.sql.ResultSet;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author Gabriel Dubuc
 */
public class controladoresMenu {
    
    private com.appCitas.mundo.menuMundo menuMundo;

    public controladoresMenu() {
        this.menuMundo = new menuMundo();
    }
    
    public void index(String idUsuario){
        Menu menu=new com.appCitas.vistas.Menu();
        menu.setIdUsuario(idUsuario);
        menu.setVisible(true);
        
    }
    
    public String nombreUsuario(String idUsuario){
        try{
            ResultSet rs = this.menuMundo.getNombreCompleto(idUsuario);
            while(rs.next()){
                return rs.getString(1)+" "+rs.getString(2);  
            }
        }catch(Exception ex){
            System.out.println(ex);
        }
        return null;  
    }
    
    public ImageIcon getImagen(String idUsuario){        
        ImageIcon foto;
        InputStream is;
        
        try{
            ResultSet rs = this.menuMundo.getFoto(idUsuario);
            while(rs.next()){
                is = rs.getBinaryStream(1);
                
                BufferedImage bi = ImageIO.read(is);
                foto = new ImageIcon(bi);
                
                Image img = foto.getImage();
                Image newimg = img.getScaledInstance(126, 126, java.awt.Image.SCALE_SMOOTH);
                
                ImageIcon newicon = new ImageIcon(newimg);
                return newicon;              
                
            }
        }catch(Exception ex){
            System.out.println(ex);
        }
        return null;
    }
    
}
