/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.appCitas.controladores;

import com.appCitas.mundo.menuMundo;
import com.appCitas.vistas.Menu;

/**
 *
 * @author Gabriel Dubuc
 */
public class controladoresMenu {
    
    private com.appCitas.mundo.menuMundo menuMundo;

    public controladoresMenu() {
        this.menuMundo = new menuMundo();
    }
    
    public void index(){
        new com.appCitas.vistas.Menu().setVisible(true);
    }
    
}
