package com.java;

public class PolyMorphismTest {

    public static void main(String args[]){

        Animal animal;
        animal=new Lion();
        animal.eat();
        animal=new Elephant();
        animal.eat();
        animal=new Calf();
        animal.eat();
    }
}
class Animal{

    public void eat(){
        System.out.println("Animal is eating");
    }
}
class Lion extends Animal{

    @Override
    public void eat() {
        System.out.println("Lion eat() method invoked where "+"Lion is eating jackal");
    }
}
class Elephant extends Animal{

    @Override
    public void eat() {
        System.out.println("Elephant eat() method invoked where "+"Elephant eating tree in jangal");
    }
}
class Calf extends Animal{

    @Override
    public void eat() {

        System.out.println("Calf eat() method invoked where "+"Calf eating green grass in the field");
    }
}