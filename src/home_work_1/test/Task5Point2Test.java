package home_work_1.test;

import home_work_1.Task5Point2;
import home_work_1.api.ICommunicationPrinter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task5Point2Test {
    private final ICommunicationPrinter printer = new Task5Point2();

    @Test
    public void testWelcomeMessageForVasia() {
        String name = "Вася";
        String expectedResult = "Привет! \nЯ тебя так долго ждал";
        String actualResult = printer.welcome(name);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testWelcomeMessageForAnastasia() {
        String name = "Анастасия";
        String expectedResult = "Я тебя так долго ждал";
        String actualResult = printer.welcome(name);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testWelcomeMessageDefault() {
        String name = "Петя";
        String expectedResult = "Добрый день, а вы кто?";
        String actualResult = printer.welcome(name);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
