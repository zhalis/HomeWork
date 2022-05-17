package home_work_5.api;

public interface ISearchEngine {

    /**
     * Метод возвращает информации о количестве раз которое встречается слово в тексте
     *
     * @param text текст в котором ищем
     * @param word слово, который ищем в тексте
     * @return количество раз использования в тексте слова
     */
    long search(String text, String word);
}
