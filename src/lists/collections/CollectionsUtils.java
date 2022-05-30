package lists.collections;

import java.util.Collection;
import java.util.Iterator;
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

    public static <T> void iterateByIterator(Collection<T> collection) {
        Iterator<T> iterator = collection.iterator();
        while (iterator.hasNext()) {
            iterator.next();
        }
    }

    public static <T> void iterateByForeach(Collection<T> collection) {
        collection.stream()
                .forEach(person -> {
                });
    }

    public static <T> void removeElement(Collection<T> collection) {
        Iterator<T> iterator = collection.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
    }
}
