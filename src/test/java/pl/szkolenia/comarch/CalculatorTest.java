package pl.szkolenia.comarch;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void addPositiveTest() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 7;
        int expectedResult = 12;

        int result = calculator.add(a, b);

        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void addNegativeTest() {
        Calculator calculator = new Calculator();
        int a = -5;
        int b = -8;
        int expectedResult = -13;

        int result = calculator.add(a, b);

        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void divideTest() {
        Calculator calculator = new Calculator();
        int a = 10;
        int b = 3;
        double expectedResult = 3.333;

        double result = calculator.divide(a, b);

        Assert.assertEquals(expectedResult, result, 0.001);
    }

    @Test(expected = DivideByZeroException.class)
    public void divideByZeroTest() {
        Calculator calculator = new Calculator();
        int a = 10;
        int b = 0;

        calculator.divide(a, b);

        Assert.fail();
    }
}
