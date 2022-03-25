package home_work_1;

import java.util.Objects;
import java.util.Scanner;

public class Task5Point3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("введите имя:");
        String nameConsole = in.next();

        switch (nameConsole) {
            case "Анастасия":
                System.out.println("Я тебя так долго ждал");
                break;
            case "Вася":
                System.out.println("Привет! \n" + "Я тебя так долго ждал");
                break;
            default:
                System.out.println("Добрый день, а вы кто?");
        }
    }
}
