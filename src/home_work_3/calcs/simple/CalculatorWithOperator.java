package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithOperator implements ICalculator {

    /**
     * Метод производит деление
     *
     * @param devidend делимое
     * @param divider  делитель
     * @return результат деления (частное)
     */
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
    public double subtraction(double minuend, double subtrahend) {
        return minuend - subtrahend;
    }

    /**
     * Метод возводит в целую степень дробное положительное число
     *
     * @param number число которое хотим возвести в степень
     * @param degree степень в которую хотим возвести
     * @return результат возведения числа number в степень degree
     */
    public double exponentiation(double number, int degree) {
        double result = number;
        for (int i = 1; i < degree; i++) {
            result *= number;
        }
        return result;
    }

    /**
     * Метод возвращает модуль числа
     *
     * @param number число модуль которого нужно получить
     * @return модуль числа number
     */
    public double theAbsoluteValueOfANumber(double number) {
        double a = 0.0;
        if (number < a) {
            return a - number;
        } else {
            return number;
        }
    }

    /**
     * Метод возвращает квадратный корень
     *
     * @param number число квадратный корень которого нужно получить
     * @return квадратный корень числа number
     */
    public double squareRoot(double number) {
        return Math.sqrt(number);
    }
}
