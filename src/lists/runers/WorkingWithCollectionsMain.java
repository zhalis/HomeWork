package lists.runers;

import lists.collections.CollectionsUtils;
import lists.comparators.ComparatorNick;
import lists.comparators.ComparatorPersonPassword;
import lists.entties.Person;
import lists.supplier.PersonSupplier;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class WorkingWithCollectionsMain {

    public static void main(String[] args) {
        List<Person> personArrayList = new ArrayList<>();
        List<Person> personLinkedList = new LinkedList<>();
        Set<Person> personHashSetCollection = new HashSet<Person>();
        Set<Person> personTreeSetCollection = new TreeSet<>(new ComparatorPersonPassword().thenComparing(new ComparatorNick()));

        List<Collection<Person>> allCollections = List.of(personArrayList, personLinkedList,
                personHashSetCollection, personTreeSetCollection);
        List<List<Person>> sortableCollections = List.of(personArrayList, personLinkedList);

        allCollections.forEach(collection -> print("заполнение коллекции " + collection.getClass().getSimpleName(),
                timeOfFunctionExecution(WorkingWithCollectionsMain::fillInMillionElements, collection, new PersonSupplier())));

        System.out.println();
        sortableCollections.forEach(collection -> print("сортировка коллекции " + collection.getClass().getSimpleName() + " встроенными средствами jdk",
                timeOfFunctionExecution(collection::sort, Comparator.<Person, Integer>comparing(p -> p.getPassword().length()).thenComparing(Person::getNick))));

        System.out.println();
        sortableCollections.forEach(collection -> print("cортировка коллекции собственным методом " + collection.getClass().getSimpleName(),
                timeOfFunctionExecution(collection::sort, new ComparatorPersonPassword().thenComparing(new ComparatorNick()))));

        System.out.println();
        allCollections.forEach(collection -> print("итерирование коллекции " + collection.getClass().getSimpleName() + " при помощи iterator",
                timeOfFunctionExecution(CollectionsUtils::iterateByIterator, collection)));

        System.out.println();
        allCollections.forEach(collection -> print("итерирование коллекции " + collection.getClass().getSimpleName() + " при помощи foreach",
                timeOfFunctionExecution(CollectionsUtils::iterateByForeach, collection)));

        System.out.println();
        allCollections.forEach(collection -> print("удаление всех элементов из " + collection.getClass().getSimpleName(),
                timeOfFunctionExecution(CollectionsUtils::removeElement, collection)));
    }

    private static <T> long timeOfFunctionExecution(Consumer<T> function, T argument) {
        long startTime = System.currentTimeMillis();
        function.accept(argument);
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    private static <T> long timeOfFunctionExecution(BiConsumer<Collection<T>, Supplier<T>> function,
                                                    Collection<T> collection, Supplier<T> supplier) {
        long startTime = System.currentTimeMillis();
        function.accept(collection, supplier);
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    private static <T> void fillInMillionElements(Collection<T> targetCollection, Supplier<T> elementSupplier) {
        CollectionsUtils.fillInCollection(1_000_000, elementSupplier, targetCollection);
    }

    private static void print(String operationName, long millis) {
        System.out.println("Операция: " + operationName + " Заняла: " + millis + " мс");
    }
}
