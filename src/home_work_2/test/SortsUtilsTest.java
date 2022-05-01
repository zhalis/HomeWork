package home_work_2.test;

import home_work_2.utils.SortsUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortsUtilsTest {

    @Test
    public void testBubbleSortWithSortedElements() {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        int[] expectedResult = {1, 2, 3, 4, 5, 6};
        Assertions.assertArrayEquals(expectedResult, SortsUtils.bubble(arr));
    }

    @Test
    public void testBubbleSortArrayWithSameElements() {
        int[] arr = new int[]{1, 1, 1, 1};
        int[] expectedResult = {1, 1, 1, 1};
        Assertions.assertArrayEquals(expectedResult, SortsUtils.bubble(arr));
    }

    @Test
    public void testBubbleSortArray() {
        int[] arr = new int[]{9, 1, 5, 99, 9, 9};
        int[] expectedResult = {1, 5, 9, 9, 9, 99};
        Assertions.assertArrayEquals(expectedResult, SortsUtils.bubble(arr));
    }

    @Test
    public void testBubbleSortEmptyArray() {
        int[] arr = new int[]{};
        int[] expectedResult = {};
        Assertions.assertArrayEquals(expectedResult, SortsUtils.bubble(arr));
    }

    @Test
    public void testBubbleSortWithReversedElementsArray() {
        int[] arr = new int[]{6, 5, 4, 3, 2, 1};
        int[] expectedResult = {1, 2, 3, 4, 5, 6};
        Assertions.assertArrayEquals(expectedResult, SortsUtils.bubble(arr));
    } @Test
    public void testShakeSortWithSortedElements() {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        int[] expectedResult = {1, 2, 3, 4, 5, 6};
        Assertions.assertArrayEquals(expectedResult, SortsUtils.shake(arr));
    }

    @Test
    public void testShakeSortArrayWithSameElements() {
        int[] arr = new int[]{1, 1, 1, 1};
        int[] expectedResult = {1, 1, 1, 1};
        Assertions.assertArrayEquals(expectedResult, SortsUtils.shake(arr));
    }

    @Test
    public void testShakeSortArray() {
        int[] arr = new int[]{9, 1, 5, 99, 9, 9};
        int[] expectedResult = {1, 5, 9, 9, 9, 99};
        Assertions.assertArrayEquals(expectedResult, SortsUtils.shake(arr));
    }

    @Test
    public void testShakeSortEmptyArray() {
        int[] arr = new int[]{};
        int[] expectedResult = {};
        Assertions.assertArrayEquals(expectedResult, SortsUtils.shake(arr));
    }

    @Test
    public void testShakeSortWithReversedElementsArray() {
        int[] arr = new int[]{6, 5, 4, 3, 2, 1};
        int[] expectedResult = {1, 2, 3, 4, 5, 6};
        Assertions.assertArrayEquals(expectedResult, SortsUtils.shake(arr));
    }
}
