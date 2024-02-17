package com.example.stringcalculator.test;

import com.example.stringcalculator.StringCalculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {
    @Test
    public void testEmptyString() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(0, calculator.add(""));
    }

    @Test
    public  void  testTwoNumbers(){
        StringCalculator calculator=new StringCalculator();
        assertEquals(5,calculator.add("2,3"));
    }

    @Test
    public  void  testOneNumber(){
        StringCalculator calculator=new StringCalculator();
        assertEquals(2,calculator.add("2"));
    }

    @Test
    public  void  testAnyAmountofNumbers(){
        StringCalculator calculator=new StringCalculator();
        assertEquals(10,calculator.add("1,2,3,4"));
    }

    @Test
    public void testNewLinesBetweenNumbersShouldReturnSum() {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.add("1\n2,3");
        assertEquals(6, result);
    }
}
