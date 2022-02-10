package com.appCitas.configuacion;
import java.sql.Connection;
import java.sql.*;
import java.sql.SQLException;



public class ServiceLocator {
 
    String url = "jdbc:postgresql://localhost:5432/Citas";;
    String usuario = "postgres";
    String pass = "14074871G";
    String driver = "org.postgresql.Driver";
    Connection conn = null;

    public Connection getServiceLocator() {
        try{
            Class.forName(driver);
            conn = DriverManager.getConnection(url, usuario, pass);
            return conn;
        }catch(Exception e){
            System.out.println(e);
        }
        return null;
    }
    public void close(){
        try{
            conn.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

}
