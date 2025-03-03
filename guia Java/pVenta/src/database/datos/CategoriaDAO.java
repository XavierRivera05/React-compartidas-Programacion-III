/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database.datos;
import datos.interfaces.CRUDGeneralInterface;
import entidades.Categoria;
import java.util.List;
import database.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.SQLException;
import java.sql.*;

/**
 *
 * @author luisr
 */
public class CategoriaDAO implements CRUDGeneralInterface<Categoria> {

    private final Conexion conectar;
    private PreparedStatement ps;
    private ResultSet rs;
    
    public CategoriaDAO(){
        conectar = Conexion.getInstance();
    }
            
    @Override
    public List<Categoria> getAll(String list) {
       List<Categoria> registros = new ArrayList<>();
        ps = null;
        rs = null; ///hasta aquí dejé la guía porque me daba error, estoy
        ///en la parte de GUÏA 8 USO DE LIKE 
    }
       
    

    @Override
    public boolean insert(Categoria object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean update(Categoria object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean onVariable() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean offVariable() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int exist(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int total() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
  
}

