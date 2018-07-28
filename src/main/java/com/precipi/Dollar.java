package com.precipi;

class Dollar {
    public int amount;
    public Dollar(int amount) {
        this.amount = amount;
    }

    public Dollar times(int rval) {
        return new Dollar(amount * rval);
    }

    public boolean equals(Object object) 
    {
        Dollar dollar = (Dollar) object;

        return amount == dollar.amount;
    }
}