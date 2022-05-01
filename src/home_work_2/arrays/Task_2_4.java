package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

import java.util.Scanner;

public class Task_2_4 {

    /**
     * Складывает все четные элементы маcсива
     *
     * @param array массив
     * @return сумму четных элементов массива
     */
    public static int sumEventPositiveElementArray(int[] array) {
        int result = 0;

        for (int arrayElement : array) {
            if (arrayElement > 0 && arrayElement % 2 == 0) {
                result += arrayElement;
            }
        }
        return result;
    }

    /**
     * Находит максимальный из элементов массива с четными индексами
     *
     * @param array массив
     * @return максимальный из элементов массива с четными индексами
     */
    public static int maxEvenIndexElementArray(int[] array) {
        int maxIndex = array[1];

        for (int i = 0; i < array.length - 1; i++) {
            if ((array[i] > maxIndex) && (i % 2 != 0)) {
                maxIndex = array[i];
            }
        }
        return maxIndex;
    }

    /**
     * Находит элементы массива, которые меньше среднего арифметического
     *
     * @param array массив
     * @return элементы массива, которые меньше среднего арифметического
     */
    public static String lessAverage(int[] array) {
        String lessAverage = "";
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        result = result / array.length;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < result) {
                lessAverage += String.format("%d, ", array[i]);
            }
        }
        return lessAverage;
    }

    /**
     * Находит два наименьших (минимальных) элемента массива
     *
     * @param array массива
     * @return два наименьших (минимальных) элемента массива
     */
    public static String twoSmallestArrayElements(int[] array) {
        if (array.length == 0){
            return "Длинна массива равна 0";
        }
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
        return firstMinNumber + ", " + secondMinNumber;
    }

    /**
     * Сжимает массив, удалив элементы, принадлежащие интервалу
     *
     * @param array массив
     * @return массив, удалив элементы, принадлежащие интервалу
     */
    public static int[] compressedArray(int[] array, int intervalStart, int endOfInterval) {
        int counter = 0;

        for (int i = 0; i < array.length - 1; i++) {
            if ((array[i] >= intervalStart) && (array[i] <= endOfInterval)) {
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                    if ((j + 1) == (array.length - 1)) {
                        counter++;
                        i--;
                        array[array.length - counter] = 0;
                    }
                }
            }
        }
        return array;
    }

    /**
     * Слаживает цивры массива
     *
     * @param array длинна массива
     * @return сумму всех цифр
     */
    public static int sumOfArrayDigits(int[] array) {
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
