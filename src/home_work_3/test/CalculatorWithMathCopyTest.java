package home_work_3.test;

import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithMathCopyTest extends AbstractCalculatorTest {

    private final ICalculator calculatorWithMathCopy = new CalculatorWithMathCopy();

    @Override
    public ICalculator getCalculator() {
        return calculatorWithMathCopy;
    }
}
