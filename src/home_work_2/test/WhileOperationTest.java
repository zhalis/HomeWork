package home_work_2.test;

import home_work_2.arrays.WhileOperation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WhileOperationTest {

    WhileOperation whileOperation = new WhileOperation();

    @Test
    public void AllElements() {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        String expectedResult = "Все элементы массива методом while: 1, 2, 3, 4, 5, 6, 7, 8, ";
        Assertions.assertEquals(expectedResult, whileOperation.allElements(arr) );
    }

    @Test
    public void everySecondElement() {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        String expectedResult = "Каждый второй элемент массива методом while: 2, 4, 6, 8, ";
        Assertions.assertEquals(expectedResult, whileOperation.everySecondElement(arr));
    }

    @Test
    public void allElementsReverseOrder() {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        String expectedResult = "Все элементы массива в обратном порядке методом while: 8, 7, 6, 5, 4, 3, 2, 1, ";
        Assertions.assertEquals(expectedResult, whileOperation.allElementsReverseOrder(arr));
    }
}
