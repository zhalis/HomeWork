package home_work_5.search;

import home_work_5.BookReader;
import home_work_5.api.ISearchEngine;
import home_work_5.api.ISearchEngineCaseInsensitive;

import java.nio.file.Path;

public class SearchEngineMain {

    public static void main(String[] args) {
        Path path = Path.of("HomeWork", "src", "home_work_5", "book", "Война и мир_книга.txt");
        BookReader bookReader = new BookReader(path);
        String text = bookReader.readFile();

        System.out.println("EasySearch");
        ISearchEngine easySearch = new EasySearch();
        System.out.println("Война" + easySearch.search(text, "Война"));
        System.out.println("война" + easySearch.search(text, "война"));
        System.out.println("И" + easySearch.search(text, "И"));
        System.out.println("и" + easySearch.search(text, "и"));
        System.out.println("Мир" + easySearch.search(text, "Мир"));
        System.out.println("мир" + easySearch.search(text, "мир"));

        System.out.println("RegExSearch");
        ISearchEngine rexExSearch = new RegExSearch();
        System.out.println("Война" + rexExSearch.search(text, "Война"));
        System.out.println("война" + rexExSearch.search(text, "война"));
        System.out.println("И" + rexExSearch.search(text, "И"));
        System.out.println("и" + rexExSearch.search(text, "и"));
        System.out.println("Мир" + rexExSearch.search(text, "Мир"));
        System.out.println("мир" + rexExSearch.search(text, "мир"));

        System.out.println("SearchEngineCaseInsensitive");
        ISearchEngineCaseInsensitive searchEngineCaseInsensitive = new SearchEngineCaseInsensitive(new RegExSearch());
        System.out.println("Война" + searchEngineCaseInsensitive.searchCaseInsensitive(text, "Война"));
        System.out.println("война" + searchEngineCaseInsensitive.searchCaseInsensitive(text, "война"));
        System.out.println("И" + searchEngineCaseInsensitive.searchCaseInsensitive(text, "И"));
        System.out.println("и" + searchEngineCaseInsensitive.searchCaseInsensitive(text, "и"));
        System.out.println("Мир" + searchEngineCaseInsensitive.searchCaseInsensitive(text, "Мир"));
        System.out.println("мир" + searchEngineCaseInsensitive.searchCaseInsensitive(text, "мир"));
    }
}
