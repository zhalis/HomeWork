package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoDecorator;
import home_work_3.calcs.additional.CalculatorWithMemoryDecorator;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathExtends;

import java.math.BigInteger;

public class CalculatorDecoratorMain {

    public static void main(String[] args) {

        ICalculator calculator = new CalculatorWithCounterAutoDecorator(new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends()));

        double a = 4.1;
        double b = 15.0;
        double c = 7.0;
        double d = 28.0;
        double e = 5.0;
        int degree = 2;

        System.out.println("Результат : " + calculator.addition(a, calculator.addition(calculator.multiplication(b, c), calculator.exponentiation(calculator.division(d, e), 2))));

        if (calculator instanceof CalculatorWithCounterAutoDecorator) {
            System.out.println("Счетчик использования калькулятора: " + ((CalculatorWithCounterAutoDecorator) calculator).getCountOperation());
        }
        if (calculator instanceof CalculatorWithCounterAutoDecorator) {
            CalculatorWithCounterAutoDecorator calculatorWithCounterAutoDecorator = (CalculatorWithCounterAutoDecorator) calculator;
            calculatorWithCounterAutoDecorator.getCountOperation();
            if (calculatorWithCounterAutoDecorator.getCalculator() instanceof CalculatorWithMemoryDecorator) {
                CalculatorWithMemoryDecorator calculatorWithMemoryDecorator = (CalculatorWithMemoryDecorator) calculatorWithCounterAutoDecorator.getCalculator();
                System.out.println("Последний сохранённое значение в памяти: " + calculatorWithMemoryDecorator.getMemoryResult());
            }
        }
    }
}
