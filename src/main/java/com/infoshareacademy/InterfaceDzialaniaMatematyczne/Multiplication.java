package com.infoshareacademy.InterfaceDzialaniaMatematyczne;

public class Multiplication implements Computation {

    public Multiplication() {
    }

    @Override
    public double compute(double arg1, double arg2) {
        return arg1*arg2;
    }


}
