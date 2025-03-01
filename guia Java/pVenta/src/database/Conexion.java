/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion 
{
 private final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
    private final String URL="jdbc:mysql://localhost:3306/";  
    private final String DB = "puntoventa";
    private final String USER = "root";
    private final String PASSWORD = "1234"; 
    
    public Connection connection;
    
    
    public Conexion(){
     try {
            Class.forName(DB_DRIVER); // Cargar el driver
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexión exitosa a la base de datos.");
        } catch (ClassNotFoundException e) {
            System.err.println("Error: No se encontró el driver de MySQL.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("Error de conexión a la base de datos.");
            e.printStackTrace();
        }
    }
     
    public void desconnectar() {
        try {
            if (connection != null) {
                connection.close();
                System.out.println("Conexión cerrada correctamente.");
            }
        } catch (SQLException e) {
            System.err.println("Error al cerrar la conexión.");
            e.printStackTrace();
        }
}
    
}


