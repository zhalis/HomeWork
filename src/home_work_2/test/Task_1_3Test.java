package home_work_2.test;

import home_work_2.loops.Task_1_3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task_1_3Test {

    @Test
    public void exponentiationInteger() {
        int a = 18;
        int b = 5;
        String expectedResult = "18.0 ^ 5 = 1889568.0";


        Assertions.assertEquals(expectedResult, Task_1_3.exponentiation(a, b));
    }

    @Test
    public void exponentiationDouble() {
        double a = 7.5;
        int b = 2;
        String expectedResult = "7.5 ^ 2 = 56.25";


        Assertions.assertEquals(expectedResult, Task_1_3.exponentiation(a, b));
    }

    @Test
    public void powerNumberNegative() {
        double a = 7.5;
        int b = -2;
        String expectedResult = "Нужно ввести положительное число!";
        Assertions.assertEquals(expectedResult, Task_1_3.exponentiation(a, b));
    }

    @Test
    public void powerNumberZero() {
        double a = 7.5;
        int b = 0;
        String expectedResult = "7.5 ^ 0 = 1.0";
        Assertions.assertEquals(expectedResult, Task_1_3.exponentiation(a, b));
    }
}
