package home_work_3.test;

import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithOperatorTest extends AbstractCalculatorTest{

    private final ICalculator calculatorWithOperator = new CalculatorWithOperator();

    @Override
    public ICalculator getCalculator() {
        return calculatorWithOperator;
    }
}
