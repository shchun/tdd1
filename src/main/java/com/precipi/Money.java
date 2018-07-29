package com.precipi;

public class Money {
    protected int amount;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public boolean equals(Object object) 
    {
        Money money = (Money) object;

        return amount == money.amount && 
           currency.equals(money.currency);
    }

    public Money plus(Money rval) {
        return new Money(amount + rval.amount, currency);
    }
    public Money times(int rval) {
        return new Money(amount * rval, currency);
   
    }

    public String toString() {
        return amount + " " + currency;
    }

    static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    static Money franc(int amount) {
        return new Money(amount, "CHF");
    }

    protected String currency;

    String currency() {
        return currency;
    }
}