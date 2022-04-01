package home_work_2.loops;

import java.util.Scanner;

public class Task_1_3 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число, которое хотите возвести в степень:");
        float targetNumber = console.nextFloat();
        System.out.println("Введите число, в степень которого будет возведенно первое число:");
        int powerNumber = console.nextInt();
        float result = targetNumber;

        if (powerNumber == 0) {
            result = 1;
        } else if (powerNumber < 0) {
            System.out.println("Нужно ввести положительное число!");
        }

        for (int i = 1; i < powerNumber; i++) {
            result = result * targetNumber;
        }
        System.out.println(targetNumber + " ^ " + powerNumber + " = " + result);
    }


}
