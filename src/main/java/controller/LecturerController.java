package controller;

import com.formdev.flatlaf.FlatDarkLaf;
import daos.StudentDAO;
import models.Student;
import views.LecturerFrame;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.util.List;

public class LecturerController implements IController {
    private final LecturerFrame view = createFrame();
    private Student selectedStudent = null;
    private List<Student> studentList = StudentDAO.getInstance().getAll();
    private List<Student> studentTopList = StudentDAO.getInstance().getTopStudent();

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
            if (getStudent() != null) {
                selectedStudent = getStudent();
                if(StudentDAO.getInstance().update(getStudent()) > 0) {
                    studentList = StudentDAO.getInstance().getAll();
                    studentTopList = StudentDAO.getInstance().getTopStudent();
                    fillTheTable();
                    fillForm();
                    selectedStudent = resultSearch(selectedStudent.getId(),studentList);
                    JOptionPane.showMessageDialog(view,"Saved!");
                }
                else {
                    JOptionPane.showMessageDialog(view,"Error");
                }
            }
        }
        else {
            JOptionPane.showMessageDialog(view, "Please choose a student!");
        }
    }

    private void searchAction(ActionEvent actionEvent) {
        if (!view.getTxtSearchID().getText().isBlank()) {
            Student student = resultSearch(view.getTxtSearchID().getText(),studentList);
            if(student != null) {
                selectedStudent = student;
                fillForm();
            }
            else
                JOptionPane.showMessageDialog(view,"Couldn't find this student!");
        }
    }

    private void refreshAction(ActionEvent actionEvent) {
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
        if(!studentTopList.isEmpty()) {
            DefaultTableModel defaultTableModel = (DefaultTableModel) view.getTblTopStudent().getModel();
            while (defaultTableModel.getRowCount() > 0) {
                defaultTableModel.removeRow(0);
            }
            for(Student student : studentTopList) {
                Object[] rowData = {student.getId(),student.getName(),student.getMarkEnglish(),
                        student.getMarkIT(),student.getMarkPhysicalEdu(),student.getAVG()};
                defaultTableModel.addRow(rowData);
            }
        }
    }

    private void nextAction(ActionEvent actionEvent) {
        int selectedIndex = resultSearchIndex(selectedStudent.getId(), studentList);
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
        int selectedIndex = resultSearchIndex(selectedStudent.getId(), studentList);
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
            String msg = selectedStudent.getId() + "\n"
                    + selectedStudent.getName() + "\n"
                    + selectedStudent.getPhone() + "\n"
                    + selectedStudent.getEmail() + "\n"
                    +selectedStudent.getAddress();
            JOptionPane.showMessageDialog(view,msg,"Information",JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void selectRow(ListSelectionEvent listSelectionEvent) {
        int selectedRow = view.getTblTopStudent().getSelectedRow();
        if (selectedRow != -1) {
            selectedStudent = studentTopList.get(selectedRow);
            fillForm();
        }
    }

    private LecturerFrame createFrame() {
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (UnsupportedLookAndFeelException e) {
            throw new RuntimeException(e);
        }
        LecturerFrame lecturerFrame = new LecturerFrame();
        lecturerFrame.setTitle("Lecturer");
        lecturerFrame.setResizable(false);
        lecturerFrame.setLocationRelativeTo(null);
        return lecturerFrame;
    }

    private Student getStudent() {
        try {
            String id = view.getLblID().getText();
            String name = view.getLblName().getText();
            double markEnglish =  Double.parseDouble(view.getTxtEnglish().getText());
            double markIT = Double.parseDouble(view.getTxtIT().getText());
            double markPE = Double.parseDouble(view.getTxtPE().getText());
            if(markEnglish > 10 || markEnglish < 0 || markIT > 10 || markIT < 0 || markPE > 10 || markPE < 0 ) {
                JOptionPane.showMessageDialog(view,"Marks must be in range [0 - 10]");
                return null;
            }
            return new Student(id,name,markEnglish,markIT,markPE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(view,"Mark is invalid");
            return null;
        }
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
