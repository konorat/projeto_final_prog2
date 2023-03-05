/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.LoginVIew;
import model.User;
import model.dao.UserDAO;

/**
 *
 * @author aluno
 */
public class LoginController {
    private LoginVIew view;
    private User user;
    private UserDAO userdao;
    
    public LoginController() {
        view = new LoginVIew();
        userdao = UserDAO.getInstance();
        
        view.getBtnSend().addActionListener((e) -> {
            login();
        });
    }
    
    private void login() {
        User user = new User();
        
        user.setName(view.getTxtUser().getText());
        user.setPassword(view.getTxtPassword().getText());
        
        userdao = UserDAO.getInstance();
        
        if(userdao.login(user)) {
            
        }
        
        
    }
}
