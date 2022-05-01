package home_work_2.test;

import home_work_2.arrays.ForEachOperation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ForEachOperationTest {

    ForEachOperation forEachOperation = new ForEachOperation();

    @Test
    public void AllElements() {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        String expectedResult = "Все элементы массива методом foreach: 1, 2, 3, 4, 5, 6, 7, 8, ";
        Assertions.assertEquals(expectedResult, forEachOperation.allElements(arr) );
    }

    @Test
    public void everySecondElement() {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        String expectedResult = "Каждый второй элемент массива методом foreach: 2, 4, 6, 8, ";
        Assertions.assertEquals(expectedResult, forEachOperation.everySecondElement(arr));
    }

    @Test
    public void allElementsReverseOrder() {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        String expectedResult = "Все элементы массива в обратном порядке методом foreach: 8, 7, 6, 5, 4, 3, 2, 1, ";
        Assertions.assertEquals(expectedResult, forEachOperation.allElementsReverseOrder(arr));
    }
}
