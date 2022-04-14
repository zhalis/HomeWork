package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {

    private long counter = 0;

    @Override
    public double squareRoot(double number) {
        this.counter++;
        return super.squareRoot(number);
    }

    @Override
    public double division(double devidend, double divider) {
        this.counter++;
        return super.division(devidend, divider);
    }

    @Override
    public double multiplication(double multiplicand, double factor) {
        this.counter++;
        return super.multiplication(multiplicand, factor);
    }

    @Override
    public double addition(double ternFirst, double ternSecond) {
        this.counter++;
        return super.addition(ternFirst, ternSecond);
    }

    @Override
    public double subtraction(double minuend, double subtrahend) {
        this.counter++;
        return super.subtraction(minuend, subtrahend);
    }

    @Override
    public double exponentiation(double number, int degree) {
        this.counter++;
        return super.exponentiation(number, degree);
    }

    @Override
    public double theAbsoluteValueOfANumber(double number) {
        this.counter++;
        return super.theAbsoluteValueOfANumber(number);
    }

    public long getCountOperation() {
        return counter;
    }
}
