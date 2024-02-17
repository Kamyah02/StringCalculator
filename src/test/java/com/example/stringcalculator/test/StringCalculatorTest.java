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
}
