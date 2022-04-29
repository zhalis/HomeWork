package home_work_1;

import home_work_1.api.ICommunicationPrinter;

import java.util.Objects;

public class Task5Point1 implements ICommunicationPrinter {

    @Override
    public String welcome(String name) {
        String nameVasia = "Вася";
        String nameAnastasia = "Анастасия";

        if (Objects.equals(name, nameVasia)) {
            return "Привет! \nЯ тебя так долго ждал";
        }
        if (Objects.equals(name, nameAnastasia)) {
            return "Я тебя так долго ждал";
        }
            return "Добрый день, а вы кто?";
    }
}
