/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Product;

/**
 *
 * @author Levy
 */
public class ProductDAO {
    
    private static ProductDAO instance;
    Connection con;
    
    private ProductDAO(){
        con = ConnectionFactory.getConnection();
        
    }
    
    public static ProductDAO getInstance(){
        if(instance == null){
            instance = new ProductDAO();
        }
        return instance;
    }
    
    
    public void create(Product p) {
        
        PreparedStatement stmt = null;
        
        String sql = "INSERT INTO produtos(nome, preco, codigo, qnt) VALUES(?,?,?,?)";
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, p.getName());
            stmt.setDouble(2, p.getPrice());
            stmt.setInt(3, p.getCode());
            stmt.setInt(4, p.getQnt());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public ArrayList<Product> read() {
        
        PreparedStatement stmt = null;
        ResultSet rs;
        ArrayList<Product> list = new ArrayList<>();
        
        String sql = "SELECT * FROM `produtos`";
        
        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while(rs.next()) {
                Product p = new Product();
                p.setId(rs.getInt("id"));
                p.setName(rs.getString("nome"));
                p.setPrice(rs.getDouble("preco"));
                p.setQnt(rs.getInt("qnt"));
                
                list.add(p);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
        
        return list;
    }
}
