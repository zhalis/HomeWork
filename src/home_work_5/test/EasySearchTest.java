package home_work_5.test;

import home_work_5.search.EasySearch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import home_work_5.api.ISearchEngine;

public class EasySearchTest {

    private final ISearchEngine searchEngine = new EasySearch();
    @Test
    public void testSearch() {
        String test1 = "привет, как дела!";
        String test2 = "привет,какдела!";
        String test3 = "привет;какдела!";
        String test4 = "как дела!.Что делаешь?";
        String test5 = "Привет-привет";
        String test6 = "Привет -привет";
        String test7 = "4-х";
        String test8 = "один и 1";
        String test9 = "бабушка бабушке бабушку";
        String test10 = "- Кошка  белая?  -  В  зеркало  заднего обзора  Питер  видел  тыльную\n" +
                "сторону  знака, того самого знака ограничения скорости, о котором говорила\n" +
                "Мэри,  но  ничего  больше. Когда они проезжали мимо, он смотрел  в  другую\n" +
                "десятку.  Правда,  он  вырос в Нью-Йорке, поэтому  бескрайние  просторы  и\n" +
                "Невады.\n" +
                "     - Нет, полосатая, - отозвалась Мэри. - А какая разница?\n" +
                "     - Я  подумал,  что  в пустыне чудят сатанисты. Мэриэл  говорила,  что\n" +
                "     - Впечатлительные,  -  поправила его Мэри.  -  Цитирую:  \"Центральная\n" +
                "Невада  полна  впечатлительных  людей\". И  Гэри  подтвердил  ее  слова.  А\n" +
                "поскольку  мы  никого  не встретили после того, как  пересекли  границу  с\n" +
                "Калифорнией...";
        String test11 = "Мама мыла раму";

        Assertions.assertEquals(1, searchEngine.search(test1, "как"));
        Assertions.assertEquals(0, searchEngine.search(test2, "как"));
        Assertions.assertEquals(1, searchEngine.search(test3, "привет"));
        Assertions.assertEquals(1, searchEngine.search(test4, "как"));
        Assertions.assertEquals(1, searchEngine.search(test5, "Привет-привет"));
        Assertions.assertEquals(1, searchEngine.search(test6, "привет"));
        Assertions.assertEquals(1, searchEngine.search(test7, "4-х"));
        Assertions.assertEquals(1, searchEngine.search(test8, "и"));
        Assertions.assertEquals(1, searchEngine.search(test9, "бабушка"));
        Assertions.assertEquals(0, searchEngine.search(test10, "мэри"));
        Assertions.assertEquals(3, searchEngine.search(test10, "Мэри"));
        Assertions.assertEquals(0, searchEngine.search(test11, "мыл"));
    }
}
