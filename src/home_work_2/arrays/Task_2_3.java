package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

import java.util.Objects;

public class Task_2_3 {

    public static void main(String[] args) {
        int[] arrayFromConsole = ArraysUtils.arrayFromConsole();

        IArraysOperation doWhileOperation = new DoWhileOperation();
        IArraysOperation whileOperation = new WhileOperation();
        IArraysOperation forOperation = new ForOperation();
        IArraysOperation forEachOperation = new ForEachOperation();

        IArraysOperation[] operationArrays = {doWhileOperation, whileOperation, forOperation, forEachOperation};

        for (IArraysOperation operation : operationArrays) {
            print(operation, arrayFromConsole);
        }
    }

    public static void print(IArraysOperation operation, int[] numbers) {
        System.out.println(operation.allElements(numbers));
        System.out.println(operation.everySecondElement(numbers));
        System.out.println(operation.allElementsReverseOrder(numbers) + "\n");
    }
}
