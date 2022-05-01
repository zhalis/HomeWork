package home_work_2.test;

import home_work_2.loops.Task_1_2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task_1_2Test {

    @Test
    public void EnterDouble() {
        String[] a = {"92.2"};
        String expectedResult = "Введено не целое число!";
        Assertions.assertEquals(expectedResult, Task_1_2.isResultMultiplying(a));
    }

    @Test
    public void EnterChar() {
        String[] a = {"Привет"};
        String expectedResult = "Введено не число!";
        Assertions.assertEquals(expectedResult, Task_1_2.isResultMultiplying(a));
    }

    @Test
    public void EnterNumber() {
        String[] a = {"181232375"};
        String expectedResult = "1 * 8 * 1 * 2 * 3 * 2 * 3 * 7 * 5 = 10080";
        Assertions.assertEquals(expectedResult, Task_1_2.isResultMultiplying(a));
    }

    @Test
    public void EnterNumberTwo() {
        String[] a = {"2"};
        String expectedResult = "2 = 2";
        Assertions.assertEquals(expectedResult, Task_1_2.isResultMultiplying(a));
    }
}
