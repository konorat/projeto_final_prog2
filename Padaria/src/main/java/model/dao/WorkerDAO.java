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
import model.Worker;

/**
 *
 * @author Levy
 */
public class WorkerDAO {
    public void create(Worker w) {
        Connection con = ConnectionFactory.getConnection();
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
    
    public ArrayList<Worker> read() {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs;
        ArrayList<Worker> list = new ArrayList<>();
        
        String sql = "SELECT * FROM `funcionarios`";
        
        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while(rs.next()) {
                Worker w = new Worker();
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
}
