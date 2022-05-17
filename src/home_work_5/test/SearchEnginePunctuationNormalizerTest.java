package home_work_5.test;

import home_work_5.api.ISearchEnginePunctuationNormalizer;
import home_work_5.search.RegExSearch;
import home_work_5.search.SearchEnginePunctuationNormalizer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchEnginePunctuationNormalizerTest {

    ISearchEnginePunctuationNormalizer search = new SearchEnginePunctuationNormalizer(new RegExSearch());

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
        String test10 = "Мама мыла раму";
        Assertions.assertEquals(1, search.search(test1, "как"));
        Assertions.assertEquals(0, search.search(test2, "как"));
        Assertions.assertEquals(1, search.search(test3, "привет"));
        Assertions.assertEquals(1, search.search(test4, "как"));
        Assertions.assertEquals(1, search.search(test5, "Привет-привет"));
        Assertions.assertEquals(1, search.search(test6, "привет"));
        Assertions.assertEquals(1, search.search(test7, "4-х"));
        Assertions.assertEquals(1, search.search(test8, "и"));
        Assertions.assertEquals(1, search.search(test9, "бабушка"));
        Assertions.assertEquals(0, search.search(test10, "мэри"));
        Assertions.assertEquals(0, search.search(test10, "мыл"));
    }

    @Test
    public void testReadTextWithoutPunctuationMarks() {
        String test1 = "привет, как дела!";
        String expectedTest1 = "привет как дела ";
        String test2 = "привет,какдела!";
        String expectedTest2 = "привет какдела ";
        String test3 = "привет;какдела!";
        String expectedTest3 = "привет какдела ";
        String test4 = "как дела!.Что делаешь?";
        String expectedTest4 = "как дела Что делаешь ";
        String test5 = "Привет-привет";
        String expectedTest5 = "Привет-привет";
        String test6 = "Привет -привет";
        String expectedTest6 = "Привет привет";
        String test7 = "4-х";
        String expectedTest7 = "4-х";
        String test8 = "один и 1";
        String expectedTest8 = "один и 1";
        String test9 = "бабушка бабушке бабушку";
        String expectedTest9 = "бабушка бабушке бабушку";
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
        String expectedTest10 =" Кошка  белая    В  зеркало  заднего обзора  Питер  видел  тыльную\n" +
                "сторону  знака того самого знака ограничения скорости о котором говорила\n" +
                "Мэри  но  ничего  больше Когда они проезжали мимо он смотрел  в  другую\n" +
                "десятку  Правда  он  вырос в Нью-Йорке поэтому  бескрайние  просторы  и\n" +
                "Невады\n" +
                "      Нет полосатая  отозвалась Мэри  А какая разница?\n" +
                "      Я  подумал  что  в пустыне чудят сатанисты Мэриэл  говорила  что\n" +
                "      Впечатлительные    поправила его Мэри    Цитирую  Центральная\n" +
                "Невада  полна  впечатлительных  людей И  Гэри  подтвердил  ее  слова.  А\n" +
                "поскольку  мы  никого  не встретили после того как  пересекли  границу  с\n" +
                "Калифорнией";
        Assertions.assertEquals(expectedTest1, search.readTextWithoutPunctuationMarks(test1));
        Assertions.assertEquals(expectedTest2, search.readTextWithoutPunctuationMarks(test2));
        Assertions.assertEquals(expectedTest3, search.readTextWithoutPunctuationMarks(test3));
        Assertions.assertEquals(expectedTest4, search.readTextWithoutPunctuationMarks(test4));
        Assertions.assertEquals(expectedTest5, search.readTextWithoutPunctuationMarks(test5));
        Assertions.assertEquals(expectedTest6, search.readTextWithoutPunctuationMarks(test6));
        Assertions.assertEquals(expectedTest7, search.readTextWithoutPunctuationMarks(test7));
        Assertions.assertEquals(expectedTest8, search.readTextWithoutPunctuationMarks(test8));
        Assertions.assertEquals(expectedTest9, search.readTextWithoutPunctuationMarks(test9));
        Assertions.assertEquals(expectedTest3, search.readTextWithoutPunctuationMarks(test3));

    }
}
