package grades;

public class StudentTest {

    public static void main(String[] args) {
        Student student = new Student("Kyle", 100);
        student.addGrade(70);
        student.addGrade(50);
        System.out.println(student.toString());

    }

}
