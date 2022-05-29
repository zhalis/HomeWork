package lists.comparators;

import lists.api.INickname;

import java.util.Comparator;

public class ComparatorNick implements Comparator<INickname> {

    @Override
    public int compare(INickname o1, INickname o2) {
        return o1.getNick().compareTo(o2.getNick());
    }
}
