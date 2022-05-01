package home_work_2.utils;

public class SortsUtils {

    /**
     * Метод производит пузырьковою сортировку массива
     *
     * @param arr массив интов
     * @return отсортированный массив
     */
    public static int[] bubble(int[] arr) {

        for (int i = arr.length - 1; i > 0; i--) {


            if (arr[i] < arr[i - 1]) {
                int save = 0;
                for (int j = i; j > 0; j--) {
                    save = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = save;
                }
                i = arr.length;
            }
        }
        return arr;
    }

    /**
     * Метод производит шуйковую сортировку массива
     *
     * @param arr массив интов
     * @return отсартированный массив
     */
    public static int[] shake(int[] arr) {

        int leftValue = 0;
        int rightValue = arr.length - 1;
        int save = 0;
        boolean moving = true;

        while ((leftValue < rightValue) && (moving)) {
            moving = false;
            for (int i = leftValue; i < rightValue; i++) {
                if (arr[i] > arr[i + 1]) {
                    save = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = save;
                    moving = true;
                }

            }
            rightValue--;
            for (int i = rightValue; i > leftValue; i--) {
                if (arr[i] < arr[i - 1]) {
                    save = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = save;
                    moving = true;
                }

            }
            leftValue++;
        }
        return arr;
    }
}
