package home_work_3.test;

import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMathExtendsTest extends AbstractCalculatorTest{

    private final ICalculator calculatorWithMathExtends = new CalculatorWithMathExtends();

    @Override
    public ICalculator getCalculator() {
        return calculatorWithMathExtends;
    }
}
