package controller;

import models.Student;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SearchStudent {
    public static Student resultSearch(String id, List<Student> studentList) {
        studentList.sort(Comparator.comparing(Student::getId));
        Student temp = new Student();
        temp.setId(id);
        int index = Collections.binarySearch(studentList, temp, Comparator.comparing(Student::getId));
        if(index >= 0) {
            return studentList.get(index);
        }
        return null;
    }

    public static int resultSearchIndex(Student student, List<Student> studentList) {
        studentList.sort(Comparator.comparing(Student::getId).reversed());
        return studentList.indexOf(student);
    }
}
