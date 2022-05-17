package home_work_5.api;

public interface ISearchEngineCaseInsensitive extends ISearchEngine {

    /**
     * Метод ищет слова в тексте игнорируя регистр букв
     *
     * @param text текст в котором ищем слово
     * @param word слово которое ищем в тексте
     * @return сколько раз использовалось слово в тексте
     */
    long searchCaseInsensitive(String text, String word);
}
