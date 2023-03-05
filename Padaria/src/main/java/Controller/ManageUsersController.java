/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.ManageUsersView;
import model.User;
import model.dao.UserDAO;

/**
 *
 * @author aluno
 */
public class ManageUsersController {
    private ManageUsersView view;
    private UserDAO userdao;
    
    public ManageUsersController() {
        view = new ManageUsersView();
        view.setVisible(true);
        
        view.getBtnInsert().addActionListener((e) -> {
            User u = new User();
            userdao = new UserDAO();

            u.setName(view.getTxtName().getText());
            u.setPassword(view.getTxtPassword().getText());
            u.setRole(view.getComboboxRole().getSelectedIndex()+1);

            userdao.create(u);
        });
    }
}
