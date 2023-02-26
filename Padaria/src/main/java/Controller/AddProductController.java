/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Aluno;
import View.AddProduct;
import View.MainView;

/**
 *
 * @author Levy
 */
public class AddProductController {
    
    private AddProduct addAlunoView;
    private Aluno aluno;
    
    public AddProductController() {
        addAlunoView = new AddProduct();
        aluno = new Aluno();
        
        MainView mainview = new MainView();
        
        mainview.add(addAlunoView);
        
        addAlunoView.setVisible(true);
    }
    
}
