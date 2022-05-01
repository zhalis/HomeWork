package home_work_3.test;

import home_work_3.calcs.api.ICalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public abstract class AbstractCalculatorTest {

    @Test
    public void testDivisionInteger() {
        double expectedResult = 5.6;
        double actualResult = getCalculator().division(28, 5);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testDivisionDouble() {
        double expectedResult = 2.05;
        double actualResult = getCalculator().division(4.1, 2);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMultiplicationInteger() {
        double expectedResult = 105;
        double actualResult = getCalculator().multiplication(15, 7);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMultiplicationDouble() {
        double expectedResult = 14.8;
        double actualResult = getCalculator().multiplication(7.4, 2);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testAdditionInteger() {
        double expectedResult = 119.1;
        double actualResult = getCalculator().addition(115, 4.1);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testAdditionDouble() {
        double expectedResult = 76.4;
        double actualResult = getCalculator().addition(54.2, 22.2);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSubtractionInteger() {
        double expectedResult = 8;
        double actualResult = getCalculator().subtraction(11, 3);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSubtractionDouble() {
        double expectedResult = 32;
        double actualResult = getCalculator().subtraction(54.2, 22.2);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testExponentiationInteger() {
        double expectedResult = 125;
        double actualResult = getCalculator().exponentiation(5, 3);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testExponentiationDouble() {
        double expectedResult = 31.36;
        double actualResult = getCalculator().exponentiation(5.6, 2);
        Assertions.assertEquals(expectedResult, roundByTwoDigitsAfterPoint(actualResult));
    }

    @Test
    public void testTheAbsoluteValueOfANumberPositive() {
        double expectedResult = 56;
        double actualResult = getCalculator().theAbsoluteValueOfANumber(56);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testTheAbsoluteValueOfANumberNegative() {
        double expectedResult = 34.5;
        double actualResult = getCalculator().theAbsoluteValueOfANumber(-34.5);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSquareRootDouble() {
        double expectedResult = 5.04;
        double actualResult = getCalculator().squareRoot(25.4);
        Assertions.assertEquals(expectedResult, roundByTwoDigitsAfterPoint(actualResult));
    }

    @Test
    public void testSquareRootInteger() {
        double expectedResult = 11;
        double actualResult = getCalculator().squareRoot(121);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    public abstract ICalculator getCalculator();

    private double roundByTwoDigitsAfterPoint(double targetNumber) {
        return Math.round(targetNumber * 100) / 100.0;
    }
}
