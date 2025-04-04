/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud.senati1;
import java.sql.*;

/**
 *
 * @author Alumno-ETI
 */
public class conexion {
    public Connection conectar(){
    String url="jdbc:mysql://localhost:3306/senati?zeroDateTimeBehavior=CONVERT_TO_NULL";
    String user="root";
    String password="";
    Connection cn = null;
    
   
    
    try{
        cn = DriverManager.getConnection(url, user, password);
         if (cn !=null){
         System.out.println("Conectado");
         }
    }catch(SQLException e){
        System.out.println(e);
    }
        return cn ;
        }
    
}
