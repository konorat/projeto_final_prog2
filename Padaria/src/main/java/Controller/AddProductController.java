/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import model.Product;
import View.ProductView;
import View.MainView;

/**
 *
 * @author Levy
 */
public class AddProductController {
    
    private ProductView addProductView;
    private Product product;
    
    public AddProductController() {
        addProductView = new ProductView();
        product = new Product();
        
        MainView mainview = new MainView();
        
        mainview.add(addProductView);
        
        addProductView.setVisible(true);
    }
    
}
