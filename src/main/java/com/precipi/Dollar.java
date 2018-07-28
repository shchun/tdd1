package com.precipi;

public class Dollar extends Money{
    private String currency;

    public Dollar(int amount, String currency) {
        super(amount, currency);
    }

    public Money times(int rval) {
        return Money.dollar(amount * rval);
    }

 
}