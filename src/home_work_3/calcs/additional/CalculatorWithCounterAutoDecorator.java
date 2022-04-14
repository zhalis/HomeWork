package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoDecorator implements ICalculator {

    private long counter;
    private final ICalculator calculator;

    public CalculatorWithCounterAutoDecorator(ICalculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public double division(double devidend, double divider) {
        counter++;
        return calculator.division(devidend, divider);
    }

    @Override
    public double multiplication(double multiplicand, double factor) {
        counter++;
        return calculator.multiplication(multiplicand, factor);
    }

    @Override
    public double addition(double ternFirst, double ternSecond) {
        counter++;
        return calculator.addition(ternFirst, ternSecond);
    }

    @Override
    public double subtraction(double minuend, double subtrahend) {
        counter++;
        return calculator.subtraction(minuend, subtrahend);
    }

    @Override
    public double exponentiation(double number, int degree) {
        counter++;
        return calculator.exponentiation(number, degree);
    }

    @Override
    public double theAbsoluteValueOfANumber(double number) {
        counter++;
        return calculator.theAbsoluteValueOfANumber(number);
    }

    @Override
    public double squareRoot(double number) {
        counter++;
        return calculator.squareRoot(number);
    }

    public ICalculator getCalculator() {
        return calculator;
    }

    public long getCountOperation() {
        return counter;
    }
}
