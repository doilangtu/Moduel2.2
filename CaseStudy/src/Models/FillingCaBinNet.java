package Models;

import java.util.ArrayList;
import java.util.Stack;

public class FillingCaBinNet {
    public static Stack<Employee> addToFilingCabinet() {
        Employee employee1 = new Employee(1, "Hung", "gia lai", 20);
        Employee employee2 = new Employee(2, "Hung", "gia lai", 20);
        Employee employee3 = new Employee(3, "Lan", "Thuan an", 24);
        Employee employee4 = new Employee(4, "Chanh", "Khai hoan", 32);
        Employee employee5 = new Employee(5, "Bun", "Duc pho", 21);
        Employee employee6 = new Employee(6, "Anh", "Kon tum", 34);
        Employee employee7 = new Employee(7, "Minh", "Khanh Hoa", 23);
        Employee employee8 = new Employee(8, "Khai", "An giang", 12);
        Employee employee9 = new Employee(9, "Khon", "Binh phuoc", 56);
        Employee employee10 = new Employee(10, "Rung", "Hoa Thinh", 14);
        Stack<Employee> fillingCabinet = new Stack<Employee>();
        fillingCabinet.push(employee1);
        fillingCabinet.push(employee2);
        fillingCabinet.push(employee3);
        fillingCabinet.push(employee4);
        fillingCabinet.push(employee5);
        fillingCabinet.push(employee6);
        fillingCabinet.push(employee7);
        fillingCabinet.push(employee8);
        fillingCabinet.push(employee9);
        fillingCabinet.push(employee10);
        return fillingCabinet;
    }
}
