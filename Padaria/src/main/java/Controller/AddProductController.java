/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import model.Product;
import View.AddProduct;
import View.MainView;

/**
 *
 * @author Levy
 */
public class AddProductController {
    
    private AddProduct addAlunoView;
    private Product product;
    
    public AddProductController() {
        addAlunoView = new AddProduct();
        product = new Product();
        
        MainView mainview = new MainView();
        
        mainview.add(addAlunoView);
        
        addAlunoView.setVisible(true);
    }
    
}
