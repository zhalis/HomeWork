package home_work_5.api;

public interface ISearchEnginePunctuationNormalizer extends ISearchEngine {

    /**
     * Метод удаляет все символы в тексте
     *
     * @param text текс в котором нужно удалить все знаки пунктуации
     * @return текст без знаков пунктуации
     */
    String readTextWithoutPunctuationMarks(String text);
}
