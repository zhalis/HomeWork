package home_work_5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.nio.file.StandardOpenOption.APPEND;

public class FileReadMain {

    public static void main(String[] args) throws IOException {
        boolean isTheEnd = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите адрес папки: ");
        String path = scanner.nextLine();
        System.out.println(Arrays.toString(showListBooks(path)));
        System.out.println("Выберите книгу и введите ее название:");
        String nameBook = scanner.nextLine();
        String newPath = path;
        newPath = newPath.concat("\\").concat(nameBook);
        System.out.println(newPath);
        String text = readTextWithoutPunctuationMarks(newPath);
        System.out.println("Введите слово, количество использований которого хотите узнать:");
        String word = scanner.nextLine();
        System.out.println(word + " - " + search(text, word));

        while (!isTheEnd) {

            while (true) {
                System.out.println("Хотите выбрать другую книгу? если ДА введите ДА, если НЕТ введите НЕТ");
                String continueSearchBook = scanner.nextLine();
                if (continueSearchBook.equalsIgnoreCase("ДА")) {
                    System.out.println(Arrays.toString(showListBooks(path)));
                    System.out.println("Выберите книгу и введите ее название:");
                    nameBook = scanner.nextLine();
                    newPath = path;
                    newPath = newPath.concat("\\").concat(nameBook);
                    text = readTextWithoutPunctuationMarks(newPath);
                    break;
                } else if (continueSearchBook.equalsIgnoreCase("НЕТ")) {
                    System.out.println("Введите слово, количество использований которого хотите узнать:");
                    word = scanner.nextLine();
                    System.out.println(word + " - " + search(text, word));
                    saveResult(nameBook, word, search(text, word));
                    break;
                } else {
                    System.out.println("Вы ввели не верные данные");
                }
            }

            while (true) {
                System.out.println("Вы хотите закончить? если ДА введите ДА если НЕТ введите НЕТ");
                String end = scanner.nextLine();
                if (end.equalsIgnoreCase("ДА")) {
                    isTheEnd = true;
                    break;
                } else if (end.equalsIgnoreCase("НЕТ")) {
                    break;
                } else {
                    System.out.println("Вы ввели не верные данные");
                }
            }
        }
    }

    /**
     * Метод читает файл построчно
     *
     * @return прочитанный текст в строке
     */
    public static String readFile(String path) {
        File file = new File(path);
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
    public static String readTextWithoutPunctuationMarks(String path) {
        String str = readFile(path);
        return str.replaceAll("[,<+>=*/.?:;!()'\"]|(\\s-)|(-\\s)|(--)", " ").replaceAll("\\s+", " ");
    }

    /**
     * Метод слаживает все названия файлов директории лист строк
     *
     * @param path путь к директории
     * @return лист строк
     */
    public static String[] showListBooks(String path) {
        File file = new File(path);
        return file.list();
    }

    /**
     * Метод сохраняет строку из входных параметров в файл
     *
     * @param nameFile данные которые нужно сохранить (книга)
     * @param word     данные которые нужно сохранить (слово из книги)
     * @param count    данные которые нужно сохранить (сколько раз использовалось это слово в книге)
     */
    public static void saveResult(String nameFile, String word, Long count) {
        String save = nameFile + " - " + word + " - " + count;
        Path path = Path.of("HomeWork", "src", "home_work_5", "book", "result.txt");
        try {
            Files.write(path, Collections.singleton(save), StandardCharsets.UTF_8, APPEND);
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }

    }

    /**
     * Метод ищет сколько раз использовалось в тексте
     *
     * @param text текст в котором ищем
     * @param word слово которое ищем
     * @return возвращает сколько раз использовалось слово в тексте
     */
    public static long search(String text, String word) {
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
