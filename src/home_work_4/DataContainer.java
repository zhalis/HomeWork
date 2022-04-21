package home_work_4;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Данный класс удаляет и добавляет данные в массив и сортирует данные в массиве
 *
 * @param <T> тип элементов массива
 */
public class DataContainer<T> {

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
     * @return если ячеку массива удалили true, если нет false
     */
    public boolean deleteItem(T item) {
        boolean delete = false;
        int b = 0;
        for (int i = 0; i < this.data.length - 1; i++) {
            if (this.data[i].equals(item)) {
                this.data[i] = null;
                b = i;
                delete = true;
                break;
            }
        }
        for (int j = b; j < this.data.length - 1; j++) {
            this.data[j] = this.data[j + 1];
        }
        this.data = Arrays.copyOf(this.data, this.data.length - 1);

        return delete;
    }

    /**
     * Метод занимается сортировкой данных записанных в поле data используя реализацию сравнения из
     * переданного объекта comparator
     *
     * @param comparator компаратор для сравнения объектов
     */
    public void sort(Comparator<T> comparator) {
        int i = 0;
        while (i < this.data.length - 1) {
            if (comparator.compare(this.data[i], this.data[i + 1]) > 0) {
                T tmp = this.data[i];
                this.data[i] = this.data[i + 1];
                this.data[i + 1] = tmp;
                i = 0;
            } else {
                i++;
            }
        }
    }

    /**
     * Метод выводит содержимое data без ячеек в которых хранится null
     *
     * @return строку с содержимым ячеек массива без nulls
     */
    public String toString() {
        return Arrays.toString(data)
                .replaceAll(", null", "")
                .replace("null, ", "");
    }
}
