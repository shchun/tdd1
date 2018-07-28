package com.precipi;

public class Franc extends Money {
    public Franc(int amount) {
        this.amount = amount;
    }

    public Franc times(int rval) {
        return new Franc(amount * rval);
    }

}