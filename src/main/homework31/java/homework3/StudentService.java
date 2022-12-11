package homework3;

import homework2.Student;

import java.util.Arrays;
import java.util.Comparator;

public class StudentService {


    public Student bestStudent(Student[] students) {
        Student bestStudent = students[0];
        for (int i = 1; i < students.length; i++) {
            if (students[i].calculateTheStudentGPA() > bestStudent.calculateTheStudentGPA()) {
                bestStudent = students[i];
            }
        }
        return bestStudent;
    }


    public Student[] sortBySurname(Student[] students) {

        Arrays.sort(students, Comparator.comparing(Student::getSurname));
        return students;
    }
}

