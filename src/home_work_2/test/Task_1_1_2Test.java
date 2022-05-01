package home_work_2.test;

import home_work_2.loops.Task_1_1_2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task_1_1_2Test {

    @Test
    public void multiplyUpToFive() {
        int multiplyToNumber = 5;
        String expectedResult = "1 * 2 * 3 * 4 * 5 = 120";
        String result = "";
        int counter = 0;
        int numberToBeMultiplied = 1;

        Assertions.assertEquals(expectedResult, Task_1_1_2.multiplicationTo(multiplyToNumber, counter, numberToBeMultiplied, result));
    }

    @Test
    public void multiplyUpToSix() {
        int multiplyToNumber = 6;
        String expectedResult = "1 * 2 * 3 * 4 * 5 * 6 = 720";
        String result = "";
        int counter = 0;
        int numberToBeMultiplied = 1;

        Assertions.assertEquals(expectedResult, Task_1_1_2.multiplicationTo(multiplyToNumber, counter, numberToBeMultiplied, result));
    }
}
