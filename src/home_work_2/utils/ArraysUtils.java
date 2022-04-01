package home_work_2.utils;

import java.util.Random;
import java.util.Scanner;

public class ArraysUtils {

    public static void main(String[] args) {
        int size = 5;
        int maxValueExclusion = 14;

        for (int a : arrayFromConsole()) {
            System.out.print(a);
        }
        System.out.println();

        for (int a : arrayRandom(size, maxValueExclusion)) {
            System.out.print(a);
        }
    }

    /**
     * создает массиф по введенным с консоли параметрам
     *
     * @return массиф с задынними значениями элементов
     */
    public static int[] arrayFromConsole() {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите размер масива: ");
        int arraySize = console.nextInt();
        int[] container = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            System.out.println("Введите значение " + i + " ячейки масива: ");
            int arrayCellValue = console.nextInt();
            container[i] = arrayCellValue;
        }
        return container;
    }

    /**
     * Создает массив случайных значений от 0 до maxValueExclusion, заданной длинны size
     *
     * @param size              длинна массива
     * @param maxValueExclusion верхняя граница диапазона случайных значений
     * @return массив случайных чисел
     */
    public static int[] arrayRandom(int size, int maxValueExclusion) {
        int[] container = new int[size];
        Random randomValue = new Random();

        for (int i = 0; i < size; i++) {
            container[i] = randomValue.nextInt(maxValueExclusion);
        }
        return container;
    }
}
