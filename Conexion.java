/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emergentes.utiles;

/**
 *
 * @author Windows 8.1
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Conexion {
    private Connection conexion=null ;
    /**
    * Método utilizado para recuperar el valor del atributo conexion
    * @return conexion contiene el estado de la conexión
    *
    */
    public Connection getConexion()
    {
       return conexion;
    }
    public void crearConexion()
    {
       try {
          Class.forName("org.postgresql.Driver");
          conexion = DriverManager.getConnection("jdbc:postgresql://localhost:5432/bd_eventos","postgres","root");
          if(conexion!=null){
              System.out.println("exito");
          }
       }
       catch (SQLException ex) {
          System.out.println("error en conexion: "+ex);
       }
       catch (ClassNotFoundException ex) {
          System.out.println("clase no encontrada "+ex);
       }
    }
    public void cerrarconexion(){
        try {
            conexion.close();
        } catch (SQLException ex) {
            System.out.println("error al cerrar "+ex.getMessage());
        }
    }
    
}
