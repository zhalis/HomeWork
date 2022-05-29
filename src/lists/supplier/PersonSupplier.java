package lists.supplier;

import lists.entties.Person;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PersonSupplier implements Supplier<Person> {

    @Override
    public Person get() {
        return new Person(new NickSupplier().get(), getPassword((new Random().nextInt(5) + 5)));
    }

    private static String getPassword(int sizePassword) {
        Random random = new Random();
//        StringBuilder builder = new StringBuilder();
//        for (int i = 1; i <= sizePassword ; i++) {
//            char character = (char) (random.nextInt(26) + 97);
//            builder.append(character);
//        }
//        return builder.toString();

        return IntStream.generate(() -> random.nextInt(26) + 97)
                .limit(sizePassword)
                .map(integer -> (char) integer)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining());
    }
}
