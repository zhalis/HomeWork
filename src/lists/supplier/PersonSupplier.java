package lists.supplier;

import lists.entties.Person;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PersonSupplier implements Supplier<Person> {

    @Override
    public Person get() {
        return new Person(getRandomString(8), getRandomString((new Random().nextInt(5) + 5)));
    }

    private static String getRandomString(int sizePassword) {
        return Stream.generate(() -> new Random().nextInt(26) + 97)
                .limit(sizePassword)
                .map(integer -> (char) integer.intValue())
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
}
