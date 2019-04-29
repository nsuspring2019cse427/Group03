package com.example.asus.calculator;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

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
    * Call Addition method of the Calculator class
    * Call assertEquals method to compare between expected & actual value
    * */

    public void testAddition() throws Exception {

        double number1 = 2.4;
        double number2 = 1.7;
        double expected = 4.1;

        double actual = Calculator.Addition(number1,number2);
        assertEquals(expected,actual,DELTA);

    }
    

    @Test
    /*
     * Take two double parameters
     * Call Subtraction method of the Calculator class
     * Call assertEquals method to compare between expected & actual value
     * */

    public void testSubtraction() throws Exception {

            double number1 = 2.4;
            double number2 = 1.7;
            double expected = 0.7;

            double actual = Calculator.Subtraction(number1,number2);
            assertEquals(expected,actual,DELTA);

    }
    


    @Test
    /*
     * Objective: Check the method for negative outputs
     * Take two double parameters
     * Call Subtraction method of the Calculator class
     * Call assertEquals method to compare between expected & actual value
     * */

    public void testSubtractionForNegativeOutputs() throws Exception {

        double number1 = 1.3 ;
        double number2 = 4.2;
        double expected = -2.9;

        double actual = Calculator.Subtraction(number1,number2);
        assertEquals(expected,actual,DELTA);

    }

    @Test
    /*
     * Take two double parameters
     * Call Multiplication method of the Calculator class
     * Call assertEquals method to compare between expected & actual value
     * */

    public void testMultiplication() throws Exception {

        double number1 = 3.7 ;
        double number2 = 8.2;
        double expected = 30.34;

        double actual = Calculator.Multiplication(number1,number2);
        assertEquals(expected,actual,DELTA);

    }


    @Test
    /*
     * Take two double parameters
     * Call Division method of the Calculator class
     * Call assertEquals method to compare between expected & actual value
     * */

    public void testDivision() throws Exception {

        double number1 = .5;
        double number2 = 2;
        double expected = 2.5;

        double actual = Calculator.Division(number1,number2);
        assertEquals(expected,actual,DELTA);

    }

    /*--Test for checking output of division by zero operations--*/

    /*
     * Objective: Showing test failed with getting the java.lang.ArithmeticException
     * Take two double parameters with one zero
     * Call Division method of the Calculator class
     * */

    @Test(expected=java.lang.ArithmeticException.class)
    public void testDivisionByZero() throws ArithmeticException
    {
        double number1 = 7;
        double number2 = 0;

        Calculator.Division(number1, number2);

    }


    /*.........Input Space Partitioning.......*/
    /*........Input Characteristics:
    Integers (Positive & Negative),
    Floats (Positive & Negative),
    Double (Positive & Negative),
    All zero ,
    All null*/


    /*...Test to check addition() for two positive integers from the blocks*/
    @Test
    /*
     * Take two Positive Integers parameters from the blocks {684,39852}
     * Call Addition method of the Calculator class
     * Call assertEquals method to compare between expected & actual value
     * */
    public void testAdditionForPositiveIntegers(){
         int number1 = 684;
         int number2= 39852;
         Double d1 = new Double(number1);
         Double d2 = new Double(number2);

         int expected = 40536;

         double actual = Calculator.Addition(d1,d2);

         assertEquals(expected,actual,DELTA);

    }

    /*...Test to check addition() for two negative integers from the blocks*/
    @Test
    /*
     * Take two Negative Integers parameters from the blocks {-4731,-98432}
     * Call Addition method of the Calculator class
     * Call assertEquals method to compare between expected & actual value
     * */
    public void testAdditionForNegativeIntegers(){
        int number1 = -4731;
        int number2= -98432;
        Double d1 = new Double(number1);
        Double d2 = new Double(number2);

        int expected = -103163;

        double actual = Calculator.Addition(d1,d2);

        assertEquals(expected,actual,DELTA);

    }


    /*...Test to check addition() for two positive floats from the blocks*/
    @Test
    /*
     * Take two Positive Floats parameters from the blocks {872.61f,12341.23f}
     * Call Addition method of the Calculator class
     * Call assertEquals method to compare between expected & actual value
     * */
    public void testAdditionForPositiveFloats(){
        float number1 = 872.61f;
        float number2= 12341.23f;


        float expected = 13213.84f;

        double actual = (float) (Calculator.Addition(number1,number2));

        assertEquals(expected,actual,DELTA);

    }


    /*...Test to check addition() for two negative floats from the blocks*/
    @Test
    /*
     * Take two Negative Floats parameters from the blocks {-7136.87f,-72341.21f}
     * Call Addition method of the Calculator class
     * Call assertEquals method to compare between expected & actual value
     * */
    public void testAdditionForNegativeFloats(){
        float number1 = -7136.87f;
        float number2= -72341.21f;


        float expected = -79478.078125f;

        double actual = (float) Calculator.Addition(number1,number2);

        assertEquals(expected,actual,DELTA);

    }


    /*...Test to check addition() for two positive doubles from the blocks*/
    @Test
    /*
     * Take two Positive Doubles parameters from the blocks {2459.432,64936.0003}
     * Call Addition method of the Calculator class
     * Call assertEquals method to compare between expected & actual value
     * */
    public void testAdditionForPositiveDoubles(){
        double number1 = 2459.432;
        double number2=64936.0003;


        double expected = 67395.4323;

        double actual =  Calculator.Addition(number1,number2);

        assertEquals(expected,actual,DELTA);

    }

    /*...Test to check addition() for two negative doubles from the blocks*/
    @Test
    /*
     * Take two Negative Doubles parameters from the blocks {-2459.432,-64936.0003}
     * Call Addition method of the Calculator class
     * Call assertEquals method to compare between expected & actual value
     * */
    public void testAdditionForNegativeDoubles(){
        double number1 = -2459.432;
        double number2= -64936.0003;


        double expected = -67395.4323;

        double actual =  Calculator.Addition(number1,number2);

        assertEquals(expected,actual,DELTA);

    }
    
    
    /*
     * following testcase going to take one positive & 
     * one negative integer as input and add them together
     * (part of input space partition)
     */
    
    @Test
    public void testAdditionPosNegIntegers() {
    	int num1 = 32565;
    	int num2 = -625;
    	
    	int expected = 31940;
    	
    	Double doub1 = new Double(num1);
    	Double doub2 = new Double(num2);

    	double actual = (int) Calculator.Addition(doub1, doub2);

    	assertEquals(expected, actual, DELTA);

    }


    /*
       following testcase method going to take one positive integer and
       one positive double value as input and add them
     */

    @Test
    public void testAdditionWithIntAndDouble(){
        int num1 = 1000;
        double num2 = 100.26;

        Double d1 = new Double(num1);

        double actual = Calculator.Addition(d1, num2);

        assertEquals(1100.26, actual, DELTA);
    }
    
    
    /*
     * input space partitioning for subtraction
     */
    
    /*
     * the following test case takes two positive integers as input and subtracts num2 from num1
     */
    
    @Test
    public void testSubWithPositiveInts() {
    	int num1 = 302;
    	int num2 = 6;
    	
    	Double d1 = new Double(num1);
    	Double d2 = new Double(num2);
    	
    	double actual = Calculator.Subtraction(d1, d2);
    	
    	assertEquals(296.0, actual, DELTA);
    }
    
    
    /*
     * the following test case takes two positive doubles as input and subtracts num2 from num1
     */
    
    @Test
    public void testSubWithPositiveDouble() {
    	Double num1 = 254.3;
    	Double num2 = 54.3;
    	
    	
    	double actual = Calculator.Subtraction(num1, num2);
    	
    	assertEquals(200.0, actual, DELTA);
    }
    
    /*
    * the following test case takes one double positive value and subtracts one positive 
    * integer value from it
    */
   
   @Test
   public void testSubIntFromDouble() {
   	Double num1 = 1000.648;
   	int num2 = 200;
   	
   	Double d2 = new Double(num2);
   	
   	
   	double actual = Calculator.Subtraction(num1, d2);
   	
   	assertEquals(800.648, actual, DELTA);
   }


    /*
     * input space partition tests for Multiplication
     */

    /*...Test to check Multiplication() for two positive integers from the blocks*/
    @Test
    /*
     * Take two Positive Integers parameters from the blocks {684,39852}
     * Call Multiplication method of the Calculator class
     * Call assertEquals method to compare between expected & actual value
     * */
    public void testMultiplicationForPositiveIntegers(){
        int number1 = 684;
        int number2= 39852;
        Double d1 = new Double(number1);
        Double d2 = new Double(number2);

        int expected = 27258768;

        double actual = Calculator.Multiplication(d1,d2);

        assertEquals(expected,actual,DELTA);

    }



    /*...Test to check Multiplication() for two negative integers from the blocks*/
    @Test
    /*
     * Take two Negative Integers parameters from the blocks {-4731,-98432}
     * Call Multiplication method of the Calculator class
     * Call assertEquals method to compare between expected & actual value
     * */
    public void testMultiplicationForNegativeIntegers(){
        int number1 = -4731;
        int number2= -98432;
        Double d1 = new Double(number1);
        Double d2 = new Double(number2);

        int expected = 465681792;

        double actual = Calculator.Multiplication(d1,d2);

        assertEquals(expected,actual,DELTA);

    }


    /*...Test to check Multiplication() for two positive floats from the blocks*/
    @Test
    /*
     * Take two Positive Floats parameters from the blocks {872.61f,12341.23f}
     * Call Multiplication method of the Calculator class
     * Call assertEquals method to compare between expected & actual value
     * */
    public void testMultiplicationForPositiveFloats(){
        float number1 = 872.61f;
        float number2= 12341.23f;


        float expected = 10769081f;

        double actual = (float) (Calculator.Multiplication(number1,number2));

        assertEquals(expected,actual,DELTA);

    }


    /*...Test to check Multiplication() for two negative floats from the blocks*/
    @Test
    /*
     * Take two Negative Floats parameters from the blocks {-7136.87f,-72341.21f}
     * Call Multiplication method of the Calculator class
     * Call assertEquals method to compare between expected & actual value
     * */
    public void testMultiplicationForNegativeFloats(){
        float number1 = -7136.87f;
        float number2= -72341.21f;


        float expected = 516289811f;

        double actual = (float) Calculator.Multiplication(number1,number2);

        assertEquals(expected,actual,DELTA);

    }


    /*...Test to check Multiplication() for two positive doubles from the blocks*/
    @Test
    /*
     * Take two Positive Doubles parameters from the blocks {2459.432,64936.003}
     * Call Multiplication method of the Calculator class
     * Call assertEquals method to compare between expected & actual value
     * */
    public void testMultiplicationForPositiveDoubles(){
        double number1 = 2459.432;
        double number2=64936.003;


        double expected = 1597056837;

        double actual =  Calculator.Multiplication(number1,number2);

        assertEquals(expected,actual,DELTA);

    }


    /*...Test to check Multiplication() for two negative doubles from the blocks*/
    @Test
    /*
     * Take two Negative Doubles parameters from the blocks {-2459.432,-64936.003}
     * Call Multiplication method of the Calculator class
     * Call assertEquals method to compare between expected & actual value
     * */
    public void testMultiplicationForNegativeDoubles(){
        double number1 = -2459.432;
        double number2= -64936.003;


        double expected = 140224883;

        double actual =  Calculator.Multiplication(number1,number2);

        assertEquals(expected,actual,DELTA);

    }



    /*...Test to check Multiplication() for positive and negative integers from the blocks*/
    @Test
    /*
     * Take one positive and one negative Integer parameters from the blocks {24,-649}
     * Call Multiplication method of the Calculator class
     * Call assertEquals method to compare between expected & actual value
     * */
    public void testMultiplicationForPositiveAndNegativeIntegers(){
        double number1 = 24;
        double number2= -649;


        double expected = -15576;

        double actual =  Calculator.Multiplication(number1,number2);

        assertEquals(expected,actual,DELTA);

    }



    /*
     * input space partition tests for Division
     */

    /*...Test to check Division() for two positive integers from the blocks*/
    @Test
    /*
     * Take two Positive Integers parameters from the blocks {684,39852}
     * Call Division method of the Calculator class
     * Call assertEquals method to compare between expected & actual value
     * */
    public void testDivisionForPositiveIntegers(){
        int number1 = 684;
        int number2= 39852;
        Double d1 = new Double(number1);
        Double d2 = new Double(number2);

        double expected = 0.017163504968;

        double actual = Calculator.Division(d1,d2);

        assertEquals(expected,actual,DELTA);

    }
    
 /*
  * takes 2 positive double as input and divide 1st input by 2nd input
  * Calls assertEquals method to compare between actual and expected value
  *     
  */
    @Test
    public void testDivisionWithPositiveDouble() {
    	double num1 = 500.365697;
    	double num2 = 10.2556;
    	
    	double expected = 48.7895;
    	
    	double actual = Calculator.Division(num1, num2);
    	
    	assertEquals(expected, actual, DELTA);
    	
    }
    
    /*
     * takes 1 positive double and 1 negative double as input
     * divides 1st input by 2nd input
     * Calls assertEquals method to compare between actual and expected value
     *     
     */
    
       @Test
       public void testDivisionWithPosNegDouble() {
       	double num1 = 16911.365;
       	double num2 = -250.956;
       	
       	double expected = -67.387769170691276558440523438372;
       	
       	double actual = Calculator.Division(num1, num2);
       	
       	assertEquals(expected, actual, DELTA);
       	
       }
       
       /*
        * takes  2 negative doubles as input
        * divides 1st input by 2nd input
        * Calls assertEquals method to compare between actual and expected value
        *     
        */
       
          @Test
          public void testDivisionWithNegativeDouble() {
          	double num1 = -6311.501;
          	double num2 = -321.245;
          	
          	double expected = 19.647001509751124531121106943299;
          	
          	double actual = Calculator.Division(num1, num2);
          	
          	assertEquals(expected, actual, DELTA);
          	
          }
          

       /*
        * takes  zero as numerator and negative double as denominator
        * as input divides 1st input by 2nd input
        * Calls assertEquals method to compare between actual and expected value
        *     
        */
          
        @Test
        public void testDivisionWithNumeratorZero() {
          double num1 = 0.0;
          double num2 = -321.245;
             	
          double expected = 0;
             	
          double actual = Calculator.Division(num1, num2);
             	
           assertEquals(expected, actual, DELTA);	
             
        }          
          
       
    
    












}