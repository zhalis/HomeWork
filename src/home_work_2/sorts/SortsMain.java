package home_work_2.sorts;

import home_work_2.utils.ArraysUtils;
import home_work_2.utils.SortsUtils;

public class SortsMain {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        int[] b = {1, 1, 1, 1};
        int[] c = {9, 1, 5, 99, 9, 9};
        int[] d = {};
        int[] e = {6, 5, 4, 3, 2, 1};
        int[] numbersRandom = ArraysUtils.arrayRandom(50, 100);
        int[] numberConsole = ArraysUtils.arrayFromConsole();

        System.out.println("Массив (a) до сортировки:");
        print(a);
        System.out.println("Массив (a) после после пузырьковой сортировки:");
        SortsUtils.bubble(a);
        print(a);

        System.out.println("Массив (b) до сортировки:");
        print(b);
        System.out.println("Массив (b) после после пузырьковой сортировки:");
        SortsUtils.bubble(b);
        print(b);

        System.out.println("Массив (c) до сортировки:");
        print(c);
        System.out.println("Массив (c) после после пузырьковой сортировки:");
        SortsUtils.bubble(c);
        print(c);

        System.out.println("Массив (d) до сортировки:");
        print(d);
        System.out.println("Массив (d) после после пузырьковой сортировки:");
        SortsUtils.bubble(d);
        print(d);

        System.out.println("Массив (e) до сортировки:");
        print(e);
        System.out.println("Массив (e) после после пузырьковой сортировки:");
        SortsUtils.bubble(e);
        print(e);

        System.out.println("Массив (numbersRandom) до сортировки:");
        print(numbersRandom);
        System.out.println("Массив (numbersRandom) после после пузырьковой сортировки:");
        SortsUtils.bubble(numbersRandom);
        print(numbersRandom);

        System.out.println("Массив (numberConsole) до сортировки:");
        print(numberConsole);
        System.out.println("Массив после (numberConsole) после пузырьковой сортировки:");
        SortsUtils.bubble(numberConsole);
        print(numberConsole);

        a = new int[]{1, 2, 3, 4, 5, 6};
        b = new int[]{1, 1, 1, 1};
       c = new int[]{9, 1, 5, 99, 9, 9};
        d = new int[]{};
        e = new int[]{6, 5, 4, 3, 2, 1};
        numbersRandom = ArraysUtils.arrayRandom(50, 100);
        numberConsole = ArraysUtils.arrayFromConsole();

        System.out.println("Массив (a) до сортировки:");
        print(a);
        System.out.println("Массив (a) после после шейкерной сортировки:");
        SortsUtils.shake(a);
        print(a);

        System.out.println("Массив (b) до сортировки:");
        print(b);
        System.out.println("Массив (b) после после шейкерной сортировки:");
        SortsUtils.shake(b);
        print(b);

        System.out.println("Массив (c) до сортировки:");
        print(c);
        System.out.println("Массив (c) после после шейкерной сортировки:");
        SortsUtils.shake(c);
        print(c);

        System.out.println("Массив (d) до сортировки:");
        print(d);
        System.out.println("Массив (d) после после шейкерной сортировки:");
        SortsUtils.shake(d);
        print(d);

        System.out.println("Массив (e) до сортировки:");
        print(e);
        System.out.println("Массив (e) после после шейкерной сортировки:");
        SortsUtils.shake(e);
        print(e);

        System.out.println("Массив (numbersRandom) до сортировки:");
        print(numbersRandom);
        System.out.println("Массив (numbersRandom) после после шейкерной сортировки:");
        SortsUtils.shake(numbersRandom);
        print(numbersRandom);

        System.out.println("Массив (numberConsole) до сортировки:");
        print(numberConsole);
        System.out.println("Массив после (numberConsole) после шейкерной сортировки:");
        SortsUtils.shake(numberConsole);
        print(numberConsole);
    }

    /**
     * Метод выводит в консоль все элементы массива
     *
     * @param numbers массив интов
     */
    public static void print(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + ", ");
        }
        System.out.println();
    }
}
