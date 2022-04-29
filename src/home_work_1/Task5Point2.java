package home_work_1;

import home_work_1.api.ICommunicationPrinter;

import java.util.Objects;

public class Task5Point2 implements ICommunicationPrinter{

    @Override
    public String welcome(String name) { String nameVasia = "Вася";
        String nameAnastasia = "Анастасия";

        if (Objects.equals(name, nameVasia)) {
            return "Привет! \n" + "Я тебя так долго ждал";
        } else if (Objects.equals(name, nameAnastasia)) {
            return "Я тебя так долго ждал";
        } else {
            return "Добрый день, а вы кто?";
        }
    }
}
