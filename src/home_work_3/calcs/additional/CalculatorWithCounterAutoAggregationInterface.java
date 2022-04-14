package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;
import home_work_3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoAggregationInterface {
    private long counter = 0;



    private final ICalculator calculator;

    public CalculatorWithCounterAutoAggregationInterface(CalculatorWithMathCopy calculator) {
        this.calculator = calculator;
    }

    public CalculatorWithCounterAutoAggregationInterface(CalculatorWithMathExtends calculator) {
        this.calculator = calculator;
    }

    public CalculatorWithCounterAutoAggregationInterface(CalculatorWithOperator calculator) {
        this.calculator = calculator;
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
        return calculator.division(devidend, divider);
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
        return calculator.multiplication(multiplicand, factor);
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
        return calculator.addition(ternFirst, ternSecond);
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
        return calculator.subtraction(minuend, subtrahend);
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
        return calculator.exponentiation(number, degree);
    }

    /**
     * Метод возвращает модуль числа
     *
     * @param number число модуль которого нужно получить
     * @return модуль числа number
     */
    public double theAbsoluteValueOfANumber(double number) {
        this.counter++;
        return calculator.theAbsoluteValueOfANumber(number);
    }

    /**
     * Метод возвращает квадратный корень
     *
     * @param number число квадратный корень которого нужно получить
     * @return квадратный корень числа number
     */
    public double squareRoot(double number) {
        this.counter++;
        return calculator.squareRoot(number);
    }

    public long getCountOperation() {
        return counter;
    }
}
