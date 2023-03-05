/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.ManagerView;
import javax.swing.JOptionPane;

/**
 *
 * @author Levy
 */
public class ManagerController {
    private ManagerView view;
    
    public ManagerController() {
        view = new ManagerView();

        view.setVisible(true);
        
        view.getBtnInsertUser().addActionListener((e) -> {
            new ManageUsersController();
        });
        
        listValues();
    }
    
    private void listValues() {
        
    }
}
