package com.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CoparableTest {

    public static void main(String args[]){

        List<Employee> list=new ArrayList<>();
        list.add(new Employee(101,"Banktesh","banktesh85@gmail.com"));
        list.add(new Employee(132,"Abhishek","abhishek85@gmail.com"));
        list.add(new Employee(110,"Mahesh","mahesh85@gmail.com"));
        list.add(new Employee(119,"Suresh","suresh85@gmail.com"));

        Collections.sort(list);
        Iterator itr=list.iterator();
        System.out.println("...........Here is the Employee record..........");
        System.out.println(":::::::::::::::::::::::::::::");
            while (itr.hasNext()){
                Employee employee =(Employee)itr.next();
                System.out.println("EmployeeID: "+employee.getEmpId()+"\n"+"EmployeeName: "+employee.getEmpName()+"\n"+"EmployeeEmail: "+employee.getEmpMail());
                System.out.println(":::::::::::::::::::::::::");
        }
    }
}

class Employee implements Comparable<Employee>{


    private int empId;
    private String empName;
    private String empMail;


    Employee(int empId,String empName,String empMail){

        this.empId=empId;
        this.empName=empName;
        this.empMail=empMail;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpMail() {
        return empMail;
    }

    public void setEmpMail(String empMail) {
        this.empMail = empMail;
    }


    @Override
    public int compareTo(Employee employee) {

        if (empId==employee.empId){

            return 0;
        }else if(empId>employee.empId) {
            return 1;
        }else
        return -1;
    }
}
