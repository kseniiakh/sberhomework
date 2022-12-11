package homework3;

import homework2.Student;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Student[] students = new Student[]{
                new Student("Артем", "Якович", new int[]{5, 5, 5, 5, 5, 5}),
                new Student("Николай", "Скольников", new int[]{3, 3, 4, 4, 3, 4}),
                new Student("Анна", "Пряникова", new int[]{5, 5, 5, 4, 5, 5}),
                new Student("Артем", "Хинкевич", new int[]{2, 3, 5, 5, 5, 2}),
                new Student("Ксения", "Пускова", new int[]{4, 3, 4, 4, 5, 3})};

        StudentService studentService = new StudentService();

        Student bestStudent = studentService.bestStudent(students);
        System.out.println(bestStudent.toString());

        Student[] sortStudent = studentService.sortBySurname(students);
        System.out.println(Arrays.toString(sortStudent));

    }
}

