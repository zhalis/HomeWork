package towerOfHanoi;

import java.util.Scanner;

public class SillyAutoMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество колец от 3 до 20:");
        int numberOfRings = scanner.nextInt();
        System.out.println("Введите количество стержней от 3 до 8:");
        int numberOfRods = scanner.nextInt();
        TowerOfHanoiSillyAuto hanoiSillyAuto = new TowerOfHanoiSillyAuto(numberOfRings, numberOfRods);

        while (!hanoiSillyAuto.isTheEnd()) {
            hanoiSillyAuto.executeMove();
            hanoiSillyAuto.printField();
        }
        if (hanoiSillyAuto.isTheEnd()) {
            hanoiSillyAuto.printEndMessage();
        }
    }
}