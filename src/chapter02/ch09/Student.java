package chapter02.ch09;

public class Student {
    int studentId;
    String studentName;

    Subject korea;
    Subject math;

    Student(int StudentId, String StudentName) {
        this.studentId = StudentId;
        this.studentName = StudentName;

        korea = new Subject();
        math = new Subject();
    }

    public void setKoreaSubject(String name, int score) {
        korea.subjectName = name;
        korea.score = score;
    }

    public void setMathSubject(String name, int score) {
        math.subjectName = name;
        math.score = score;
    }
    
    public void showScoreInfo() {
        int total = korea.score + math.score;
        System.out.println(studentName + "학생의 총점은" + total + "점입니다.");
    }
}
