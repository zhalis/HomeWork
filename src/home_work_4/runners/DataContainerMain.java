package home_work_4.runners;

import home_work_4.DataContainer;
import home_work_4.comparator.IntegerComparator;
import home_work_4.comparator.StringComparator;
import java.util.Arrays;
import java.util.Comparator;

public class DataContainerMain {

    public static void main(String[] args) {

        Comparator<Integer> integerComparator = new IntegerComparator();
        Comparator<String> stringComparator = new StringComparator();
        DataContainer<Integer> container = new DataContainer<>(new Integer[]{55, 7, 4, null, 1, null, 6, 12, 8, 9});
        DataContainer<String> stringDataContainer = new DataContainer<>(new String[]{"Ab", "a", "A", null, null, "b", "B", "AC", "c"});

        System.out.println("Задание 4:");
        System.out.println("Возвращает номер позиции в которую были вставлены данные: " + container.add(777));

        System.out.println("Задание 5:");
        System.out.println("Возвращает объект по номеру ячейки: " + container.get(3));

        System.out.println("Задание 6:");
        System.out.println("Возвращает поле data: " + container.getItems());

        System.out.println("Задание 7:");
        System.out.println("Удаляет элемент из нашего поля data по индексу : " + container.deleteIndex(2));

        System.out.println("Задание 8:");
        System.out.println("Удаляет элемент из нашего поля data: " + container.deleteItem(55));

        System.out.println("Задание 9:");
        System.out.println("Масcив до сортировки: " + container);
        container.sort(Comparator.naturalOrder());
        System.out.println("Массив после сортировки: " + container);

        System.out.println("Задание 10:");
        System.out.println(container.toString());

        System.out.println("Задание 11:");
        container = new DataContainer<>(new Integer[]{55, 7, 4, null, -1, null, 6, 12, 8, 9});
        stringDataContainer = new DataContainer<>(new String[]{"Ab", "a", "A", null, null, "b", "B", "AC", "c"});
        System.out.println("Массив до сортировки: " + Arrays.toString(container.getData()));
        DataContainer.sort(container);
        System.out.println("Массив после сортировки: " + Arrays.toString(container.getData()));
        System.out.println("Массив до сортировки: " + Arrays.toString(stringDataContainer.getData()));
        DataContainer.sort(stringDataContainer);
        System.out.println("Массив после сортировки: " + Arrays.toString(stringDataContainer.getData()));

        System.out.println("Задание 12:");
        container = new DataContainer<>(new Integer[]{55, 7, 4, null, -1, null, 6, 12, 8, 9});
        stringDataContainer = new DataContainer<>(new String[]{"Ab", "a", "A", null, null, "b", "B", "AC", "c"});
        System.out.println("Массив до сортировки: " + Arrays.toString(container.getData()));
        DataContainer.sort(container, integerComparator);
        System.out.println("Массив после сортировки: " + Arrays.toString(container.getData()));
        System.out.println("Массив до сортировки: " + Arrays.toString(stringDataContainer.getData()));
        DataContainer.sort(stringDataContainer, stringComparator);
        System.out.println("Массив после сортировки: " + Arrays.toString(stringDataContainer.getData()));
    }
}
