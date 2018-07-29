package com.precipi;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    @Test
    public void testMultiplication()
    {
        Money five = Money.dollar(5);

        assertEquals(Money.dollar(10),five.times(2));
        assertEquals(Money.dollar(15),five.times(3));
    }

    @Test
    public void testFrancMultiplication()
    {
        Money five = Money.franc(5);

        assertEquals(Money.franc(10),five.times(2));
        assertEquals(Money.franc(15),five.times(3));
    }

    @Test
    public void testEquality() {
        assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        assertFalse(Money.dollar(6).equals(Money.dollar(5)));
 
        assertTrue(Money.franc(5).equals(Money.franc(5)));
        assertFalse(Money.franc(6).equals(Money.franc(5)));
    
 //       assertTrue(new Dollar(5).equals(new Franc(5)));
    
    }
    
    @Test
    public void testCurrency() {
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
        
    }

    @Test
    public void testSimpleAddition() {
        //Money sum=Money.dollar(5).plus(Money.dollar(5));
        //assertEquals(Money.dollar(10), sum);
 
        Money five = Money.dollar(5);
        Expression sum= five.plus(five);
        Bank bank = new Bank();
        Money reduced = bank.reduce(sum, "USD");
 
    }

    @Test
    public void testPlusReturnsSum() {
        Money five=Money.dollar(5);
        Expression result=five.plus(five);

        Sum sum = (Sum) result;

        assertEquals(five, sum.augend);
        assertEquals(five, sum.addend);
        
    }
}
