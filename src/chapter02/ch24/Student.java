package chapter02.ch24;

import java.util.ArrayList;

public class Student {
    private static int serialNum = 1000;
    private final String studentName;
    private final int studentId;
    private ArrayList<Subject> subjectList = new ArrayList<>();

    public Student(String studentName) {
        this.studentName = studentName;
        studentId = serialNum++;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public ArrayList<Subject> getSubjectList() {
        return subjectList;
    }

    public void addSubject(String subject, int score) {
        Subject sub = new Subject(subject, score);
        subjectList.add(sub);
    }

    public void showStudentInfo() {
        int scoreTotal = 0;

        for (Subject tmp : subjectList) {
            System.out.println(
                    studentId + "번 " + studentName + "학생의 " + tmp.getSubject() + "과목 성적은 " + tmp.getScore() + "점 입니다.");
            scoreTotal += tmp.getScore();
        }
        System.out.println(studentId + "번 " + studentName + "학생의 총점은 " + scoreTotal + "점 입니다.");
    }

}
