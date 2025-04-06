/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud.tienda;

import java.sql.*;

public class conexion {
    
    public Connection conectar(){
        String url = "jdbc:mysql://localhost:3306/crud-senati-anthony"; // Reemplaza con el nombre de tu base de datos
        String user = "root";  // Tu usuario de MySQL
        String password = "";  // La contraseña de tu usuario de MySQL (en este caso está vacía)

        Connection cn = null;
        
        try {
            // Intentamos conectar
            cn = DriverManager.getConnection(url, user, password);
            if (cn != null) {
                System.out.println("Conexión exitosa a la base de datos");
            }
        } catch (SQLException e) {
            // Si ocurre un error, lo imprimimos
            System.out.println("Error de conexión: " + e.getMessage());
        }
        
        return cn;
    }
    
    public void cerrarConexion(Connection cn) {
        if (cn != null) {
            try {
                cn.close();
                System.out.println("Conexión cerrada.");
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }
    
    // Bloque de prueba para verificar si la conexión funciona correctamente
    public static void main(String[] args) {
        conexion cn = new conexion();
        Connection connection = cn.conectar();
        
        if (connection != null) {
            System.out.println("Conexión establecida correctamente.");
            // Aquí podrías agregar más lógica para trabajar con la base de datos.
        } else {
            System.out.println("No se pudo establecer la conexión.");
        }
        
        // Cerrar la conexión al final
        cn.cerrarConexion(connection);
    }
}
