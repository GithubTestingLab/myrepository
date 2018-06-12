package com.java;

public class MethodOverrideTest {

    public static void main(String args[]) {

        StateBank stateBank = new StateBank();
        DenaBank denaBank = new DenaBank();
        AllahabadBank allahabadBank = new AllahabadBank();

        System.out.println("StateBank Interest is: " + stateBank.getRateOfInterest());
        System.out.println("DenaBank Interest is: " + denaBank.getRateOfInterest());
        System.out.println("AllahabadBank Interest is: " + allahabadBank.getRateOfInterest());

    }

}
class RbiBank{

    double getRateOfInterest(){

        return 0.0;
    }

}
class StateBank extends RbiBank{

    @Override
    double getRateOfInterest() {
        return 6.6;
    }
}
class DenaBank extends RbiBank{

    @Override
    double getRateOfInterest() {
        return 6.8;
    }
}
class AllahabadBank extends RbiBank{
    @Override
    double getRateOfInterest() {
        return super.getRateOfInterest();
    }
}