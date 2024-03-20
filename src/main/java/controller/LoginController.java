package controller;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import daos.AccountDAO;
import models.Account;
import org.springframework.security.crypto.bcrypt.BCrypt;
import views.LoginFrame;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.Arrays;

public class LoginController {
    private final LoginFrame view = createFrame();

    public LoginController() {
        initEvent();
    }

    private LoginFrame createFrame() {
        try {
            UIManager.setLookAndFeel(new FlatMacDarkLaf());
        } catch (UnsupportedLookAndFeelException e) {
            throw new RuntimeException(e);
        }
        LoginFrame loginFrame = new LoginFrame();
        loginFrame.setTitle("Login");
        loginFrame.setResizable(false);
        loginFrame.setLocationRelativeTo(null);
        return loginFrame;
    }

    private void initEvent() {
        view.getBtnLogin().addActionListener(this::loginAction);
        view.getBtnRegister().addActionListener(this::registerAction);
    }

    private void loginAction(ActionEvent actionEvent) {
        if(!view.getTxtUsername().getText().isBlank() && !(view.getTxtPassword().getPassword().length == 0)) {
            if(authenticate(view.getTxtUsername().getText(),view.getTxtPassword().getPassword())) {
                JOptionPane.showMessageDialog(null,"Login Successful!");
                view.dispose();
                Account account = AccountDAO.getInstance().getByAccount(view.getTxtUsername().getText());
                if(account.getType() == Account.LECTURER) {
                    new LecturerController();
                }
                if(account.getType() == Account.OFFICER) {
                    new OfficerController();
                }
            }
            else {
                JOptionPane.showMessageDialog(null,"Username or password is invalid!");
            }
        }
        else {
            JOptionPane.showMessageDialog(null,"Username or password mustn't blank!");
        }
    }

    private void registerAction(ActionEvent actionEvent) {
        view.dispose();
        new RegisterController();
    }

    private boolean authenticate(String username, char[] password) {
        Account account = AccountDAO.getInstance().getByAccount(username);
        if(account.getUsername() != null) {
            return BCrypt.checkpw(Arrays.toString(password),account.getPass());
        }
        return false;
    }


}
