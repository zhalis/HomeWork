package home_work_1.test;

import home_work_1.Task7;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task7Test {

    @Test
    public void testPositiveByteConversionToBinaryString () {
        byte numberFortyTwo = 42;
        String expectedResultFortyTwo = "00101010";
        String actualResultFortyTwo = Task7.toBinaryString(numberFortyTwo);

        Assertions.assertEquals(expectedResultFortyTwo, actualResultFortyTwo);

        byte numberFifteen = 15;
        String expectedResultFifteen = "00001111";
        String actualResultFifteen = Task7.toBinaryString(numberFifteen);

        Assertions.assertEquals(expectedResultFifteen, actualResultFifteen);
    }

    @Test
    public void testNegativeByteConversionToBinaryString () {
        byte minusFortyTwo = -42;
        String expectedResultMinusFortyTwo = "11010110";
        String actualResultMinusFortyTwo = Task7.toBinaryString(minusFortyTwo);

        Assertions.assertEquals(expectedResultMinusFortyTwo, actualResultMinusFortyTwo);

        byte minusFifteen = -15;
        String expectedResultMinusFifteen = "11110001";
        String actualResultMinusFifteen = Task7.toBinaryString(minusFifteen);

        Assertions.assertEquals(expectedResultMinusFifteen, actualResultMinusFifteen);
    }
}

