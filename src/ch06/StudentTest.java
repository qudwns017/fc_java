package ch06;

public class StudentTest {
    public static void main(String[] args) {
        Student Lee = new Student();
        Student Kim = new Student(3, "Kim", 4);

        System.out.println(Lee.showStudentInfo());
        System.out.println(Kim.showStudentInfo());

    }
}
