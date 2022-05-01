package home_work_2.test;

import home_work_2.arrays.DoWhileOperation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DoWhileOperationTest {
    DoWhileOperation whileOperation = new DoWhileOperation();

    @Test
    public void AllElements() {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        String expectedResult = "Все элементы массива методом do while: 1, 2, 3, 4, 5, 6, 7, 8, ";
        Assertions.assertEquals(expectedResult, whileOperation.allElements(arr));
    }

    @Test
    public void everySecondElement() {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        String expectedResult = "Каждый второй элемент массива методом do while: 2, 4, 6, 8, ";
        Assertions.assertEquals(expectedResult, whileOperation.everySecondElement(arr));
    }

    @Test
    public void allElementsReverseOrder() {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        String expectedResult = "Все элементы массива в обратном порядке методом do while: 8, 7, 6, 5, 4, 3, 2, 1, ";
        Assertions.assertEquals(expectedResult, whileOperation.allElementsReverseOrder(arr));
    }
}
