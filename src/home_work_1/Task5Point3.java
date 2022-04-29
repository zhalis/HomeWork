package home_work_1;

import home_work_1.api.ICommunicationPrinter;

public class Task5Point3 implements ICommunicationPrinter {

    @Override
    public String welcome(String name) {
        switch (name) {
            case "Анастасия":
                return "Я тебя так долго ждал";
            case "Вася":
                return "Привет! \n" + "Я тебя так долго ждал";
            default:
                return "Добрый день, а вы кто?";
        }
    }
}
