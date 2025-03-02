/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

/**
 *
 * @author luisr
 */
public class pruebaConexion {
     public static void main(String[] args) {
        Conexion conexion = Conexion.getInstance();
        conexion.desconnectar();
    }
}
