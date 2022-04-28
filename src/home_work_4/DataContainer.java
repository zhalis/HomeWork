package home_work_4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

/**
 * Данный класс удаляет и добавляет данные в массив и сортирует данные в массиве
 *
 * @param <T> тип элементов массива
 */
public class DataContainer<T> implements Iterable<T> {

    private T[] data;

    public DataContainer(T[] data) {
        this.data = data;
    }

    public T[] getData() {
        return data;
    }

    /**
     * Метод записывает элемент в первую пустую ячейку массива, а если нет пустых ячеек создает новый массив с пустой
     * ячейкой в конце и записывает в пустую ячейку элемент
     *
     * @param item элемент который хотим записать в массив
     * @return номер ячейки в которую записали элемент
     */
    public int add(T item) {

        if (item == null) {
            return -1;
        }
        if (this.data.length == 0) {
            this.data = Arrays.copyOf(this.data, this.data.length + 1);
        }
        for (int i = 0; i < this.data.length; i++) {
            if (this.data[i] == null) {
                this.data[i] = item;
                return i;
            }
        }
        this.data = Arrays.copyOf(this.data, this.data.length + 1);
        this.data[this.data.length - 1] = item;

        return this.data.length - 1;
    }

    /**
     * Метод возвращает предварительно сохранённый объект который мы передали через метод add
     *
     * @param index номер ячейки в которую метод add записал данные
     * @return данные записанные методом add
     */
    public T get(int index) {
        if (index > this.data.length - 1) {
            return null;
        }
        return this.data[index];
    }

    /**
     * Метод возвращает поле data
     *
     * @return возвращает поле data
     */
    public T[] getItems() {
        return this.data;
    }

    /**
     * Метод удаляет ячейку с данными по номеру ячейки массива
     *
     * @param index номер ячейки массива который нужно удалить
     * @return если ячеку массива удалили true, если нет false
     */
    public boolean deleteIndex(int index) {
        boolean delete = false;

        if (index > this.data.length - 1) {
            return false;
        } else {
            for (int i = index; i < this.data.length - 1; i++) {
                this.data[i] = this.data[i + 1];
            }
            this.data = Arrays.copyOf(this.data, this.data.length - 1);
            delete = true;
        }
        return delete;
    }

    /**
     * Метод удаляет первую ячейку с данными по переданным данным
     *
     * @param item данные которые нужно удалить
     * @return если ячейку массива удалили true, если нет false
     */
    public boolean deleteItem(T item) {
        boolean delete = false;
        int index = 0;
        for (int i = 0; i < this.data.length - 1; i++) {
            if (this.data[i].equals(item)) {
                index = i;
                deleteIndex(index);
                delete = true;
                break;
            }
        }
        return delete;
    }

    /**
     * Метод занимается сортировкой данных записанных в поле data используя реализацию сравнения из
     * переданного объекта comparator, если в массиве есть nulls, они всегда перемещаются в конец мвссива
     *
     * @param comparator компаратор для сравнения объектов
     */
    public void sort(Comparator<T> comparator) {
        for (int j = this.data.length - 1; j > 0; j--) {
            for (int i = 0; i < j; i++) {
                if (this.data[i] == null && this.data[i + 1] != null
                        || this.data[i + 1] != null && comparator.compare(this.data[i], this.data[i + 1]) > 0) {
                    swapElements(this.data, i, i + 1);
                }
            }
        }
    }

    /**
     * Метод выводит содержимое data без ячеек в которых хранится null
     *
     * @return строку с содержимым ячеек массива без nulls
     */
    @Override
    public String toString() {
        return Arrays.toString(data)
                .replaceAll(", null", "")
                .replace("null, ", "");
    }

    /**
     * Метод сортирует элементы в переданном объекте DataContainer используя реализацию сравнения
     * вызываемый у хранимых объектов
     *
     * @param dataContainer объект элементы которого нужно отсортировать
     * @param <T>           тип данных который является Comparable
     */
    public static <T extends Comparable<T>> void sort(DataContainer<T> dataContainer) {
        T[] data = dataContainer.data;

        for (int j = data.length - 1; j > 0; j--) {
            for (int i = 0; i < j; i++) {
                if (isFirstElementGreater(data[i], data[i + 1])) {
                    swapElements(data, i, i + 1);
                }
            }
        }
    }

    /**
     * Метод сортирует элементы массива используя реализацию сравнения из переданного объекта интерфейса Comparator
     *
     * @param container  объект элементы которого нужно отсортировать
     * @param comparator объекта интерфейса Comparator с реализацией сравнения
     * @param <T>        обобщенный тип параметров container и comparator
     */
    public static <T> void sort(DataContainer<T> container, Comparator<T> comparator) {
        T[] data = container.data;
        for (int j = data.length - 1; j > 0; j--) {
            for (int i = 0; i < j; i++) {
                if (data[i] == null && data[i + 1] != null
                        || data[i + 1] != null && comparator.compare(data[i], data[i + 1]) > 0) {
                    swapElements(data, i, i + 1);
                }
            }
        }
    }

    /**
     * Метод проверяет условия для сортировки элементов массива с nulls методом compareTo
     *
     * @param firstElement  первый элемент массива
     * @param secondElement второй элемент массива
     * @param <T>           тип данных который является Comparable
     * @return true или false
     */
    private static <T extends Comparable<T>> boolean isFirstElementGreater(T firstElement, T secondElement) {
        return firstElement == null && secondElement != null
                || secondElement != null && firstElement.compareTo(secondElement) > 0;
    }

    /**
     * Метод меняет местами данные массива по их индексу
     *
     * @param data               массив в котором нужно произвести замену данных
     * @param firstElementIndex  индекс ячейки данные которой будут записаны данные ячейки secondElementIndex
     * @param secondElementIndex индекс ячейки данные которой будут записаны данные ячейки firstElementIndex
     * @param <T>                тип данных который является Comparable и Comparator
     */
    private static <T> void swapElements(T[] data, int firstElementIndex, int secondElementIndex) {
        T tmp = data[firstElementIndex];
        data[firstElementIndex] = data[secondElementIndex];
        data[secondElementIndex] = tmp;
    }

    /**
     * Метод генерирует класс DataContainerIterator() и возвращает его
     *
     * @return возвращает класс DataContainerIterator()
     */
    @Override
    public Iterator<T> iterator() {
        return new DataContainerIterator();
    }

    /**
     * внутренний класс с реализацией интерфейса Iterator для итерирования элементов типа T
     */
    class DataContainerIterator implements Iterator<T> {

        private int current;

        /**
         * Метод проверяет есть ли следующая ячейка в DataContainer
         *
         * @return true или false
         */
        @Override
        public boolean hasNext() {
            return current < data.length;
        }

        /**
         * Метод возвращает данные ячейки
         *
         * @return данные ячейки
         */
        @Override
        public T next() {
            return data[current++];
        }
    }
}
