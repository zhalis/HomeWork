package towerOfHanoi;

import java.util.Scanner;

public class AutoSmart {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество колец от 3 до 20:");
        int numberOfRings = scanner.nextInt();
        System.out.println("Введите количество стержней от 3 до 8:");
        int numberOfRods = scanner.nextInt();
        TowerOfHanoiSmartAuto smartAuto = new TowerOfHanoiSmartAuto(numberOfRings, numberOfRods);
        smartAuto.printField();



        while (!smartAuto.isTheEnd()) {

            smartAuto.executeMove();
            smartAuto.printField();
            System.out.println("__________");
        }
        if (smartAuto.isTheEnd()) {
            smartAuto.printEndMessage();
        }
    }
}
