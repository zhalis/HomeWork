package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {

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
}
