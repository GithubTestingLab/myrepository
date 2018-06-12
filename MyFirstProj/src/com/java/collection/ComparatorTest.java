package com.java.collection;

import java.util.*;

public class ComparatorTest {

    public static void main(String args[]){

    List<Employee_By_Name> list=new ArrayList<>();


        list.add(new Employee_By_Name(101,"Banktesh","banktesh85@gmail.com"));
        list.add(new Employee_By_Name(132,"Abhishek","abhishek85@gmail.com"));
        list.add(new Employee_By_Name(110,"Mahesh","mahesh85@gmail.com"));
        list.add(new Employee_By_Name(119,"Suresh","suresh85@gmail.com"));

        Collections.sort(list,new Employee_By_Name());

        Iterator itr=list.iterator();
        while (itr.hasNext()){
            Employee_By_Name employee_by_name=(Employee_By_Name)itr.next();

            System.out.println("EmployeeID: "+employee_by_name.getEmpId()+"\n"+"EmployeeName: "+employee_by_name.getEmpName()+"\n"+"EmployeeEmail: "+employee_by_name.getEmpMail());
            System.out.println(":::::::::::::::::::::::::");
        }
    }
}
class Employee_By_Name implements Comparator<Employee_By_Name>{


    private int empId;
    private String empName;
    private String empMail;

    Employee_By_Name(){
        System.out.println("Hello");
    }

    Employee_By_Name(int empId,String empName,String empMail){

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
    public int compare(Employee_By_Name employee_by_name1, Employee_By_Name employee_by_name2) {


       return employee_by_name1.empName.compareTo(employee_by_name2.empName);

    }
}