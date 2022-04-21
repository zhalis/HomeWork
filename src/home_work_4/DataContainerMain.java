package home_work_4;

import java.util.Comparator;

public class DataContainerMain {

    public static void main(String[] args) {

        DataContainer<Integer> container = new DataContainer<>(new Integer[]{55, 7, null, 1, 7, null, 8, 9});

        System.out.println("Возвращает номер позиции в которую были вставлены данные: " + container.add(777));
        System.out.println("Возвращает объект по номеру ячейки: " + container.get(6));
        System.out.println("Возвращает поле data: " + container.getItems());
        System.out.println("Удаляет элемент из нашего поля data по индексу : " + container.deleteIndex(2));
        System.out.println("Удаляет элемент из нашего поля data: " + container.deleteItem(55));
        System.out.println("Масив до сортировки: " + container);
        container.sort(Comparator.nullsFirst(Comparator.comparing(integer -> integer)));
        System.out.println("Массив после сортировки: " + container);
    }
}
