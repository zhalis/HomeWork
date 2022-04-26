package home_work_4.comparator;

import java.util.Comparator;

/**
 * класс с реализацией интерфейса Comparator для Integer
 */
public class IntegerComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o1.compareTo(o2);
    }
}
