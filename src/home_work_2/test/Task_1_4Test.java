package home_work_2.test;

import home_work_2.loops.Task_1_4;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task_1_4Test {

    @Test
    public void testMultiplyToOverflowPositiveNumber() {
        long numberToBeMultiplied = 1;
        long multiplier = 3;

        String expectedResult = "Произошло переполнение!" + "\nЗначение до переполнения: " + 4052555153018976267L
                + "\nЗначение после переполнения: " + -6289078614652622815L;
        String actualResult = Task_1_4.multiplyToOverflow(numberToBeMultiplied, multiplier);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMultiplyToOverflowPositiveBigNumber() {
        long numberToBeMultiplied = 1;
        long multiplier = 188;

        String expectedResult = "Произошло переполнение!" + "\nЗначение до переполнения: " + 1560496482665168896L
                + "\nЗначение после переполнения: " + -1774566438301073408L;
        String actualResult = Task_1_4.multiplyToOverflow(numberToBeMultiplied, multiplier);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMultiplyToOverflowNegativeNumber() {
        long numberToBeMultiplied = 1;
        long multiplier = -19;

        String expectedResult = "Произошло переполнение!" + "\nЗначение до переполнения: " + 799006685782884121L
                + "\nЗначение после переполнения: " + 3265617043834753317L;
        String actualResult = Task_1_4.multiplyToOverflow(numberToBeMultiplied, multiplier);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMultiplyToOverflowRandomNumber() {
        long numberToBeMultiplied = 1;
        long multiplier = 5;

        String expectedResult = "Произошло переполнение!" + "\nЗначение до переполнения: " + 7450580596923828125L
                + "\nЗначение после переполнения: " + 359414837200037393L;
        String actualResult = Task_1_4.multiplyToOverflow(numberToBeMultiplied, multiplier);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
