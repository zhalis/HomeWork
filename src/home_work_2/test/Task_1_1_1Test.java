package home_work_2.test;

import home_work_2.loops.Task_1_1_1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task_1_1_1Test {

    @Test
    public void multiplyUpToFive() {
        Task_1_1_1 task = new Task_1_1_1();
        String[] a = {"5"};
        String expectedResult = "1 * 2 * 3 * 4 * 5 = 120";
        Assertions.assertEquals(expectedResult, task.multiplicationTo(a));
    }

    @Test
    public void multiplyUpToSix() {
        Task_1_1_1 task = new Task_1_1_1();
        String[] a = {"6"};
        String expectedResult = "1 * 2 * 3 * 4 * 5 * 6 = 720";
        Assertions.assertEquals(expectedResult, task.multiplicationTo(a));
    }
}
