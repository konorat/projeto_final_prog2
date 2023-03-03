/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.ProductView;
import java.awt.event.ActionEvent;
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
        
   
        view.getBtnExit().addActionListener((ActionEvent e)->{
            insertProduct();
        });
        

    }
    
    private void insertProduct(){
        Product p = new Product();
                
        p.setName(view.getTxtName().getText());
        p.setCode(Integer.parseInt(view.getTxtCode().getText()));
        p.setPrice(Double.parseDouble(view.getTxtPrice().getText()));
        p.setQnt(Integer.parseInt(view.getTxtQnt().getText()));
        
        dao.create(p);
        
        listValues();
        
    }
    
    
    private void exit(){
        view.dispose();
    }
    
}
