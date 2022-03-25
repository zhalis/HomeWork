package home_work_1;

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число");
        byte number = console.nextByte();
        System.out.println(toBinaryString(number));

    }

    public static String toBinaryString(byte number) {
        int[] binaryCode = new int[8];
        if (number < 0) {
            for (int i = 0; i < 8; i++) {
                binaryCode[i] = 1;
            }
            number = (byte) (number * -1);
            number = (byte) (number - 1);
            if (number >= 64) {
                binaryCode[1] = 0;
                number = (byte) (number - 64);
            }
            if (number >= 32) {
                binaryCode[2] = 0;
                number = (byte) (number - 32);
            }
            if (number >= 16) {
                binaryCode[3] = 0;
                number = (byte) (number - 16);
            }
            if (number >= 8) {
                binaryCode[4] = 0;
                number = (byte) (number - 8);
            }
            if (number >= 4) {
                binaryCode[5] = 0;
                number = (byte) (number - 4);
            }
            if (number >= 2) {
                binaryCode[6] = 0;
                number = (byte) (number - 2);
            }
            if (number == 1) {
                binaryCode[7] = 0;
            }
        } else {

            if (number >= 64) {
                binaryCode[1] = 1;
                number = (byte) (number - 64);
            }
            if (number >= 32) {
                binaryCode[2] = 1;
                number = (byte) (number - 32);
            }
            if (number >= 16) {
                binaryCode[3] = 1;
                number = (byte) (number - 16);
            }
            if (number >= 8) {
                binaryCode[4] = 1;
                number = (byte) (number - 8);
            }
            if (number >= 4) {
                binaryCode[5] = 1;
                number = (byte) (number - 4);
            }
            if (number >= 2) {
                binaryCode[6] = 1;
                number = (byte) (number - 2);
            }
            if (number == 1) {
                binaryCode[7] = 1;
            }
        }
        return "" + binaryCode[0] + binaryCode[1] + binaryCode[2] + binaryCode[3] + binaryCode[4] + binaryCode[5] + binaryCode[6] + binaryCode[7];
    }
}

