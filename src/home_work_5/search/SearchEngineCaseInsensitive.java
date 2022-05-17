package home_work_5.search;

import home_work_5.api.ISearchEngine;
import home_work_5.api.ISearchEngineCaseInsensitive;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchEngineCaseInsensitive implements ISearchEngineCaseInsensitive {
    private final ISearchEngine searchEngine;

    public SearchEngineCaseInsensitive(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }

    /**
     * Метод возвращает информации о количестве раз которое встречается слово в тексте
     *
     * @param text текст в котором ищем
     * @param word слово, который ищем в тексте
     * @return количество раз использования в тексте слова
     */
    @Override
    public long search(String text, String word) {
        return this.searchEngine.search(text, word);
    }

    /**
     * Метод ищет слова в тексте игнорируя регистр букв
     *
     * @param text текст в котором ищем слово
     * @param word слово которое ищем в тексте
     * @return сколько раз использовалось слово в тексте
     */
    @Override
    public long searchCaseInsensitive(String text, String word) {
        long counter = 0;
        String regex = "\\b" + word.toLowerCase() + "\\b";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text.toLowerCase());
        while (matcher.find()) {
            counter++;
        }
        return counter;
    }
}
