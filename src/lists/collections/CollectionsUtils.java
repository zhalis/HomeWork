package lists.collections;

import java.util.Collection;
import java.util.function.Supplier;
import java.util.stream.Stream;

public final class CollectionsUtils {

    private CollectionsUtils() {
    }

    public static <T> void fillInCollection(int amount, Supplier<T> supplier, Collection<T> collection) {
        Stream.generate(supplier)
                .limit(amount)
                .forEach(collection::add);
    }
}
