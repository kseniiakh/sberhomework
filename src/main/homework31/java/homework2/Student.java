package homework2;

import java.util.Arrays;

public class Student {

    private String name;
    private String surname;
    private final int maxCountGrades = 10;
    private int countGrades = 0;
    private int[] grades = new int[maxCountGrades];

    public Student() {
    }

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public Student(String name, String surname, int[] grades) {
        this.name = name;
        this.surname = surname;
        this.setGrades(grades);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        if (grades.length > maxCountGrades) {
            System.arraycopy(grades, grades.length - maxCountGrades, this.grades, 0, maxCountGrades);
            countGrades = maxCountGrades;
        } else {
            int[] newGrades = new int[maxCountGrades];
            System.arraycopy(grades, 0, newGrades, 0, grades.length);
            this.grades = newGrades;
            countGrades = grades.length;
        }
    }

    public void addGrade() {
        if (countGrades < maxCountGrades) {
            countGrades += 1;
        }
    }

    public void setGrade(int grade) {
        if (countGrades < maxCountGrades) {
            grades[countGrades] = grade;
            addGrade();
        } else {
            System.arraycopy(grades, 1, grades, 0, grades.length - 1);
            grades[countGrades - 1] = grade;
        }
    }

    public double calculateTheStudentGPA() {

        if (countGrades == 0) {
            return 0;
        }

        int sum = 0;
        for (int i = 0; i < countGrades; i++) {
            sum += grades[i];
        }
        return (double) sum / countGrades;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }
}
