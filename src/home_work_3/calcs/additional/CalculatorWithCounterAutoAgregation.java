package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoAgregation {

    private long counter = 0;

    private CalculatorWithMathCopy calculatorWithMathCopy;
    private CalculatorWithOperator calculatorWithOperator;
    private CalculatorWithMathExtends calculatorWithMathExtends;

    public CalculatorWithCounterAutoAgregation(CalculatorWithMathCopy calculator) {
        this.calculatorWithMathCopy = calculator;
    }

    public CalculatorWithCounterAutoAgregation(CalculatorWithMathExtends calculator) {
        this.calculatorWithOperator = calculator;
    }

    public CalculatorWithCounterAutoAgregation(CalculatorWithOperator calculator) {
        this.calculatorWithOperator = calculator;
    }

    /**
     * Метод производит деление
     *
     * @param devidend делимое
     * @param divider  делитель
     * @return результат деления (частное)
     */
    public double division(double devidend, double divider) {
        this.counter++;
        CalculatorWithCounterAutoAgregation calculator;
        if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.division(devidend, divider);
        } else if (calculatorWithOperator != null) {
            return calculatorWithOperator.division(devidend, divider);
        } else {
            return calculatorWithMathExtends.division(devidend, divider);
        }
    }

    /**
     * Метод производит умножение
     *
     * @param multiplicand множимое
     * @param factor       множитель
     * @return результат умножения (произведение)
     */
    public double multiplication(double multiplicand, double factor) {
        this.counter++;
        if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.multiplication(multiplicand, factor);
        } else if (calculatorWithOperator != null) {
            return calculatorWithOperator.multiplication(multiplicand, factor);
        } else {
            return calculatorWithMathExtends.multiplication(multiplicand, factor);
        }
    }

    /**
     * Метод производит сложение
     *
     * @param ternFirst  первое слогаемое
     * @param ternSecond второе слогаемое
     * @return результат сложения (сумму)
     */
    public double addition(double ternFirst, double ternSecond) {
        this.counter++;
        if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.addition(ternFirst, ternSecond);
        } else if (calculatorWithOperator != null) {
            return calculatorWithOperator.addition(ternFirst, ternSecond);
        } else {
            return calculatorWithMathExtends.addition(ternFirst, ternSecond);
        }
    }

    /**
     * Метод производит вычитание
     *
     * @param minuend    уменьшаемое
     * @param subtrahend вычитаемое
     * @return резулитат вычитания (разность)
     */
    public double subtraction(double minuend, double subtrahend) {
        this.counter++;
        if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.subtraction(minuend, subtrahend);
        } else if (calculatorWithOperator != null) {
            return calculatorWithOperator.subtraction(minuend, subtrahend);
        } else {
            return calculatorWithMathExtends.subtraction(minuend, subtrahend);
        }
    }

    /**
     * Метод возводит в степень дробное положительное число
     *
     * @param number число которое хотим возвести в степень
     * @param degree степень в которую хотим возвести
     * @return результат возведения числа number в степень degree
     */
    public double exponentiation(double number, int degree) {
        this.counter++;
        if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.exponentiation(number, degree);
        } else if (calculatorWithOperator != null) {
            return calculatorWithOperator.exponentiation(number, degree);
        } else {
            return calculatorWithMathExtends.exponentiation(number, degree);
        }
    }

    /**
     * Метод возвращает модуль числа
     *
     * @param number число модуль которого нужно получить
     * @return модуль числа number
     */
    public double theAbsoluteValueOfANumber(double number) {
        this.counter++;
        if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.theAbsoluteValueOfANumber(number);
        } else if (calculatorWithOperator != null) {
            return calculatorWithOperator.theAbsoluteValueOfANumber(number);
        } else {
            return calculatorWithMathExtends.theAbsoluteValueOfANumber(number);
        }
    }

    /**
     * Метод возвращает квадратный корень
     *
     * @param number число квадратный корень которого нужно получить
     * @return квадратный корень числа number
     */
    public double squareRoot(double number) {
        this.counter++;
        if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.squareRoot(number);
        } else if (calculatorWithOperator != null) {
            return calculatorWithOperator.theAbsoluteValueOfANumber(number);
        } else {
            return calculatorWithMathExtends.squareRoot(number);
        }
    }
    public long getCountOperation() {
        return counter;
    }
}
