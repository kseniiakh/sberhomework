package homework2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Student student = new Student("Николай", "Иванов");

        for (int i = 1; i < 14; i++) {
            student.setGrade(i);
            System.out.println(Arrays.toString(student.getGrades()));
        }

        int[] grades1 = new int[]{21, 22, 23};
        student.setGrades(grades1);
        System.out.println(Arrays.toString(student.getGrades()));

        int[] grades2 = new int[]{31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43};
        student.setGrades(grades2);
        System.out.println(Arrays.toString(student.getGrades()));

        double GPA = student.calculateTheStudentGPA();
        System.out.println(GPA);
    }
}
