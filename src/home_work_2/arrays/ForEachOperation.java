package home_work_2.arrays;

public class ForEachOperation implements IArraysOperation {

    @Override
    public String allElements(int[] arrayFromConsole) {
        String allElements = "Все элементы массива методом foreach: ";

        for (int a : arrayFromConsole) {
            allElements += String.format("%d, ", a);
        }
        return allElements;
    }

    @Override
    public String everySecondElement(int[] arrayFromConsole) {
        String everySecondElement = "Каждый второй элемент массива методом foreach: ";
        int i = 0;

        for (int a : arrayFromConsole) {
            if (i % 2 != 0) {
                everySecondElement += String.format("%d, ", a);
            }
            i++;
        }
        return everySecondElement;
    }

    @Override
    public String allElementsReverseOrder(int[] arrayFromConsole) {
        String allElementsReverseOrder = "Все элементы массива в обратном порядке методом foreach: ";
        int[] container = new int[arrayFromConsole.length];
        int j = arrayFromConsole.length - 1;

        for (int a : arrayFromConsole) {
            container[j] = a;
            j--;
        }

        for (int a : container) {
            allElementsReverseOrder += String.format("%d, ", a);
        }
        return allElementsReverseOrder;
    }
}
