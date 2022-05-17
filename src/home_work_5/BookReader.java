package home_work_5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class BookReader {

    private final Path pathToFile;
    public BookReader(Path pathToFile) {
        this.pathToFile = pathToFile;
    }

    /**
     * Метод читает файл построчно
     *
     * @return прочитанный текст в строке
     */
    public String readFile() {
        File file = pathToFile.toFile();
        StringBuilder bookBuilder = new StringBuilder();
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader(file)))) {
            while (scanner.hasNextLine()) {
                bookBuilder.append(scanner.nextLine());
            }
        } catch (FileNotFoundException exception) {
            throw new RuntimeException(exception);
        }
        return bookBuilder.toString();
    }

    /**
     * Метод убирает все знаки пунктуации
     *
     * @return возвращает отформатированный текс
     */
    public String readTextWithoutPunctuationMarks() {
        String str = readFile();
        return str.replaceAll("[,<+>=*/.?:;!()'\"]|(\\s-)|(-\\s)|(--)", " ").replaceAll("\\s+", " ");
    }

    /**
     * Метод делит строку на строки по пробелу и кладет их в List<String>
     *
     * @return лист слов используемых в тексте
     */
    private List<String> getAllWords() {
        String editedText = readTextWithoutPunctuationMarks();
        String[] words = editedText.split(" ");
        return Arrays.asList(words);
    }

    /**
     * Метод из всех слов возвращает только уникальные слова
     *
     * @return коллекцию уникальных слов
     */
    public Set<String> getAllUsedWords() {
        return new HashSet<>(getAllWords());
    }

    /**
     * Метод находит все уникальные слова и количество их использования в тексте
     *
     * @return коллекцию слов и количество их использования
     */
    private Map<String, Integer> numberOfTimesWordsAreUsed() {

        Map<String, Integer> numberOfTimesWordsIsUsed = new HashMap<>();
        List<String> allWords = getAllWords();
        for (String word : allWords) {
            numberOfTimesWordsIsUsed.compute(word, this::getTargetValue);
        }
        return numberOfTimesWordsIsUsed;
    }

    /**
     * Метод считает текущее количество слов после того, как оно положено в map
     *
     * @param key   слово
     * @param value количество слов, если такой key есть в map, или null, если нет
     * @return новое значение количества слов
     */
    private Integer getTargetValue(String key, Integer value) {
        return value == null ? 1 : value + 1;
    }

    /**
     * Метод возвращает заданное количество наиболее часто встречающихся слов
     *
     * @param limit количество слов
     * @return лист слов с количеством их в тексте
     */
    public List<Map.Entry<String, Integer>> getNumberOfTimesWordsAreUsed(int limit) {
        List<Map.Entry<String, Integer>> wordWithAmountEntries = new ArrayList<>(numberOfTimesWordsAreUsed().entrySet());
        Comparator<Map.Entry<String, Integer>> entryComparator = Map.Entry.comparingByValue();
        wordWithAmountEntries.sort(entryComparator.reversed());
        return wordWithAmountEntries
                .stream()
                .limit(limit)
                .collect(Collectors.toList());
    }
}
