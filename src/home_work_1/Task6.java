package home_work_1;

public class Task6 {

    public static void main(String[] args) {
        int[] numbers = {5, 4, 8, 9, 5, 5, 4, 7, 1, 0};
        int[] numbers2 = {0, 1, 2, 2, 3, 4, 5};
        System.out.println(createPhoneNumber(numbers));

        for(int i : numbers2) {
            System.out.println(i);
        }
    }

    public static String createPhoneNumber(int[] numbers) {

             return "(" + numbers[0] + numbers[1] + numbers[2] + ")" + " "
                + numbers[3] + numbers[4] + numbers[5] + "-" + numbers[6] + numbers[7] + numbers[8] + numbers[9];
    }
}