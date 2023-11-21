package ch04;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student();

        studentLee.studentID = 12345;
        studentLee.setStudentName("Lee");
        studentLee.address = "서울 강남";

        studentLee.showStudentInfo();

        Student studentKim = new Student();

        studentKim.studentID = 54321;
        studentKim.setStudentName("Kim");
        studentKim.address = "서울 강북";

        studentKim.showStudentInfo();
    }
}
