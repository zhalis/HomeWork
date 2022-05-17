package home_work_5.search;

import home_work_5.api.ISearchEngine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {

    /**
     * Метод возвращает информации о количестве раз которое встречается слово в тексте
     *
     * @param text текст в котором ищем
     * @param word слово, который ищем в тексте
     * @return количество раз использования в тексте слова
     */
    @Override
    public long search(String text, String word) {
        long counter = 0;
        String regex = "\\b" + word + "\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            counter++;
        }
        return counter;
    }
}
