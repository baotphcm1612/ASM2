package controller;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import daos.GradeDAO;
import models.Student;
import views.LecturerFrame;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.util.Comparator;
import java.util.List;

public class LecturerController {
    private final LecturerFrame view = createFrame();
    private Student selectedStudent = null;
    private List<Student> studentList = GradeDAO.getInstance().getAll();

    public LecturerController() {
        initEvent();
        fillTheTable();
    }

    private void initEvent() {
        view.getBtnSave().addActionListener(this::saveAction);
        view.getBtnSearch().addActionListener(this::searchAction);
        view.getBtnRefresh().addActionListener(this::refreshAction);
        view.getBtnNext().addActionListener(this::nextAction);
        view.getBtnPre().addActionListener(this::previousAction);
        view.getBtnFirst().addActionListener(this::firstAction);
        view.getBtnFinal().addActionListener(this::lastAction);
        view.getBtnShowInfor().addActionListener(this::showInfoAction);
        view.getTblTopStudent().getSelectionModel().addListSelectionListener(this::selectRow);
    }

    private void saveAction(ActionEvent actionEvent) {
        if(selectedStudent != null) {
            selectedStudent.setMarkEnglish(Double.parseDouble(view.getTxtEnglish().getText()));
            selectedStudent.setMarkIT(Double.parseDouble(view.getTxtIT().getText()));
            selectedStudent.setMarkPhysicalEdu(Double.parseDouble(view.getTxtPE().getText()));
                if(GradeDAO.getInstance().update(selectedStudent) > 0) {
                    studentList = GradeDAO.getInstance().getAll();
                    selectedStudent = SearchStudent.resultSearch(selectedStudent.getId(),studentList);
                    fillTheTable();
                    fillForm();
                    JOptionPane.showMessageDialog(view,"Saved!");
                }
                else {
                    JOptionPane.showMessageDialog(view,"Error");
                }
        }
        else {
            JOptionPane.showMessageDialog(view, "Please choose a student!");
        }
    }

    private void searchAction(ActionEvent actionEvent) {
        if (!view.getTxtSearchID().getText().isBlank()) {
            Student student = SearchStudent.resultSearch(view.getTxtSearchID().getText(),studentList);
            if(student != null) {
                selectedStudent = student;
                fillForm();
            }
            else
                JOptionPane.showMessageDialog(view,"Couldn't find this student!");
        }
    }

    private void refreshAction(ActionEvent actionEvent) {
        clear();
    }

    private void clear() {
        selectedStudent = null;
        view.getTxtSearchID().setText("");
        view.getLblName().setText("none");
        view.getLblID().setText("none");
        view.getTxtAVG().setText("");
        view.getTxtPE().setText("");
        view.getTxtEnglish().setText("");
        view.getTxtIT().setText("");
        fillTheTable();
    }

    private void fillTheTable() {
        studentList.sort(Comparator.comparing(Student::getAVG).reversed());
        if(!studentList.isEmpty()) {
            DefaultTableModel defaultTableModel = (DefaultTableModel) view.getTblTopStudent().getModel();
            while (defaultTableModel.getRowCount() > 0) {
                defaultTableModel.removeRow(0);
            }
            for(int i = 0; i < 3; i++) {
                Student student = studentList.get(i);
                Object[] rowData = {student.getId(),student.getName(),student.getMarkEnglish(),
                        student.getMarkIT(),student.getMarkPhysicalEdu(),student.getAVG()};
                defaultTableModel.addRow(rowData);
            }
        }
    }

    private void nextAction(ActionEvent actionEvent) {
        if(studentList.isEmpty()) {
            JOptionPane.showMessageDialog(view,"Danh sách rỗng!");
            return;
        }
        int selectedIndex = SearchStudent.resultSearchIndex(selectedStudent, studentList);
        if(selectedIndex >= 0 && selectedIndex < studentList.size() - 1) {
            selectedStudent = studentList.get(selectedIndex + 1);
            fillForm();
        }
        else {
            selectedStudent = studentList.getFirst();
            fillForm();
        }
    }

    private void previousAction(ActionEvent actionEvent) {
        if(studentList.isEmpty()) {
            JOptionPane.showMessageDialog(view,"Danh sách rỗng!");
            return;
        }
        int selectedIndex = SearchStudent.resultSearchIndex(selectedStudent, studentList);
        if(selectedIndex > 0) {
            selectedStudent = studentList.get(selectedIndex - 1);
            fillForm();
        }
        else {
            selectedStudent = studentList.getLast();
            fillForm();
        }
    }

    private void firstAction(ActionEvent actionEvent) {
        if (!studentList.isEmpty()) {
            selectedStudent = studentList.getFirst();
            fillForm();
        }
    }

    private void lastAction(ActionEvent actionEvent) {
        if (!studentList.isEmpty()) {
            selectedStudent = studentList.getLast();
            fillForm();
        }
    }

    private void showInfoAction(ActionEvent actionEvent) {
        if(selectedStudent != null) {
            String msg = "ID: "+ selectedStudent.getId() + "\n"
                    + "Name: " + selectedStudent.getName() + "\n"
                    + "Phone:" + selectedStudent.getPhone() + "\n"
                    + "Email:" + selectedStudent.getEmail() + "\n"
                    + "Address: " + selectedStudent.getAddress();
            JOptionPane.showMessageDialog(view,msg,"Information",JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void selectRow(ListSelectionEvent listSelectionEvent) {
        int selectedRow = view.getTblTopStudent().getSelectedRow();
        if (selectedRow != -1) {
            selectedStudent = studentList.get(selectedRow);
            fillForm();
        }
    }

    private LecturerFrame createFrame() {
        try {
            UIManager.setLookAndFeel(new FlatMacDarkLaf());
        } catch (UnsupportedLookAndFeelException e) {
            throw new RuntimeException(e);
        }
        LecturerFrame lecturerFrame = new LecturerFrame();
        lecturerFrame.setTitle("Lecturer");
        lecturerFrame.setResizable(false);
        lecturerFrame.setLocationRelativeTo(null);
        return lecturerFrame;
    }



    private void fillForm() {
        view.getLblID().setText(selectedStudent.getId());
        view.getLblName().setText(selectedStudent.getName());
        view.getTxtEnglish().setText(selectedStudent.getMarkEnglish() + "");
        view.getTxtIT().setText(selectedStudent.getMarkIT() + "");
        view.getTxtPE().setText(selectedStudent.getMarkPhysicalEdu() + "");
        view.getTxtAVG().setText(selectedStudent.getAVG() + "");
    }
}
