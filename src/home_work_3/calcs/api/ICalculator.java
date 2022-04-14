package home_work_3.calcs.api;

public interface ICalculator {

    /**
     * Метод производит деление
     *
     */
    double division(double devidend, double divider);

    /**
     * Метод производит умножение
     *
     */
    double multiplication(double multiplicand, double factor);

    /**
     * Метод производит сложение
     *
     */
    double addition(double ternFirst, double ternSecond);

    /**
     * Метод производит вычитание
     *
     */
    double subtraction(double minuend, double subtrahend);

    /**
     * Метод возводит в степень дробное положительное число
     *
     */
    double exponentiation(double number, int degree);

    /**
     * Метод возвращает модуль числа
     *
     */
    double theAbsoluteValueOfANumber(double number);

    /**
     * Метод возвращает квадратный корень
     *
     */
    double squareRoot(double number);
}
