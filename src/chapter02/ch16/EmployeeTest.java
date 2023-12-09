package chapter02.ch16;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee lee = new Employee();
        lee.setEmployeeName("이순신");

        Employee kim = new Employee();
        kim.setEmployeeName("김유신");

        System.out.println(lee.getEmployeeId());
        System.out.println(kim.getEmployeeId());
        System.out.println(Employee.getSerialNum());
    }
}
