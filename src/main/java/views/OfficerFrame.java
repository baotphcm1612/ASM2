/*
 * Created by JFormDesigner on Sun Mar 17 09:06:01 ICT 2024
 */

package views;

import controller.LoginController;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.border.*;
import javax.swing.table.*;

/**
 * @author Quoc Bao SOFT DEV
 */
public class OfficerFrame extends JFrame {
    public OfficerFrame() {
        initComponents();
        rdoFemale.setSelected(true);
        txtAddress.setLineWrap(true);
        txtAddress.setWrapStyleWord(true);
    }

    public JTextField getTxtID() {
        return txtID;
    }

    public JTextField getTxtName() {
        return txtName;
    }

    public JTextField getTxtEmail() {
        return txtEmail;
    }

    public JTextField getTxtPhone() {
        return txtPhone;
    }

    public JRadioButton getRdoFemale() {
        return rdoFemale;
    }

    public JRadioButton getRdoMale() {
        return rdoMale;
    }

    public JTextArea getTxtAddress() {
        return txtAddress;
    }

    public JButton getBtnRefresh() {
        return btnRefresh;
    }

    public JButton getBtnSave() {
        return btnSave;
    }

    public JButton getBtnNew() {
        return btnNew;
    }

    public JButton getBtnDelete() {
        return btnDelete;
    }

    public JTextField getTxtSearch() {
        return txtSearch;
    }

    public JButton getBtnSearch() {
        return btnSearch;
    }

    public JTable getTblStudentList() {
        return tblStudentList;
    }

