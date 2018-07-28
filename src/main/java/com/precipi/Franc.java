package com.precipi;

class Franc {
    public int amount;
    public Franc(int amount) {
        this.amount = amount;
    }

    public Franc times(int rval) {
        return new Franc(amount * rval);
    }

    public boolean equals(Object object) 
    {
        Franc Franc = (Franc) object;

        return amount == Franc.amount;
    }
}