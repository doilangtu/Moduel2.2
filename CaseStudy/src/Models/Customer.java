package Models;

import java.util.Date;

public class Customer implements Comparable<Customer> {
    private String id;
    private String customerName;
    private String birthdayCustomer;
    private String gender;
    private int idCard;
    private int mobilePhone;
    private String Email;
    private String typeOfCustomer;
    private String Address;
    private Services services;


    public Customer() {
    }

    public Customer(String id, String customerName, String birthdayCustomer,
                    String gender, int idCard, int mobilePhone, String email, String typeOfCustomer, String address) {
        this.id = id;
        this.customerName = customerName;
        this.birthdayCustomer = birthdayCustomer;
        this.gender = gender;
        this.idCard = idCard;
        this.mobilePhone = mobilePhone;
        Email = email;
        this.typeOfCustomer = typeOfCustomer;
        Address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getBirthdayCustomer() {
        return birthdayCustomer;
    }

    public void setBirthdayCustomer(String birthdayCustomer) {
        this.birthdayCustomer = birthdayCustomer;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getIdCard() {
        return idCard;
    }

    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }

    public int getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(int mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getTypeOfCustomer() {
        return typeOfCustomer;
    }

    public void setTypeOfCustomer(String typeOfCustomer) {
        this.typeOfCustomer = typeOfCustomer;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
    public Services getServices() {
        return services;
    }


    public void setServices(Services services) {
        this.services = services;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerName='" + customerName + '\'' +
                ", birthdayCustomer=" + birthdayCustomer +
                ", gender='" + gender + '\'' +
                ", idCard='" + idCard + '\'' +
                ", mobilePhone=" + mobilePhone +
                ", Email='" + Email + '\'' +
                ", typeOfCustomer='" + typeOfCustomer + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }

    @Override
    public int compareTo(Customer o) {
        return 0;
    }
}
