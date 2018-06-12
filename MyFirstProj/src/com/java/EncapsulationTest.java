package com.java;

import java.io.Serializable;

public class EncapsulationTest {

    public static void main(String args[]){

        Employee employee=new Employee();
        employee.setEmployeeId(101);
        employee.setEmployeeName("Mr.Banktesh Kumar Tiwary");
        employee.setEmployeecompany("HCL Technologies PVT LTD.");
        employee.setAddress(new Address("Bangalore","Karnataka","India"));
        System.out.println(":::::::::::::Here is the Employee Details::::::::::::::\n");
        System.out.print("EmployeeId: "+employee.getEmployeeId()+"\n" + "EmployeeName: "+employee.getEmployeeName()+"\n"+ "EmployeeCompany: "+employee.getEmployeecompany()+"\n"+ ":::::::::::::::EmployeeAddress:::::::::::: "+"\n"+employee.getAddress());

    }
}

class Employee implements Serializable{

    private int employeeId;

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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    private String employeeName;
    private Address address;
    private String employeecompany;

    public String getEmployeecompany() {
        return employeecompany;
    }

    public void setEmployeecompany(String employeecompany) {
        this.employeecompany = employeecompany;
    }



    public Employee(){
        System.out.println("Hello User ");
    }

    public Employee(int employeeId,String employeeName,String employeecompany,Address address){
        this.employeeId=employeeId;
        this.employeeName=employeeName;
        this.employeecompany=employeecompany;
        this.address=address;

    }
}

class Address{

    String city,state,country;

    Address(String city, String state, String country){

        this.city=city;
        this.state=state;
        this.country=country;

    }
    public String toString(){

        return " City:  "+city+"\n"+" State:  "+state+"\n"+" Country: "+country;
    }

}
