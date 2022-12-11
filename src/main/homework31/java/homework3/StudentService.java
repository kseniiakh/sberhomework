package homework3;

import homework2.Student;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 3. Необходимо реализовать класс StudentService.
 * У класса должны быть реализованы следующие публичные методы:
 * ● bestStudent() — принимает массив студентов (класс Student из
 * предыдущего задания), возвращает лучшего студента (т.е. который
 * имеет самый высокий средний балл). Если таких несколько — вывести
 * любого.
 * ● sortBySurname() — принимает массив студентов (класс Student из
 * предыдущего задания) и сортирует его по фамилии.
 */

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

