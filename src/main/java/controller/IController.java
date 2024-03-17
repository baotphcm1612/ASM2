package controller;

import models.Student;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public interface IController {
    default Student resultSearch(String id, List<Student> studentList) {
        studentList.sort(Comparator.comparing(Student::getId));
        Student temp = new Student();
        temp.setId(id);
        int index = Collections.binarySearch(studentList, temp, Comparator.comparing(Student::getId));
        if(index >= 0) {
            return studentList.get(index);
        }
        return null;
    }

    default int resultSearchIndex(String id, List<Student> studentList) {
        studentList.sort(Comparator.comparing(Student::getId));
        Student temp = new Student();
        temp.setId(id);
        return Collections.binarySearch(studentList, temp, Comparator.comparing(Student::getId));
    }

}
