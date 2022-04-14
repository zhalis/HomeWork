package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMemoryDecorator implements ICalculator {
    private double resultOfLastOperation = 0;
    private double memoryResult = 0;
    private double result;
    private final ICalculator calculator;

    public CalculatorWithMemoryDecorator(ICalculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public double division(double devidend, double divider) {
        this.resultOfLastOperation = calculator.division(devidend, divider);
        return this.resultOfLastOperation;
    }

    @Override
    public double multiplication(double multiplicand, double factor) {
        this.resultOfLastOperation = calculator.multiplication(multiplicand, factor);
        return this.resultOfLastOperation;
    }

    @Override
    public double addition(double ternFirst, double ternSecond) {
        this.resultOfLastOperation = calculator.addition(ternFirst, ternSecond);
        return this.resultOfLastOperation;
    }

    @Override
    public double subtraction(double minuend, double subtrahend) {
        this.resultOfLastOperation = calculator.subtraction(minuend, subtrahend);
        return this.resultOfLastOperation;
    }

    @Override
    public double exponentiation(double number, int degree) {
        this.resultOfLastOperation = calculator.exponentiation(number, degree);
        return this.resultOfLastOperation;
    }

    @Override
    public double theAbsoluteValueOfANumber(double number) {
        this.resultOfLastOperation = calculator.theAbsoluteValueOfANumber(number);
        return this.resultOfLastOperation;
    }

    @Override
    public double squareRoot(double number) {
        this.result = calculator.squareRoot(number);
        return this.result;
    }

    public double getResult() {
        return result;
    }

    public ICalculator getCalculator() {
        return calculator;
    }

    public double getMemoryResult() {
        double memoryResult = this.memoryResult;
        this.memoryResult = 0;
        return memoryResult;
    }

    public void setMemoryResult() {
        this.memoryResult = this.resultOfLastOperation;
    }
}
