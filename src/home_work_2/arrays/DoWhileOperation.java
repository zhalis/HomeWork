package home_work_2.arrays;

public class DoWhileOperation implements IArraysOperation {
    @Override
    public String allElements(int[] arrayFromConsole) {

        String allElements = "Все элементы массива методом do while: ";
        int i = 0;

        do {
            allElements += String.format("%d, ", arrayFromConsole[i]);
            i++;
        } while (i < arrayFromConsole.length);
        return allElements;
    }

    @Override
    public String everySecondElement(int[] arrayFromConsole) {

        String everySecondElement = "Каждый второй элемент массива методом do while: ";
        int j = 1;

        do {
            everySecondElement += String.format("%d, ", arrayFromConsole[j]);
            j += 2;
        } while (j < arrayFromConsole.length);
        return everySecondElement;
    }

    @Override
    public String allElementsReverseOrder(int[] arrayFromConsole) {

        String allElementsReverseOrder = "Все элементы массива в обратном порядке методом do while: ";
        int b = arrayFromConsole.length - 1;
        do {
            allElementsReverseOrder += String.format("%d, ", arrayFromConsole[b]);
            b--;
        } while (b >= 0);
        return allElementsReverseOrder;
    }
}
