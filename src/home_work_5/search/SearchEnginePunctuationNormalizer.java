package home_work_5.search;

import home_work_5.api.ISearchEngine;
import home_work_5.api.ISearchEnginePunctuationNormalizer;

public class SearchEnginePunctuationNormalizer implements ISearchEnginePunctuationNormalizer {

    private ISearchEngine searchEngine;

    public SearchEnginePunctuationNormalizer(ISearchEngine searchEngine) {
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
        return searchEngine.search(text, word);
    }

    /**
     * Метод удаляет все символы в тексте
     *
     * @param text текс в котором нужно удалить все знаки пунктуации
     * @return текст без знаков пунктуации
     */
    @Override
    public String readTextWithoutPunctuationMarks(String text) {
        return text.replaceAll("[,<+>=*/.?:;!()'\"]|(\\s-)|(-\\s)|(--)", " ").replaceAll("\\s+", " ");
    }
}
