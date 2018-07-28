package com.precipi;

abstract public class Money {
    protected int amount;

    public boolean equals(Object object) 
    {
        Money money = (Money) object;

        return amount == money.amount && getClass().equals(money.getClass());
    }

    public abstract Money times(int rval);

    static Dollar dollar(int amount) {
        return new Dollar(amount);
    }

    static Franc franc(int amount) {
        return new Franc(amount);
    }
}