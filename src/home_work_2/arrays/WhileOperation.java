package home_work_2.arrays;

public class WhileOperation implements IArraysOperation {

    @Override
    public String allElements(int[] arrayFromConsole) {
        String allElements = "Все элементы массива методом while: ";
        int i = 0;

        while (i < arrayFromConsole.length) {
            allElements += String.format("%d, ", arrayFromConsole[i]);
            i++;
        }
        return allElements;
    }

    @Override
    public String everySecondElement(int[] arrayFromConsole) {
        String everySecondElement = "Каждый второй элемент массива методом while: ";
        int j = 1;

        while (j < arrayFromConsole.length) {
            everySecondElement += String.format("%d, ", arrayFromConsole[j]);
            j += 2;
        }
        return everySecondElement;
    }

    @Override
    public String allElementsReverseOrder(int[] arrayFromConsole) {
        String allElementsReverseOrder = "Все элементы массива в обратном порядке методом while: ";
        int b = arrayFromConsole.length - 1;

        while (b >= 0) {
            allElementsReverseOrder += String.format("%d, ", arrayFromConsole[b]);
            b--;
        }
        return allElementsReverseOrder;
    }
}
