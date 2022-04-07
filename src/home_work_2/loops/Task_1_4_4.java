package home_work_2.loops;

import java.util.Scanner;

public class Task_1_4_4 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите любое целочисленное число:");
        long r = console.nextLong();
        long x = 1;
        long y = -19;


        while (true) {
            r = x * y;
            long ax = Math.abs(x);
            long ay = Math.abs(y);
            if (((ax | ay) >>> 31 != 0)) {
                if (y != 0 && r / y != x) {
                    System.out.println("Произошло переполнение!");
                    break;
                } else {
                    x *= y;
                }
            } else {
                x *= y;
            }
        }
        System.out.println(x);
        r = x * y;
        System.out.println(r);
    }
}
