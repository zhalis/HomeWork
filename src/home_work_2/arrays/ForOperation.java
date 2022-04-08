package home_work_2.arrays;

public class ForOperation implements IArraysOperation {

    @Override
    public String allElements(int[] arrayFromConsole) {
        String allElements = "Все элементы массива методом for: ";

        for (int i = 0; i < arrayFromConsole.length; i++) {
            allElements += String.format("%d, ", arrayFromConsole[i]);
        }
        return allElements;
    }

    @Override
    public String everySecondElement(int[] arrayFromConsole) {
        String everySecondElement = "Каждый второй элемент массива методом for: ";

        for (int i = 1; i < arrayFromConsole.length; i++) {
            everySecondElement += String.format("%d, ", arrayFromConsole[i]);
            i++;
        }
        return everySecondElement;
    }

    @Override
    public String allElementsReverseOrder(int[] arrayFromConsole) {
        String allElementsReverseOrder = "Все элементы массива в обратном порядке методом for: ";

        for (int i = arrayFromConsole.length - 1; i >= 0; i--) {
            allElementsReverseOrder += String.format("%d, ", arrayFromConsole[i]);
        }
        return allElementsReverseOrder;
    }
}

