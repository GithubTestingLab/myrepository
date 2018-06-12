package com.java.collection;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapTest {

    public static void main(String args[]){

        Map<Integer, Students> map=new ConcurrentHashMap<>();
        //Map<Integer, Students> map=new HashMap<>(); //if we use HashMap them we will get below said Exception.
        map.put(1,new Students(101,"Banktesh",347054030));
        map.put(2,new Students(102,"Chandan",347054031));
        map.put(3,new Students(103,"Dhanish",347054032));
        map.put(4,new Students(104,"Abhishek",347054033));

        Iterator<Map.Entry<Integer,Students>> itr=map.entrySet().iterator();
        System.out.println("...........Here is the Students record..........");
        System.out.println(":::::::::::::::::::::::::::::");
        while (itr.hasNext()){
            Map.Entry<Integer,Students> entry= itr.next();
            //trying to add another student record in map while using HashMap to see how ConcurrentModificationException.
            map.put(5,new Students(105,"Lucky",347054034));
            Students students=(Students)entry.getValue();
            //System.out.println(" Keys "+entry.getKey()+ " Values "+entry.getValue());
            System.out.println("StudentID: "+students.getStdId()+"\n"+"StudentName: "+students.getStdName()+"\n"+"StudentRollNumber: " +students.getStdRollNumber());
            System.out.println("::::::::::::::::::::::::::::::");

        }
    }
}
class Students{

    private int stdId;

    private String stdName;
    private long stdRollNumber;

    Students(int stdId,String stdName, long stdRollNumber){

        this.stdId=stdId;
        this.stdName=stdName;
        this.stdRollNumber=stdRollNumber;
    }

    public int getStdId() {
        return stdId;
    }

    public void setStdId(int stdId) {
        this.stdId = stdId;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public long getStdRollNumber() {
        return stdRollNumber;
    }

    public void setStdRollNumber(long stdRollNumber) {
        this.stdRollNumber = stdRollNumber;
    }

}