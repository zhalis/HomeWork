package home_work_2.test;

import home_work_2.arrays.Task_2_4;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task_2_4Test {

    @Test
    public void testSumEventPositiveElementArray() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int expectedResult = 20;
        Assertions.assertEquals(expectedResult, Task_2_4.sumEventPositiveElementArray(arr));
    }

    @Test
    public void testSumEventPositiveElementSizeArrayZero() {
        int[] arr = new int[0];
        int expectedResult = 0;
        Assertions.assertEquals(expectedResult, Task_2_4.sumEventPositiveElementArray(arr));
    }

    @Test
    public void testMaxEvenIndexElementArray() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int expectedResult = 8;
        Assertions.assertEquals(expectedResult, Task_2_4.maxEvenIndexElementArray(arr));
    }

    @Test
    public void testLessAverage() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        String expectedResult = "1, 2, 3, 4, ";
        Assertions.assertEquals(expectedResult, Task_2_4.lessAverage(arr));
    }

    @Test
    public void testTwoSmallestArrayElements() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        String expectedResult = "2, 1";
        Assertions.assertEquals(expectedResult, Task_2_4.twoSmallestArrayElements(arr));
    }
    @Test
    public void testTwoSmallestArrayElementsWhenSmallestDuplicated() {
        int[] arr = {1, 2, 3, 4, 1, 6, 7, 8, 9};
        String expectedResult = "1, 1";
        Assertions.assertEquals(expectedResult, Task_2_4.twoSmallestArrayElements(arr));
    }

    @Test
    public void testTwoSmallestArrayElementsOnEmptyArray() {
        int[] arr = new int[0];
        String expectedResult = "Длинна массива равна 0";
        Assertions.assertEquals(expectedResult, Task_2_4.twoSmallestArrayElements(arr));
    }

    @Test
    public void testCompressedArray() {
        int intervalStart = 1;
        int endOfInterval = 5;
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] expectedResult = {6, 7, 8, 9, 0, 0, 0, 0, 0};
        int[] actualResult = Task_2_4.compressedArray(arr, intervalStart, endOfInterval);
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Test
    public void testSumOfArrayDigits() {
        int intervalStart = 1;
        int endOfInterval = 5;
        int[] arr = {1, 2, 3, 4, 55, 6, 7, 8, 9};
        int expectedResult = 50;
        int actualResult = Task_2_4.sumOfArrayDigits(arr);
        Assertions.assertEquals(expectedResult,actualResult);
    }
}
