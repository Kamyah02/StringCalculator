package com.example.stringcalculator.test;

import com.example.stringcalculator.StringCalculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

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

    @Test
    public void testCustomDelimiterShouldReturnSum() {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.add("//;\n1;2");
        assertEquals(3, result);
    }

    @Test
    public void testNegativeNumbersShouldThrowException() {
        StringCalculator calculator = new StringCalculator();
        try {
            calculator.add("1,-2,3,-4");
            fail("Expected IllegalArgumentException was not thrown");
        } catch (IllegalArgumentException exception) {
            assertTrue(exception.getMessage().trim().contains("-2, -4"));
        }
    }
}
