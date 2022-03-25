package home_work_1;

import java.util.Objects;
import java.util.Scanner;

public class Task5Point1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("введите имя:");
        String nameConsole = in.next();
        String nameVasia = "Вася";
        String nameAnastasia = "Анастасия";

        if (Objects.equals(nameConsole, nameVasia)) {
            System.out.println("Привет! \n" + "Я тебя так долго ждал");
        }
        if (Objects.equals(nameConsole, nameAnastasia)) {
            System.out.println("Я тебя так долго ждал");
        }
        if (!Objects.equals(nameConsole, nameVasia) && !Objects.equals(nameConsole, nameAnastasia)) {
            System.out.println("Добрый день, а вы кто?");
        }
    }
}
