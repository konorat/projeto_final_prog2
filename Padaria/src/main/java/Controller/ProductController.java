/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.ProductView;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Product;
import model.dao.ProductDAO;

/**
 *
 * @author Levy
 */
public class ProductController {
    
    private ProductView view;
    private ProductDAO productdao;
    
    public ProductController() {
        
        view = new ProductView();
        productdao = ProductDAO.getInstance();
        
        
        view.getBtnExit().addActionListener((ActionEvent e) ->{
            exit();
        });
        
   
        view.getBtnInsert().addActionListener((ActionEvent e)->{
            insertProduct();
        });
        

    }
    
    private void insertProduct(){
        Product p = new Product();           
        p.setName(view.getTxtName().getText());
        p.setPrice(Double.parseDouble(view.getTxtPrice().getText()));
        
        productdao.create(p);
        
        listValues();
        
    }
    
    private void listValues() {
        try {            
            DefaultTableModel model = (DefaultTableModel) view.getTbProducts().getModel();
            model.setNumRows(0);
            
            ArrayList<Product> list = productdao.read();
            
//            for(int i = 0; i < list.size(); i++) {;
//                model.addRow(new Object[]{
//                   list.get(i).getCode(),
//                   list.get(i).getName(),
//                   list.get(i).getPrice(),
//                   list.get(i).getQnt()
//                });
//            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar valores: " + e);
        }
    }
    
    
    private void exit(){
        view.dispose();
    }
    
}
