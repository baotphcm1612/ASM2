package controller;

import com.formdev.flatlaf.FlatDarkLaf;
import daos.StudentDAO;
import models.Student;
import utils.FormatData;
import views.OfficerFrame;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.util.List;

public class OfficerController implements IController {
    private final OfficerFrame view = createFrame();
    private List<Student> studentList = StudentDAO.getInstance().getAll();

    private Student selectedStudent = null;

    public OfficerController() {
        initEvent();
        fillStudentTable();
    }

    private void initEvent() {
        view.getBtnNew().addActionListener(this::newAction);
        view.getBtnSave().addActionListener(this::saveAction);
        view.getBtnRefresh().addActionListener(this::refreshAction);
        view.getBtnDelete().addActionListener(this::deleteAction);
        view.getBtnSearch().addActionListener(this::searchAction);
        view.getTblStudentList().getSelectionModel().addListSelectionListener(this::selectRow);
    }



    private OfficerFrame createFrame() {
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (UnsupportedLookAndFeelException e) {
            throw new RuntimeException(e);
        }
        OfficerFrame officerFrame = new OfficerFrame();
        officerFrame.setTitle("Officer");
        officerFrame.setResizable(false);
        officerFrame.setLocationRelativeTo(null);
        officerFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        officerFrame.setVisible(true);
        return officerFrame;
    }

    private void newAction(ActionEvent actionEvent) {
        if (!view.getTxtID().getText().isBlank() && !view.getTxtName().getText().isBlank()) {
            if(!isValidInformation()) {
                JOptionPane.showMessageDialog(view,"Email or phone number is invalid");
                return;
            }
            Student student = getStudent();
            if(!isExisted() && StudentDAO.getInstance().insert(student) > 0) {
                studentList = StudentDAO.getInstance().getAll();
                fillStudentTable();
                selectedStudent = resultSearch(student.getId(),studentList);
                JOptionPane.showMessageDialog(view,"Add new student successful!");
            }
            else {
                JOptionPane.showMessageDialog(view,"ID is existed!");
            }
        }
        else {
            JOptionPane.showMessageDialog(view,"ID and name mustn't be empty!");
        }
    }



    private void saveAction(ActionEvent actionEvent) {
        if(selectedStudent != null) {
            if(StudentDAO.getInstance().update(selectedStudent) > 0) {
                if(!isValidInformation()) {
                    JOptionPane.showMessageDialog(view,"Email or phone number is invalid");
                    return;
                }
                studentList = StudentDAO.getInstance().getAll();
                selectedStudent = resultSearch(selectedStudent.getId(),studentList);
                fillStudentTable();
            }
            else {
                JOptionPane.showMessageDialog(view,"Nothing be changed");
            }
        }
        else {
            JOptionPane.showMessageDialog(view,"Something went wrong!");
        }
    }

    private void refreshAction(ActionEvent actionEvent) {
        clear();
        studentList = StudentDAO.getInstance().getAll();
        fillStudentTable();
    }

    private void clear() {
        selectedStudent = null;
        view.getTxtName().setText("");
        view.getTxtID().setText("");
        view.getTxtAddress().setText("");
        view.getTxtEmail().setText("");
        view.getTxtPhone().setText("");
        view.getTxtSearch().setText("");
        view.getRdoFemale().setSelected(true);
    }

    private void deleteAction(ActionEvent actionEvent) {
        if(!studentList.isEmpty() && selectedStudent != null) {
            StudentDAO.getInstance().delete(selectedStudent);
            studentList = StudentDAO.getInstance().getAll();
            clear();
            fillStudentTable();
        }
    }

    private void searchAction(ActionEvent actionEvent) {
        if (!view.getTxtSearch().getText().isBlank()) {
            Student student = resultSearch(view.getTxtSearch().getText(),studentList);
            if (student != null) {
                fillForm(student);
                selectedStudent = student;
            }
            else {
                JOptionPane.showMessageDialog(view,"Couldn't find this student!");
            }
        }
    }

    private void selectRow(ListSelectionEvent listSelectionEvent) {
        int selectedRow = view.getTblStudentList().getSelectedRow();
        if (selectedRow != -1) {
            selectedStudent = studentList.get(selectedRow);
            fillForm(selectedStudent);
        }
    }

    private void fillForm(Student student) {
        view.getTxtID().setText(student.getId());
        view.getTxtName().setText(student.getName());
        view.getTxtPhone().setText(student.getPhone());
        view.getTxtEmail().setText(student.getEmail());
        view.getTxtAddress().setText(student.getAddress());
        if (student.getGender().equals("FEMALE")) {
            view.getRdoFemale().setSelected(true);
        } else {
            view.getRdoMale().setSelected(true);
        }
    }

    private Student getStudent() {
        String id = view.getTxtID().getText();
        String name = view.getTxtName().getText();
        String email = view.getTxtEmail().getText();
        String phone = view.getTxtPhone().getText();
        String gender = view.getRdoFemale().isSelected() ? "FEMALE" : "MALE";
        String address = view.getTxtAddress().getText();
        return new Student(id,name,email,gender,phone,address);
    }

    private void fillStudentTable() {
        DefaultTableModel defaultTableModel = (DefaultTableModel) view.getTblStudentList().getModel();
        while (defaultTableModel.getRowCount() > 0) {
            defaultTableModel.removeRow(0);
        }
        for(Student student : studentList) {
            Object[] rowData = {student.getId(),student.getName(),student.getEmail(),
                    student.getPhone(),student.getAddress(),student.getGender()};
            defaultTableModel.addRow(rowData);
        }
    }

    private boolean isExisted() {
        String id_input = view.getTxtID().getText();
        return StudentDAO.getInstance().getByID(new Student(id_input)) != null;
    }

    private boolean isValidInformation() {
        String phone = view.getTxtPhone().getText();
        String email = view.getTxtEmail().getText();
        return FormatData.isEmail(email) && FormatData.isPhone(phone);
    }

}
