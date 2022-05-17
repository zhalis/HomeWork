package home_work_5.search;

import home_work_5.api.ISearchEngine;

public class EasySearch implements ISearchEngine {

    /**
     * Метод ищет количество использований слова в данном тексте
     *
     * @param text текст в котором ищем слово "word"
     * @param word слово, которое ищем в тексте
     * @return количество использований данного слова в тексте
     */
    @Override
    public long search(String text, String word) {
        int index = 0;
        long counter = 0;

        while (index != -1) {
            index = text.indexOf(word, index);

            if (index != -1) {

                if ((isNotWordSymbol(geNextCharAfterWord(index, text, word.length()))
                        || geNextCharAfterWord(index, text, word.length()) == 0)
                        && ((isNotWordSymbol(getICharBeforeWord(index, text))
                        || getICharBeforeWord(index, text) == 0))) {
                    counter++;
                }
                index += word.length() + 1;
            }
        }
        return counter;
    }

    /**
     * Метод проверяет, не является ли символ цифрой или буквой
     *
     * @param wordSeparatingCharacter символ, который проверяем
     * @return true - если не является, false если является цифрой или буквой
     */
    private boolean isNotWordSymbol(char wordSeparatingCharacter) {
        return !Character.isLetterOrDigit(wordSeparatingCharacter);
    }

    /**
     * Метод возвращает символ находящийся после слова в строке
     *
     * @param index      индекс начала слова в строке
     * @param text       строка в которой ищем символ по индексу
     * @param wordLength длинна слова
     * @return символ
     */
    private char geNextCharAfterWord(int index, String text, int wordLength) {
        if (index + wordLength >= text.length() - 1) {
            return 0;
        }
        return text.charAt(index + wordLength);
    }

    /**
     * Метод возвращает символ стоящий перед словом
     *
     * @param index индекс начала слова в строке
     * @param text  строка в которой ищем символ по индексу
     * @return символ
     */
    private char getICharBeforeWord(int index, String text) {
        if (index != 0) {
            return text.charAt(index - 1);
        }
        return 0;
    }
}
