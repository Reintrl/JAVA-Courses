package HomeWork15.Task3;

import java.util.ArrayList;

public class Student {
    private String name;
    private int groupNum;
    private int courseNum;
    private ArrayList<Integer> marks;

    public Student(String name, int groupNum, int courseNum, ArrayList<Integer> marks) {
        this.name = name;
        this.groupNum = groupNum;
        this.courseNum = courseNum;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getGroupNum() {
        return groupNum;
    }

    public int getCourseNum() {
        return courseNum;
    }

    public void setCourseNum(int courseNum) {
        this.courseNum = courseNum;
    }

    public ArrayList<Integer> getMarks() {
        return marks;
    }

    public double getAverageMark() {
        if (marks == null || marks.isEmpty()) {
            return 0.0;
        }
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return (double) sum / marks.size();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", groupNum=" + groupNum +
                ", courseNum=" + courseNum +
                ", marks=" + marks +
                '}';
    }

    public static void processStudents(ArrayList<Student> students) {
        for (int i = 0; i < students.size(); ) {
            Student student = students.get(i);
            double average = student.getAverageMark();
            if (average < 3.0) {
                students.remove(i);
            } else {
                student.setCourseNum(student.getCourseNum() + 1);
                i++;
            }
        }
    }

    public static void printStudents(ArrayList<Student> students, int course) {
        System.out.println("Студенты " + course + " курса:");
        for (Student student : students) {
            if (student.getCourseNum() == course) {
                System.out.println(student.getName());
            }
        }
    }
}
