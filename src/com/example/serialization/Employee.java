package com.example.serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Employee implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -3364848790952791720L;
    private int employeeId;
    private String employeeName;
    private String department;
    private int age;
    transient Address address;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getEmployeeId() {
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    private void writeObject(ObjectOutputStream os) throws IOException, ClassNotFoundException {
        try {
            os.defaultWriteObject();
            os.writeInt(address.getHomeNo());
            os.writeObject(address.getStreet());
            os.writeObject(address.getCity());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void readObject(ObjectInputStream is) throws IOException, ClassNotFoundException {
        try {
            is.defaultReadObject();
            int homeNo = is.readInt();
            String street = (String) is.readObject();
            String city = (String) is.readObject();
            address = new Address(homeNo, street, city);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public Employee(int employeeId, String employeeName, int age) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.age = age;
    }

    public Employee() {
        super();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", age=" + age +
                '}';
    }
}
