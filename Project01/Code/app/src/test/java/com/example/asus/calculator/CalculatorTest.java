package com.example.asus.calculator;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {


    private static final double DELTA = 0.001;

    /*--DELTA is actually the measure of error here,
      or in a word it defines uncertainty. In this case,
      delta is the maximum allowed absolute difference
      between actual and expected value. So the test is
      basically-
      if (Math.absolute(expected - actual) > delta)
      fail
    --*/


    @Test

    /*
    * Take two double parameters
    * Call Addition mehod of the Calculator class
    * Call assertEquals method to compare between expected & actual value
    * */

    public void testAddition() throws Exception {

        double number1 = 2.4;
        double number2 = 1.7;
        double expected = 4.1;

        double actual = Calculator.Addition(number1,number2);
        assertEquals(expected,actual,DELTA);

    }
}