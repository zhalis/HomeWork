package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

import java.util.Scanner;

public class Task_2_4 {
    public static void main(String[] args) {
        int size = 50;
        int maxValueExclusion = 100;
        int[] array = ArraysUtils.arrayRandom(size, maxValueExclusion);
        System.out.println("Сумма четных положительных элементов массива");
        System.out.println(sumEventPositiveElementArray(size, maxValueExclusion));
        System.out.println("Максимальный из элементов массива с четными индексами");
        System.out.println(maxEvenIndexElementArray(size, maxValueExclusion));
        System.out.println("Элементы массива, которые меньше среднего арифметического");
        System.out.println(lessAverage(size, maxValueExclusion));
        System.out.println("Найти два наименьших (минимальных) элемента массива");
        System.out.println(twoSmallestArrayElements(size, maxValueExclusion));
        System.out.println("Сжать массив, удалив элементы, принадлежащие интервалу");
        for (int a : compressedArray(size, maxValueExclusion)) {
            System.out.print(a + ", ");
        }
        System.out.println("\n Сумма цифр массива");
        System.out.println(sumOfArrayDigits(size, maxValueExclusion));
    }

    /**
     *  Создает маасив длинной size и заполняется случайными числами от нуля до maxValueExclusion. Складывает все четные элементы масива
     *
     * @param size длинна массива
     * @param maxValueExclusion верхняя граница интервала для заполнения массива
     * @return сумму четных элементов массива
     */
    public static int sumEventPositiveElementArray(int size, int maxValueExclusion) {
        int[] array = ArraysUtils.arrayRandom(size, maxValueExclusion);
        int result = 0;

        for (int arrayElement : array) {
            if (arrayElement > 0 && arrayElement % 2 == 0) {
                result += arrayElement;
            }
        }
        return result;
    }

    /**
     * Создает маасив длинной size и заполняется случайными числами от нуля до maxValueExclusion.Находит максимальный из элементов массива с четными индексами
     *
     * @param size длинна массива
     * @param maxValueExclusion верхняя граница интервала для заполнения массива
     * @return максимальный из элементов массива с четными индексами
     */
    public static int maxEvenIndexElementArray(int size, int maxValueExclusion) {
        int[] array = ArraysUtils.arrayRandom(size, maxValueExclusion);
        int maxIndex = array[1];

        for (int i = 0; i < array.length; i++)  {
            if ((array[i] > maxIndex) && (i % 2 != 0)){
                maxIndex = array[i];
            }
        }
        return maxIndex;
    }

    /**
     * Создает маасив длинной size и заполняется случайными числами от нуля до maxValueExclusion. Находит элементы массива, которые меньше среднего арифметического
     *
     * @param size длинна массива
     * @param maxValueExclusion верхняя граница интервала для заполнения массива
     * @return элементы массива, которые меньше среднего арифметического
     */
    public static String lessAverage(int size, int maxValueExclusion) {
        int[] array = ArraysUtils.arrayRandom(size, maxValueExclusion);
        String lessAverage = "";
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        result = result / size;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < result) {
                lessAverage += String.format("%d, ", array[i]);
            }
        }
        return lessAverage;
    }

    /**
     * Создает маасив длинной size и заполняется случайными числами от нуля до maxValueExclusion. Находит два наименьших (минимальных) элемента массива
     *
     * @param size длинна массива
     * @param maxValueExclusion верхняя граница интервала для заполнения массива
     * @return два наименьших (минимальных) элемента массива
     */
    public static String twoSmallestArrayElements(int size, int maxValueExclusion) {
        int[] array = ArraysUtils.arrayRandom(size, maxValueExclusion);
        String lessAverage = "";
        int firstMinNumber = array[0];
        int secondMinNumber = array[1];

        if (firstMinNumber < secondMinNumber) {
            int save = secondMinNumber;
            secondMinNumber = firstMinNumber;
            firstMinNumber = save;
        }

        for (int i = 2; i < array.length; i++) {
            if (firstMinNumber > array[i]) {
                if (firstMinNumber < secondMinNumber) {
                    secondMinNumber = firstMinNumber;
                }
                firstMinNumber = array[i];
            } else if (secondMinNumber > array[i]) {
                secondMinNumber = array[i];
            }
        }
        return "" + firstMinNumber + ", " + secondMinNumber;
    }

    /**
     * Создает маасив длинной size и заполняется случайными числами от нуля до maxValueExclusion. Сжимает массив, удалив элементы, принадлежащие интервалу
     *
     * @param size длинна массива
     * @param maxValueExclusion верхняя граница интервала для заполнения массива
     * @return массив, удалив элементы, принадлежащие интервалу
     */
    public static int[] compressedArray(int size, int maxValueExclusion) {
        int[] array = ArraysUtils.arrayRandom(size, maxValueExclusion);
        int[] compressedArray = new int[50];
        Scanner console = new Scanner(System.in);
        System.out.println("Введите начало интервала (1 - 99):");
        int intervalStart = console.nextInt();
        System.out.println("Введите конец интервала (" + intervalStart + "- 99):");
        int endOfInterval = console.nextInt();
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            if ((array[i] >= intervalStart) && (array[i] <= endOfInterval)) {
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                    if ((j + 1) == (array.length - 1)) {
                        counter++;
                        i--;
                        array[size - counter] = 0;
                    }
                }
            }
            compressedArray[i] = array[i];
        }
        return compressedArray;
    }

    /**
     * Создает маасив длинной size и заполняется случайными числами от нуля до maxValueExclusion. Слаживает цивры массива
     *
     * @param size длинна массива
     * @param maxValueExclusion верхняя граница интервала для заполнения массива
     * @return сумму всех цифр
     */
    public static int sumOfArrayDigits(int size, int maxValueExclusion) {
        int[] array = ArraysUtils.arrayRandom(size, maxValueExclusion);
        int result = 0;
        int i = 0;
        int a = 0;
        int b = 0;

        while (i < array.length) {
            b = array[i];
            for (; array[i] > 0; ) {
                a = array[i];
                result += array[i] % 10;
                array[i] = a / 10;
            }
            array[i] = b;
            i++;
        }
        return result;
    }
}
