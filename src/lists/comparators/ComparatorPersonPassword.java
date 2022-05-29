package lists.comparators;

import lists.entties.Person;

import java.util.Comparator;

public class ComparatorPersonPassword implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return Integer.compare(o1.getPassword().length(), o2.getPassword().length());
    }
}
