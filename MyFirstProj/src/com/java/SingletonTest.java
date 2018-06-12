package com.java;

public class SingletonTest {

    public static void main(String args[]) {

        SingleInstance singleInstance1 = SingleInstance.getSingleInstance();
        SingleInstance singleInstance2 = SingleInstance.getSingleInstance();

        System.out.println(singleInstance1.hashCode());
        System.out.println(singleInstance2.hashCode());
        if(singleInstance1==singleInstance2){
            System.out.println("Singlton");
        }

        System.out.println("Not Singleton");
    }

}
class SingleInstance{

    private static SingleInstance singleInstance=null;

    private SingleInstance(){

    }

    public static SingleInstance getSingleInstance(){

        if(singleInstance==null){
            singleInstance=new SingleInstance();
        }
        return singleInstance;
    }
}