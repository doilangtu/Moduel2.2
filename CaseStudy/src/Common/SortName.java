package Common;

import Models.Customer;

import java.util.Comparator;

public class SortName  implements Comparator<Customer> {
    public int compare(Customer s1,Customer s2){
        return s1.getCustomerName().compareTo(s2.getCustomerName());
    }
}
