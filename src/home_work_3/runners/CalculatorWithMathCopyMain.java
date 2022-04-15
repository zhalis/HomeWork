package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithMathCopyMain extends CalculatorWithMathCopy {

    public static void main(String[] args) {
        CalculatorWithMathCopyMain calculator = new CalculatorWithMathCopyMain();
        double a = 4.1;
        double b = 15.0;
        double c = 7.0;
        double d = 28.0;
        double e = 5.0;
        int degree = 2;
        double result;

        result = calculator.addition(a, calculator.addition(calculator.multiplication(b, c),
                calculator.exponentiation(calculator.division(d, e), degree)));
        System.out.println(result);
    }
}
