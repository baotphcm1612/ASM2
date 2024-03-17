package controller;

import com.formdev.flatlaf.FlatDarkLaf;
import daos.AccountDAO;
import models.Account;
import org.springframework.security.crypto.bcrypt.BCrypt;
import views.RegisterFrame;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.Arrays;

public class RegisterController {
    private final RegisterFrame view = createFrame();

    public RegisterController() {
        initEvent();
    }

    private void initEvent() {
        view.getBtnRegister().addActionListener(this::registerAction);
    }

    private RegisterFrame createFrame() {
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (UnsupportedLookAndFeelException e) {
            throw new RuntimeException(e);
        }
        RegisterFrame registerFrame = new RegisterFrame();
        registerFrame.setTitle("Register");
        registerFrame.setResizable(false);
        registerFrame.setLocationRelativeTo(null);
        return registerFrame;
    }

    private void registerAction(ActionEvent actionEvent) {
        String username = view.getTxtUsername().getText();
        char[] password = view.getTxtPassword().getPassword();
        if(!username.isBlank() && password.length > 0) {
            if(Arrays.equals(password, view.getTxtREPassword().getPassword())) {
                if(createNewAccount(username,password)) {
                    JOptionPane.showMessageDialog(view,"Register successful!");
                    view.dispose();
                }
                else {
                    JOptionPane.showMessageDialog(view,"Username is existed!");
                }
            }
            else {
                JOptionPane.showMessageDialog(view,"Two password are not the same!");
            }
        }
    }

    private boolean createNewAccount(String username, char[] password) {
        if(AccountDAO.getInstance().getByAccount(username).getUsername() == null) {
            String pass = BCrypt.hashpw(Arrays.toString(password),BCrypt.gensalt());
            return AccountDAO.getInstance().insert(new Account(username,pass,view.getCboType().getSelectedIndex())) > 0;
        }
        return false;
    }

}
