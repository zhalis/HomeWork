package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

public class ArraysIteration {

    public static void main(String[] args) {
        int[] arrayFromConsole = ArraysUtils.arrayFromConsole();
        System.out.println("allElements");
        System.out.println(allElements(arrayFromConsole));
        System.out.println("everySecondElement");
        System.out.println(everySecondElement(arrayFromConsole));
        System.out.println("allElementsReverseOrder");
        System.out.println(allElementsReverseOrder(arrayFromConsole));
    }

    /**
     * Выводит в консоль все элементы массива
     *
     * @param arrayFromConsole массив в котором зыдаем с консоли длинна масива и задаем значения каждого элемента массива
     * @return четыри строки со всеми элементами массива выведенными разными методами
     */
    public static String allElements(int[] arrayFromConsole) {
        String methodForeach = "";
        for (int a : arrayFromConsole) {
            methodForeach += String.format("%d, ", a);
        }
        String methodFor = "";
        for (int i = 0; i < arrayFromConsole.length; i++) {
            methodFor += String.format("%d, ", arrayFromConsole[i]);
        }
        String methodWhile = "";
        int b = 0;
        while (b < arrayFromConsole.length) {
            methodWhile += String.format("%d, ", arrayFromConsole[b]);
            b++;
        }
        String methodDoWhile = "";
        int j = 0;
        do {
            methodDoWhile += String.format("%d, ", arrayFromConsole[j]);
            j++;
        } while (j < arrayFromConsole.length);
        return "methodForeach: " + methodForeach + "\nmethodFor: " + methodFor +
                "\nmethodWhile: " + methodWhile + "\nmethodDoWhile: " + methodDoWhile;
    }

    /**
     * Выводит каждый второй элемент массива в консоль
     *
     * @param arrayFromConsole массив в котором зыдаем с консоли длинна масива и задаем значения каждого элемента массива
     * @return четыри строки с каждым вторым элементом массива выведенными разными методами
     */
    public static String everySecondElement(int[] arrayFromConsole) {
        String methodForeach = "";
        int h = 0;
        for (int a : arrayFromConsole) {
            if (h % 2 != 0) {
                methodForeach += String.format("%d, ", a);
            }
            h++;
        }


        String methodFor = "";
        for (int i = 1; i < arrayFromConsole.length; i++) {
            methodFor += String.format("%d, ", arrayFromConsole[i]);
            i++;
        }
        String methodWhile = "";
        int b = 1;
        while (b < arrayFromConsole.length) {
            methodWhile += String.format("%d, ", arrayFromConsole[b]);
            b += 2;
        }
        String methodDoWhile = "";
        int j = 1;
        do {
            methodDoWhile += String.format("%d, ", arrayFromConsole[j]);
            j += 2;
        } while (j < arrayFromConsole.length);
        return "methodForeach: " + methodForeach + "\nmethodFor: " + methodFor +
                "\nmethodWhile: " + methodWhile + "\nmethodDoWhile: " + methodDoWhile;
    }

    /**
     * Выводит все элементы массива в консоль в обратном порядке
     *
     * @param arrayFromConsole массив в котором зыдаем с консоли длинна масива и задаем значения каждого элемента массива
     * @return четыри строки со всеми элементами массива выведенными в обратном порядке разными методами
     */
    public static String allElementsReverseOrder(int[] arrayFromConsole) {
        String methodForeach = "";
        int[] container = new int[arrayFromConsole.length];
        int h = arrayFromConsole.length - 1;
        for (int a : arrayFromConsole) {
            container[h] = a;
            h--;
        }
        for (int a : container) {
            methodForeach += String.format("%d, ", a);
        }


        String methodFor = "";
        for (int i = arrayFromConsole.length - 1; i >= 0; i--) {
            methodFor += String.format("%d, ", arrayFromConsole[i]);
        }
        String methodWhile = "";
        int b = arrayFromConsole.length - 1;
        while (b >= 0) {
            methodWhile += String.format("%d, ", arrayFromConsole[b]);
            b--;
        }
        String methodDoWhile = "";
        int j = arrayFromConsole.length - 1;
        do {
            methodDoWhile += String.format("%d, ", arrayFromConsole[j]);
            j--;
        } while (j >= 0);
        return "methodForeach: " + methodForeach + "\nmethodFor: " + methodFor +
                "\nmethodWhile: " + methodWhile + "\nmethodDoWhile: " + methodDoWhile;
    }
}
