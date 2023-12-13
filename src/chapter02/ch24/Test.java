package chapter02.ch24;

public class Test {
    public static void main(String[] args) {
        Student lee = new Student("Lee");

        lee.addSubject("국어", 100);
        lee.addSubject("수학", 50);

        Student kim = new Student("Kim");

        kim.addSubject("국어", 70);
        kim.addSubject("수학", 85);
        kim.addSubject("영어", 100);

        kim.showStudentInfo();
        System.out.println("================================");
        lee.showStudentInfo();
    }


}
