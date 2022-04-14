package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithMemory;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMemoryMain {

    public static void main(String[] args) {
        ICalculator calculatorWithMathExtends = new CalculatorWithMathExtends();
        CalculatorWithMemory calculator = new CalculatorWithMemory(calculatorWithMathExtends);

        double a = 4.1;
        double b = 15.0;
        double c = 7.0;
        double d = 28.0;
        double e = 5.0;
        int degree = 2;
        double resultDivision;
        double resultExponentiation;
        double resultMultiplication;
        double resultAdditionFirst;

        resultDivision = calculator.division(d, e);
        calculator.setMemoryResult();
        resultExponentiation = calculator.exponentiation(resultDivision, degree);


        resultMultiplication = calculator.multiplication(b, c);

        resultAdditionFirst = calculator.addition(a, resultMultiplication);

        calculator.addition(resultAdditionFirst, resultExponentiation);

        System.out.println("Счетчик использования калькулятора: " + calculator.getCountOperation());
        System.out.println("Результат: " + calculator.addition(a, calculator.addition(calculator.multiplication(b, c), calculator.exponentiation(calculator.division(d, e), 2))));
        System.out.println("Последнее сохранённое значение в памяти: " + calculator.getMemoryResult());
        System.out.println("Последнее сохранённое значение в памяти: " + calculator.getMemoryResult());
    }
}

