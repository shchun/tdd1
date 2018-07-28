package com.precipi;

public class Dollar extends Money{
     public Dollar(int amount) {
        this.amount = amount;
    }

    public Money times(int rval) {
        return new Dollar(amount * rval);
    }


}