package home_work_5.test;

import home_work_5.api.ISearchEngine;
import home_work_5.search.RegExSearch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RegExSearchTest {

    private final ISearchEngine searchEngine = new RegExSearch();

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
        Assertions.assertEquals(1, searchEngine.search(test1, "как"));
        Assertions.assertEquals(0, searchEngine.search(test2, "как"));
        Assertions.assertEquals(1, searchEngine.search(test3, "привет"));
        Assertions.assertEquals(1, searchEngine.search(test4, "как"));
        Assertions.assertEquals(1, searchEngine.search(test5, "Привет-привет"));
        Assertions.assertEquals(1, searchEngine.search(test6, "привет"));
        Assertions.assertEquals(1, searchEngine.search(test7, "4-х"));
        Assertions.assertEquals(1, searchEngine.search(test8, "и"));
        Assertions.assertEquals(1, searchEngine.search(test9, "бабушка"));
        Assertions.assertEquals(0, searchEngine.search(test10, "мыл"));
    }
}
