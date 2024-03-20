/*
 * Created by JFormDesigner on Sat Mar 16 18:46:59 ICT 2024
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
public class LecturerFrame extends JFrame {
    public LecturerFrame() {
        initComponents();
    }

    public JTextField getTxtSearchID() {
        return txtSearchID;
    }

    public void setTxtSearchID(JTextField txtSearchID) {
        this.txtSearchID = txtSearchID;
    }

    public JButton getBtnSearch() {
        return btnSearch;
    }

    public void setBtnSearch(JButton btnSearch) {
        this.btnSearch = btnSearch;
    }

    public JLabel getLblName() {
        return lblName;
    }

    public void setLblName(JLabel lblName) {
        this.lblName = lblName;
    }

    public JLabel getLblID() {
        return lblID;
    }

    public void setLblID(JLabel lblID) {
        this.lblID = lblID;
    }

    public JTextField getTxtPE() {
        return txtPE;
    }

    public void setTxtPE(JTextField txtPE) {
        this.txtPE = txtPE;
    }

    public JTextField getTxtIT() {
        return txtIT;
    }

    public void setTxtIT(JTextField txtIT) {
        this.txtIT = txtIT;
    }

    public JTextField getTxtEnglish() {
        return txtEnglish;
    }

    public void setTxtEnglish(JTextField txtEnglish) {
        this.txtEnglish = txtEnglish;
    }

    public JTextField getTxtAVG() {
        return txtAVG;
    }

    public void setTxtAVG(JTextField txtAVG) {
        this.txtAVG = txtAVG;
    }

    public JButton getBtnSave() {
        return btnSave;
    }

    public void setBtnSave(JButton btnSave) {
        this.btnSave = btnSave;
    }

    public JTable getTblTopStudent() {
        return tblTopStudent;
    }

    public void setTblTopStudent(JTable tblTopStudent) {
        this.tblTopStudent = tblTopStudent;
    }

    public JButton getBtnRefresh() {
        return btnRefresh;
    }

    public JButton getBtnNext() {
        return btnNext;
    }

    public void setBtnNext(JButton btnNext) {
        this.btnNext = btnNext;
    }

    public JButton getBtnPre() {
        return btnPre;
    }

    public void setBtnPre(JButton btnPre) {
        this.btnPre = btnPre;
    }

    public JButton getBtnFinal() {
        return btnFinal;
    }

    public void setBtnFinal(JButton btnFinal) {
        this.btnFinal = btnFinal;
    }

    public JButton getBtnFirst() {
        return btnFirst;
    }

    public void setBtnFirst(JButton btnFirst) {
        this.btnFirst = btnFirst;
    }

    @Override
    public void dispose() {
        super.dispose();
        new LoginController();
    }

    public JButton getBtnShowInfor() {
        return btnShowInfor;
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - admin
        panel1 = new JPanel();
        label2 = new JLabel();
        txtSearchID = new JTextField();
        btnSearch = new JButton();
        label1 = new JLabel();
        panel2 = new JPanel();
        label3 = new JLabel();
        lblName = new JLabel();
        label5 = new JLabel();
        lblID = new JLabel();
        label7 = new JLabel();
        label8 = new JLabel();
        label9 = new JLabel();
        txtPE = new JTextField();
        txtIT = new JTextField();
        txtEnglish = new JTextField();
        txtAVG = new JTextField();
        btnNext = new JButton();
        btnPre = new JButton();
        btnFinal = new JButton();
        btnFirst = new JButton();
        btnShowInfor = new JButton();
        panel3 = new JPanel();
        btnSave = new JButton();
        btnRefresh = new JButton();
        panel4 = new JPanel();
        scrollPane1 = new JScrollPane();
        tblTopStudent = new JTable();

        //======== this ========
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        var contentPane = getContentPane();

        //======== panel1 ========
        {
            panel1.setBorder(new TitledBorder("Search"));
            panel1.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing.border
            .EmptyBorder(0,0,0,0), "",javax.swing.border.TitledBorder.CENTER,javax
            .swing.border.TitledBorder.BOTTOM,new java.awt.Font("Dia\u006cog",java.awt.Font.BOLD,
            12),java.awt.Color.red),panel1. getBorder()));panel1. addPropertyChangeListener(new java.beans
            .PropertyChangeListener(){@Override public void propertyChange(java.beans.PropertyChangeEvent e){if("bord\u0065r".equals(e.
            getPropertyName()))throw new RuntimeException();}});

            //---- label2 ----
            label2.setText("Student ID:");
            label2.setFont(new Font("Inter", Font.PLAIN, 14));

            //---- btnSearch ----
            btnSearch.setText("  Search");
            btnSearch.setIcon(new ImageIcon(getClass().getResource("/search.png")));
            btnSearch.setBorder(LineBorder.createBlackLineBorder());

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(label2)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSearchID, GroupLayout.PREFERRED_SIZE, 370, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addComponent(btnSearch, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addContainerGap(32, Short.MAX_VALUE)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label2)
                            .addComponent(txtSearchID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearch, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))
            );
        }

        //---- label1 ----
        label1.setText("Student mark management");
        label1.setFont(new Font("Perpetua Titling MT", Font.PLAIN, 26));
        label1.setForeground(Color.white);
        label1.setBorder(null);

        //======== panel2 ========
        {
            panel2.setBorder(new LineBorder(Color.white));

            //---- label3 ----
            label3.setText("Name:");

            //---- lblName ----
            lblName.setText("none");
            lblName.setForeground(new Color(0x33ffff));

            //---- label5 ----
            label5.setText("ID:");

            //---- lblID ----
            lblID.setText("none");
            lblID.setForeground(new Color(0xff99cc));

            //---- label7 ----
            label7.setText("English:");

            //---- label8 ----
            label8.setText("IT:");

            //---- label9 ----
            label9.setText("Physical Edu:");

            //---- txtAVG ----
            txtAVG.setBorder(new TitledBorder("AVG"));
            txtAVG.setEnabled(false);
            txtAVG.setForeground(new Color(0x66ff66));

            //---- btnNext ----
            btnNext.setText("Nex");

            //---- btnPre ----
            btnPre.setText("Pre");

            //---- btnFinal ----
            btnFinal.setText("End");

            //---- btnFirst ----
            btnFirst.setText("Fir");

            //---- btnShowInfor ----
            btnShowInfor.setText("Info");

            GroupLayout panel2Layout = new GroupLayout(panel2);
            panel2.setLayout(panel2Layout);
            panel2Layout.setHorizontalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(panel2Layout.createParallelGroup()
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addGroup(panel2Layout.createParallelGroup()
                                    .addComponent(label3)
                                    .addComponent(label5))
                                .addGap(18, 18, 18)
                                .addGroup(panel2Layout.createParallelGroup()
                                    .addComponent(lblID, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblName, GroupLayout.PREFERRED_SIZE, 254, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(192, Short.MAX_VALUE))
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addGroup(panel2Layout.createParallelGroup()
                                    .addComponent(label9)
                                    .addComponent(label8)
                                    .addComponent(label7))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPE, GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                    .addComponent(txtIT, GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                    .addComponent(txtEnglish, GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                                .addGroup(panel2Layout.createParallelGroup()
                                    .addGroup(GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                                        .addComponent(btnFirst, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnPre, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnNext, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnFinal, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
                                        .addGap(23, 23, 23))
                                    .addGroup(GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                                        .addGroup(panel2Layout.createParallelGroup()
                                            .addComponent(btnShowInfor)
                                            .addComponent(txtAVG, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE))
                                        .addGap(110, 110, 110))))))
            );
            panel2Layout.setVerticalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGroup(panel2Layout.createParallelGroup()
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label3)
                                    .addComponent(lblName))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label5)
                                    .addComponent(lblID)))
                            .addGroup(GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnShowInfor)))
                        .addGap(18, 18, 18)
                        .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label7)
                            .addComponent(txtEnglish, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAVG, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label8)
                            .addComponent(txtIT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label9)
                            .addComponent(txtPE, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFirst)
                            .addComponent(btnPre)
                            .addComponent(btnNext)
                            .addComponent(btnFinal))
                        .addContainerGap(23, Short.MAX_VALUE))
            );
        }

        //======== panel3 ========
        {

            //---- btnSave ----
            btnSave.setText("Save");
            btnSave.setIcon(new ImageIcon(getClass().getResource("/floppy-disk.png")));

            //---- btnRefresh ----
            btnRefresh.setText("Refresh");
            btnRefresh.setIcon(new ImageIcon(getClass().getResource("/refresh-button.png")));

            GroupLayout panel3Layout = new GroupLayout(panel3);
            panel3.setLayout(panel3Layout);
            panel3Layout.setHorizontalGroup(
                panel3Layout.createParallelGroup()
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSave, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRefresh, GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE))
                        .addGap(0, 71, Short.MAX_VALUE))
            );
            panel3Layout.setVerticalGroup(
                panel3Layout.createParallelGroup()
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnSave, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(btnRefresh, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
            );
        }

        //======== panel4 ========
        {
            panel4.setBorder(new TitledBorder("Top 3"));

            //======== scrollPane1 ========
            {

                //---- tblTopStudent ----
                tblTopStudent.setModel(new DefaultTableModel(
                    new Object[][] {
                    },
                    new String[] {
                        "ID", "Name", "English", "IT", "PE", "AVG"
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
                    TableColumnModel cm = tblTopStudent.getColumnModel();
                    cm.getColumn(0).setResizable(false);
                    cm.getColumn(0).setPreferredWidth(55);
                }
                scrollPane1.setViewportView(tblTopStudent);
            }

            GroupLayout panel4Layout = new GroupLayout(panel4);
            panel4.setLayout(panel4Layout);
            panel4Layout.setHorizontalGroup(
                panel4Layout.createParallelGroup()
                    .addGroup(panel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 711, Short.MAX_VALUE)
                        .addContainerGap())
            );
            panel4Layout.setVerticalGroup(
                panel4Layout.createParallelGroup()
                    .addGroup(panel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                        .addContainerGap())
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(203, 203, 203)
                    .addComponent(label1)
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap(21, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(11, 11, 11)
                            .addComponent(panel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                            .addComponent(panel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addGap(24, 24, 24))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(panel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 64, Short.MAX_VALUE))))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(label1)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                    .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(61, 61, 61)
                            .addComponent(panel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(panel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(panel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap())
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - admin
    private JPanel panel1;
    private JLabel label2;
    private JTextField txtSearchID;
    private JButton btnSearch;
    private JLabel label1;
    private JPanel panel2;
    private JLabel label3;
    private JLabel lblName;
    private JLabel label5;
    private JLabel lblID;
    private JLabel label7;
    private JLabel label8;
    private JLabel label9;
    private JTextField txtPE;
    private JTextField txtIT;
    private JTextField txtEnglish;
    private JTextField txtAVG;
    private JButton btnNext;
    private JButton btnPre;
    private JButton btnFinal;
    private JButton btnFirst;
    private JButton btnShowInfor;
    private JPanel panel3;
    private JButton btnSave;
    private JButton btnRefresh;
    private JPanel panel4;
    private JScrollPane scrollPane1;
    private JTable tblTopStudent;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
