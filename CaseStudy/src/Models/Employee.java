package Models;

public class Employee  implements Comparable<Employee>{
    private int id;
    private String employeeName;
    private String employeeAddress;
    private int age;

    public Employee() {
    }

    public Employee(int id, String employeeName, String employeeAddress, int age) {
        this.id = id;
        this.employeeName = employeeName;
        this.employeeAddress = employeeAddress;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return
                "employeeName = " + this.employeeName  +
                ", employeeAddress = " + this.employeeAddress  +
                ", age = " + this.age ;

    }
    @Override
    public int compareTo(Employee o) {
        return this.id;
    }

}
