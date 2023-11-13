package grades;

import java.util.ArrayList;

public class Student {

    protected String name;

    ArrayList<Integer> grades = new ArrayList<>();

    protected double average;

    public Student(String name, int grades) {
        this.name = name;
        this.grades.add(grades);
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name: " + name + '\'' +
                ", Current Average:" + average +
                '}';
    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    public double getGradeAverage() {
        int sum = 0;
        for (Integer grade : grades) {
            sum += grade;
        }
        return (double) sum /grades.size();
    }
}
