package home_work_1;

import java.util.Objects;
import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        boolean isWeekDay = false;
        boolean isVacation = false;

        Scanner scanner = new Scanner(System.in);
        System.out.println("У вас отпуск?");
        String vacation = scanner.nextLine();

        if (!Objects.equals(vacation, "да") && !Objects.equals(vacation, "нет")) {
            System.out.println("Некоректно введены данные! Ответ должен быть 'да' или 'нет'");
        } else if (Objects.equals(vacation, "да")) {
            isVacation = true;
        } else {
            System.out.println("Какой день недели сегодня?");
            String weekDay = scanner.nextLine();
            if (Objects.equals(workingDayOrWeekend(weekDay), "выходной")) {
                isWeekDay = true;
            } else if (!(Objects.equals(workingDayOrWeekend(weekDay), "рабочий"))) {
                System.out.println("Некоректно введены данные!");
            } else {
                System.out.println("Пора на работу");
            }
        }

        if (sleepIn(isWeekDay, isVacation)) {
            System.out.println("Мы можем спать дальше");
        }
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return weekday || vacation;
    }

    public static String workingDayOrWeekend(String weekDay) {
        switch (weekDay) {
            case "понедельник":
            case "вторник":
            case "среда":
            case "четверг":
            case "пятница":
                return "рабочий";
            case "суббота":
            case "воскресенье":
                return "выходной";
        }
        return weekDay;
    }
}
