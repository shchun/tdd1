package com.precipi;

abstract public class Money {
    protected int amount;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public boolean equals(Object object) 
    {
        Money money = (Money) object;

        return amount == money.amount && getClass().equals(money.getClass());
    }

    public abstract Money times(int rval);

    static Dollar dollar(int amount) {
        return new Dollar(amount, "USD");
    }

    static Franc franc(int amount) {
        return new Franc(amount, "CHF");
    }

    protected String currency;

    String currency() {
        return currency;
    }
}