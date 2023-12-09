package chapter02.ch16;

public class Employee {
    private static int serialNum = 1000;

    private int employeeId;
    private String employeeName;
    private String address;

    public Employee() {
        serialNum++;
        employeeId = serialNum;
    }

    public static int getSerialNum() {
        int i = 0;
        return serialNum;
    }

    public int getEmployeeId() {
        serialNum = 1000;
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
