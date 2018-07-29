package com.precipi;

interface Expression {
    Money reduce(Bank bank, String to);
}