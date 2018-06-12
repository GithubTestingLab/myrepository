package com.java;


public class AbstractTest {


    public static void main(String args[]){

        Bank bankInterest;

        bankInterest=new ICICIBank();

        System.out.println("ICICI RateOfInterest is: "+bankInterest.getBankIterest());

        bankInterest=new SBIBank();
        System.out.println("SBI RateOfInterest is: "+bankInterest.getBankIterest());

        bankInterest=new HDFCBank();
        System.out.println("HDFC RateOfInterest is: "+bankInterest.getBankIterest());

    }

}

class ICICIBank extends Bank{

    @Override
    double getBankIterest() {
        return 5.5;

    }
}
class SBIBank extends Bank{

    @Override
    double getBankIterest() {
        return 4.5;
    }
}

class HDFCBank extends Bank{

    @Override
    double getBankIterest() {
        return 4.7;
    }
}