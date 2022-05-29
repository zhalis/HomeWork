package lists.supplier;

import java.util.Random;
import java.util.function.Supplier;

public class NickSupplier implements Supplier<String> {

    private final String[] names = {"Геннадий", "Павел", "Валерий", "Татьяна", "Виталий", "Евгений", "Снежана", "Роман",
            "Кристина", "Иван", "Алина", "Эдита", "Станислав", "Лилия", "Людмила", "Руслан", "Яна", "Мария", "Анна", "Олег"};

    @Override
    public String get() {
        return names[new Random().nextInt(this.names.length)];
    }
}
