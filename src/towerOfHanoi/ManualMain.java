package towerOfHanoi;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class ManualMain {

    public static void main(String[] args) throws IOException {
        TowerOfHanoiManual hanoiManual = null;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Новая игра введите - 1  Загрузить сохранённую игру введите - 2 Запустить пройденную игру введите - 3");
            int startGame = scanner.nextInt();
            if (startGame == 1) {
                System.out.println("Введите количество колец от 3 до 20:");
                int numberOfRings = scanner.nextInt();
                System.out.println("Введите количество стержней от 3 до 8:");
                int numberOfRods = scanner.nextInt();
                hanoiManual = new TowerOfHanoiManual(numberOfRings, numberOfRods);
                break;
            } else if (startGame == 2) {
                System.out.println(Arrays.toString(TowerOfHanoiManual.showListOfSavedGames()));
                System.out.println("Введите название файла:");
                String loadName = scanner.next();
                hanoiManual = new TowerOfHanoiManual(loadName);
                break;
            } else if (startGame == 3) {
                hanoiManual = new TowerOfHanoiManual();
                break;
            }
            System.out.println("Ты что ли читать не умеешь!!!!");
        }
        hanoiManual.printField();

        while (!hanoiManual.isTheEnd()) {
            System.out.println("Введите номер стержня с которого хотите перенести кольцо:");
            int columnNumberFrom = scanner.nextInt();
            System.out.println("Введите номер стержня куда хотите положить кольцо:");
            int columnNumberTo = scanner.nextInt();
            hanoiManual.transferRing(columnNumberFrom, columnNumberTo);
            hanoiManual.printField();
        }

//        while (!hanoiManual.isTheEnd()) {
//
//            System.out.println("Вы хотите завершить игру? Если хотите продолжить введите - 1, если хотите завершить введите - 2");
//            int continueGame = scanner.nextInt();
//            if (continueGame == 1) {
//                System.out.println("Введите номер стержня с которого хотите перенести кольцо:");
//                int columnNumberFrom = scanner.nextInt();
//                System.out.println("Введите номер стержня куда хотите положить кольцо:");
//                int columnNumberTo = scanner.nextInt();
//                hanoiManual.ringTransfer(columnNumberFrom, columnNumberTo);
//                hanoiManual.printField();
//            } else if (continueGame == 2) {
//                System.out.println("Вы хотите сохранить игру? если ДА введите - 1  если НЕТ введите - 2");
//                int saveGame = scanner.nextInt();
//                if (saveGame == 1) {
//                    System.out.println("Введите название сохранения");
//                    String saveName = scanner.next();
//                    hanoiManual.saveProgress(saveName);
//                }
//                break;
//            }
            if (hanoiManual.isTheEnd()) {
                hanoiManual.printEndMessage();
                hanoiManual.saveEndGame();
            }
        }
    }
//}
