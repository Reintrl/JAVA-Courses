package HomeWork15.Task3;

import java.util.ArrayList;
import java.util.List;

import static HomeWork15.Task3.Student.printStudents;
import static HomeWork15.Task3.Student.processStudents;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Ламеко Данила", 101, 1, new ArrayList<>(List.of(4, 5, 3, 4))));
        students.add(new Student("Владислав", 102, 2, new ArrayList<>(List.of(3, 3, 2, 3))));
        students.add(new Student("Анна", 101, 1, new ArrayList<>(List.of(5, 5, 5, 5))));
        students.add(new Student("Анастасия Сергеевна", 103, 3, new ArrayList<>(List.of(2, 2, 3, 2))));
        students.add(new Student("Владимир Владимирович", 102, 2, new ArrayList<>(List.of(4, 4, 4, 5))));

        System.out.println("Исходный список студентов:");
        for (Student student : students) {
            System.out.println(student);
        }

        processStudents(students);

        System.out.println("\nСписок студентов после обработки:");
        for (Student student : students) {
            System.out.println(student);
        }

        printStudents(students, 2);
    }
}
