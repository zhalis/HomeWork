package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathCopy implements ICalculator {

    /**
     * Метод производит деление
     *
     * @param devidend делимое
     * @param divider  делитель
     * @return результат деления (частное)
     */
    @Override
    public double division(double devidend, double divider) {
        return devidend / divider;
    }

    /**
     * Метод производит умножение
     *
     * @param multiplicand множимое
     * @param factor       множитель
     * @return результат умножения (произведение)
     */
    @Override
    public double multiplication(double multiplicand, double factor) {
        return multiplicand * factor;
    }

    /**
     * Метод производит сложение
     *
     * @param ternFirst  первое слогаемое
     * @param ternSecond второе слогаемое
     * @return результат сложения (сумму)
     */
    @Override
    public double addition(double ternFirst, double ternSecond) {
        return ternFirst + ternSecond;
    }

    /**
     * Метод производит вычитание
     *
     * @param minuend    уменьшаемое
     * @param subtrahend вычитаемое
     * @return резулитат вычитания (разность)
     */
    @Override
    public double subtraction(double minuend, double subtrahend) {
        return minuend - subtrahend;
    }

    /**
     * Метод возводит в степень дробное положительное число
     *
     * @param number число которое хотим возвести в степень
     * @param degree степень в которую хотим возвести
     * @return результат возведения числа number в степень degree
     */
    @Override
    public double exponentiation(double number, int degree) {
        return Math.pow(number, degree);
    }

    /**
     * Метод возвращает модуль числа
     *
     * @param number число модуль которого нужно получить
     * @return модуль числа number
     */
    @Override
    public double theAbsoluteValueOfANumber(double number) {
        return Math.abs(number);
    }

    /**
     * Метод возвращает квадратный корень
     *
     * @param number число квадратный корень которого нужно получить
     * @return квадратный корень числа number
     */
    @Override
    public double squareRoot(double number) {
        return Math.sqrt(number);
    }
}