    @Override
    public void dispose() {
        super.dispose();
        new LoginController();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - admin
        label1 = new JLabel();
        panel1 = new JPanel();
        label2 = new JLabel();
        txtID = new JTextField();
        lblName = new JLabel();
        lblEmail = new JLabel();
        lblPhone = new JLabel();
        lblGender = new JLabel();
        txtName = new JTextField();
        txtEmail = new JTextField();
        txtPhone = new JTextField();
        rdoFemale = new JRadioButton();
        rdoMale = new JRadioButton();
        scrollPane1 = new JScrollPane();
        txtAddress = new JTextArea();
        label7 = new JLabel();
        panel2 = new JPanel();
        btnRefresh = new JButton();
        btnSave = new JButton();
        btnNew = new JButton();
        btnDelete = new JButton();
        label8 = new JLabel();
        txtSearch = new JTextField();
        btnSearch = new JButton();
        panel3 = new JPanel();
        scrollPane2 = new JScrollPane();
        tblStudentList = new JTable();

        //======== this ========
        var contentPane = getContentPane();

        //---- label1 ----
        label1.setText("Student management");
        label1.setFont(new Font("Perpetua Titling MT", Font.PLAIN, 26));
        label1.setForeground(Color.white);
        label1.setBorder(null);

        //======== panel1 ========
        {
            panel1.setBorder(new BevelBorder(BevelBorder.LOWERED));
            panel1.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax . swing.
            border .EmptyBorder ( 0, 0 ,0 , 0) ,  "" , javax. swing .border . TitledBorder. CENTER
            ,javax . swing. border .TitledBorder . BOTTOM, new java. awt .Font ( "D\u0069alog", java .awt . Font
            . BOLD ,12 ) ,java . awt. Color .red ) ,panel1. getBorder () ) ); panel1. addPropertyChangeListener(
            new java. beans .PropertyChangeListener ( ){ @Override public void propertyChange (java . beans. PropertyChangeEvent e) { if( "\u0062order"
            .equals ( e. getPropertyName () ) )throw new RuntimeException( ) ;} } );

            //---- label2 ----
            label2.setText("ID:");

            //---- lblName ----
            lblName.setText("Name:");

            //---- lblEmail ----
            lblEmail.setText("Email:");

            //---- lblPhone ----
            lblPhone.setText("Phone:");

            //---- lblGender ----
            lblGender.setText("Gender:");

            //---- rdoFemale ----
            rdoFemale.setText("Female");

            //---- rdoMale ----
            rdoMale.setText("Male");

            //======== scrollPane1 ========
            {
                scrollPane1.setViewportView(txtAddress);
            }

            //---- label7 ----
            label7.setText("Address:");

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel1Layout.createParallelGroup()
                            .addComponent(lblGender)
                            .addComponent(label2)
                            .addComponent(lblName)
                            .addComponent(lblEmail)
                            .addComponent(lblPhone)
                            .addComponent(label7))
                        .addGap(18, 18, 18)
                        .addGroup(panel1Layout.createParallelGroup()
                            .addComponent(txtName)
                            .addComponent(txtEmail)
                            .addComponent(txtPhone)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup()
                                    .addComponent(txtID, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addComponent(rdoFemale)
                                        .addGap(45, 45, 45)
                                        .addComponent(rdoMale)))
                                .addGap(0, 135, Short.MAX_VALUE))
                            .addComponent(scrollPane1))
                        .addContainerGap())
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label2)
                            .addComponent(txtID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(lblName)
                            .addComponent(txtName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmail)
                            .addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPhone)
                            .addComponent(txtPhone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel1Layout.createParallelGroup()
                            .addComponent(lblGender)
                            .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(rdoFemale)
                                .addComponent(rdoMale)))
                        .addGap(18, 18, 18)
                        .addGroup(panel1Layout.createParallelGroup()
                            .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(label7)
                                .addGap(0, 37, Short.MAX_VALUE)))
                        .addContainerGap())
            );
        }

        //======== panel2 ========
        {

            //---- btnRefresh ----
            btnRefresh.setText("Refresh");
            btnRefresh.setIcon(new ImageIcon(getClass().getResource("/refresh-button.png")));

            //---- btnSave ----
            btnSave.setText("Save");
            btnSave.setIcon(new ImageIcon(getClass().getResource("/floppy-disk.png")));

            //---- btnNew ----
            btnNew.setText("New");
            btnNew.setIcon(new ImageIcon(getClass().getResource("/plus.png")));

            //---- btnDelete ----
            btnDelete.setIcon(new ImageIcon(getClass().getResource("/trash-bin.png")));
            btnDelete.setText("Del");

            //---- label8 ----
            label8.setText("ID:");

            //---- btnSearch ----
            btnSearch.setText("Search");
            btnSearch.setIcon(new ImageIcon(getClass().getResource("/search_mini.png")));

            GroupLayout panel2Layout = new GroupLayout(panel2);
            panel2.setLayout(panel2Layout);
            panel2Layout.setHorizontalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(label8)
                        .addGap(18, 18, 18)
                        .addGroup(panel2Layout.createParallelGroup()
                            .addComponent(btnSave)
                            .addComponent(btnRefresh, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSearch, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(panel2Layout.createParallelGroup()
                            .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnDelete, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnNew))
                            .addComponent(btnSearch))
                        .addContainerGap(63, Short.MAX_VALUE))
            );
            panel2Layout.setVerticalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSave, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNew, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRefresh, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSearch)
                            .addComponent(txtSearch, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label8))
                        .addGap(54, 54, 54))
            );
        }

        //======== panel3 ========
        {

            //======== scrollPane2 ========
            {

                //---- tblStudentList ----
                tblStudentList.setModel(new DefaultTableModel(
                    new Object[][] {
                    },
                    new String[] {
                        "ID", "Name", "Email", "Phone", "Address", "Gender"
                    }
                ) {
                    boolean[] columnEditable = new boolean[] {
                        false, false, false, false, false, false
                    };
                    @Override
                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return columnEditable[columnIndex];
                    }
                });
                {
                    TableColumnModel cm = tblStudentList.getColumnModel();
                    cm.getColumn(0).setPreferredWidth(50);
                    cm.getColumn(1).setPreferredWidth(100);
                    cm.getColumn(2).setPreferredWidth(100);
                    cm.getColumn(3).setPreferredWidth(100);
                    cm.getColumn(4).setPreferredWidth(150);
                    cm.getColumn(5).setPreferredWidth(80);
                }
                scrollPane2.setViewportView(tblStudentList);
            }

            GroupLayout panel3Layout = new GroupLayout(panel3);
            panel3.setLayout(panel3Layout);
            panel3Layout.setHorizontalGroup(
                panel3Layout.createParallelGroup()
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(scrollPane2, GroupLayout.DEFAULT_SIZE, 751, Short.MAX_VALUE)
                        .addContainerGap())
            );
            panel3Layout.setVerticalGroup(
                panel3Layout.createParallelGroup()
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(scrollPane2, GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                        .addContainerGap())
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(257, 257, 257)
                            .addComponent(label1))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(53, 53, 53)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(panel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(panel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))
                    .addContainerGap(13, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(label1)
                    .addGap(31, 31, 31)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(panel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap())
        );
        pack();
        setLocationRelativeTo(getOwner());

        //---- buttonGroup1 ----
        var buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(rdoFemale);
        buttonGroup1.add(rdoMale);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - admin
    private JLabel label1;
    private JPanel panel1;
    private JLabel label2;
    private JTextField txtID;
    private JLabel lblName;
    private JLabel lblEmail;
    private JLabel lblPhone;
    private JLabel lblGender;
    private JTextField txtName;
    private JTextField txtEmail;
    private JTextField txtPhone;
    private JRadioButton rdoFemale;
    private JRadioButton rdoMale;
    private JScrollPane scrollPane1;
    private JTextArea txtAddress;
    private JLabel label7;
    private JPanel panel2;
    private JButton btnRefresh;
    private JButton btnSave;
    private JButton btnNew;
    private JButton btnDelete;
    private JLabel label8;
    private JTextField txtSearch;
    private JButton btnSearch;
    private JPanel panel3;
    private JScrollPane scrollPane2;
    private JTable tblStudentList;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
