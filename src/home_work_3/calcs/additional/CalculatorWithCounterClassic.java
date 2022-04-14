package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {

    private long counter = 0;

    public void incrementCountOperation() {
        this.counter++;
    }

    public long getCountOperation() {
        return counter;
    }
}
