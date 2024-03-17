/*
 * Created by JFormDesigner on Sat Mar 16 17:28:07 ICT 2024
 */

package views;

import controller.LoginController;

import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author Quoc Bao SOFT DEV
 */
public class RegisterFrame extends JFrame {
    public RegisterFrame() {
        initComponents();
    }

    @Override
    public void dispose() {
        super.dispose();
        new LoginController();
    }

    public JComboBox<String> getCboType() {
        return cboType;
    }

    public void setCboType(JComboBox<String> cboType) {
        this.cboType = cboType;
    }

    public JTextField getTxtUsername() {
        return txtUsername;
    }

    public void setTxtUsername(JTextField txtUsername) {
        this.txtUsername = txtUsername;
    }

    public JPasswordField getTxtPassword() {
        return txtPassword;
    }

    public void setTxtPassword(JPasswordField txtPassword) {
        this.txtPassword = txtPassword;
    }

    public JPasswordField getTxtREPassword() {
        return txtREPassword;
    }

    public void setTxtREPassword(JPasswordField txtREPassword) {
        this.txtREPassword = txtREPassword;
    }

    public JButton getBtnRegister() {
        return btnRegister;
    }

    public void setBtnRegister(JButton btnRegister) {
        this.btnRegister = btnRegister;
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - admin
        panel1 = new JPanel();
        label1 = new JLabel();
        txtUsername = new JTextField();
        label2 = new JLabel();
        txtPassword = new JPasswordField();
        label3 = new JLabel();
        txtREPassword = new JPasswordField();
        btnRegister = new JButton();
        cboType = new JComboBox<>();

        //======== this ========
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        var contentPane = getContentPane();

        //======== panel1 ========
        {
            panel1.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax
            .swing.border.EmptyBorder(0,0,0,0), "",javax.swing
            .border.TitledBorder.CENTER,javax.swing.border.TitledBorder.BOTTOM,new java.awt.
            Font("Dialo\u0067",java.awt.Font.BOLD,12),java.awt.Color.red
            ),panel1. getBorder()));panel1. addPropertyChangeListener(new java.beans.PropertyChangeListener(){@Override
            public void propertyChange(java.beans.PropertyChangeEvent e){if("borde\u0072".equals(e.getPropertyName(
            )))throw new RuntimeException();}});

            //---- label1 ----
            label1.setText("Username:");

            //---- label2 ----
            label2.setText("Password:");

            //---- label3 ----
            label3.setText("Password:");

            //---- btnRegister ----
            btnRegister.setText("Register");

            //---- cboType ----
            cboType.setModel(new DefaultComboBoxModel<>(new String[] {
                "Lecturer",
                "Officer"
            }));

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(panel1Layout.createParallelGroup()
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addComponent(label1)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtUsername, GroupLayout.PREFERRED_SIZE, 330, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addGroup(panel1Layout.createParallelGroup()
                                            .addComponent(label2)
                                            .addComponent(label3))
                                        .addGap(20, 20, 20)
                                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtPassword, GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                                            .addComponent(txtREPassword, GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)))))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(201, 201, 201)
                                .addComponent(btnRegister)
                                .addGap(41, 41, 41)
                                .addComponent(cboType, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(42, Short.MAX_VALUE))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(label1))
                            .addComponent(txtUsername, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(label2))
                            .addComponent(txtPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(txtREPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label3))
                        .addGap(18, 18, 18)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRegister)
                            .addComponent(cboType, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(12, Short.MAX_VALUE))
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(40, 40, 40)
                    .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(35, 35, 35))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(72, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - admin
    private JPanel panel1;
    private JLabel label1;
    private JTextField txtUsername;
    private JLabel label2;
    private JPasswordField txtPassword;
    private JLabel label3;
    private JPasswordField txtREPassword;
    private JButton btnRegister;
    private JComboBox<String> cboType;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
