package home_work_5.test;

import home_work_5.api.ISearchEngineCaseInsensitive;
import home_work_5.search.RegExSearch;
import home_work_5.search.SearchEngineCaseInsensitive;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchEngineCaseInsensitiveTest {

    private ISearchEngineCaseInsensitive search = new SearchEngineCaseInsensitive(new RegExSearch());

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
        String test11 = "И и И и И ИИИииИиИии";
        Assertions.assertEquals(1, search.searchCaseInsensitive(test1, "КАК"));
        Assertions.assertEquals(1, search.searchCaseInsensitive(test2, "Привет"));
        Assertions.assertEquals(1, search.searchCaseInsensitive(test3, "привет"));
        Assertions.assertEquals(1, search.searchCaseInsensitive(test4, "как"));
        Assertions.assertEquals(1, search.searchCaseInsensitive(test5, "Привет-привет"));
        Assertions.assertEquals(2, search.searchCaseInsensitive(test6, "привет"));
        Assertions.assertEquals(1, search.searchCaseInsensitive(test7, "4-х"));
        Assertions.assertEquals(1, search.searchCaseInsensitive(test8, "и"));
        Assertions.assertEquals(1, search.searchCaseInsensitive(test9, "бабушка"));
        Assertions.assertEquals(0, search.searchCaseInsensitive(test10, "мыл"));
        Assertions.assertEquals(1, search.searchCaseInsensitive(test10, "мама"));
        Assertions.assertEquals(5, search.searchCaseInsensitive(test11, "и"));
    }
}
