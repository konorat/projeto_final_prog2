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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.User;

/**
 *
 * @author Levy
 */
public class UserDAO {
    private static UserDAO instance;
    Connection con;
    
    private UserDAO() {
        con = ConnectionFactory.getConnection();
    }
    
    public static UserDAO getInstance() {
        if(instance == null) {
            instance = new UserDAO();
        }
        
        return instance;
    }
    
    public void create(User w) {
        PreparedStatement stmt = null;
        
        String sql = "INSERT INTO funcionarios(nome, senha, cargo) VALUES(?,?,?)";
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, w.getName());
            stmt.setString(2, w.getPassword());
            stmt.setInt(3, w.getRole());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public ArrayList<User> read() {
        PreparedStatement stmt = null;
        ResultSet rs;
        ArrayList<User> list = new ArrayList<>();
        
        String sql = "SELECT * FROM `funcionarios`";
        
        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while(rs.next()) {
                User w = new User();
                w.setId(rs.getInt("id"));
                w.setName(rs.getString("nome"));
                w.setRole(rs.getInt("cargo"));
                
                list.add(w);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
        
        return list;
    }

    
    
    public boolean login(User u) {
        PreparedStatement stmt = null;
        
        String sql = "SELECT (nome, senha) FROM usuarios WHERE usuario=? AND senha=?";
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, u.getName());
            stmt.setString(2, u.getPassword());
            
            ResultSet result = stmt.executeQuery();
            
            if(result != null)
                return true;
        }catch(SQLException ex) {
            return false;
        }
        
        return false;
    }
}
