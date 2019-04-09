package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author leon on 18/12/2018.
 */
public class Group<T> implements GroupInterface<T> {
    List<T> someType = new ArrayList<>();

    public Group() {

    }

    public Integer count() {
        return someType.size();
    }

    public void insert(T value) {
        someType.add(value);
    }

    public Boolean has(T value) {
        return someType.contains(value);
    }

    public T fetch(int indexOfValue) {
        return someType.get(indexOfValue);
    }

    public void delete(T value) {
        someType.remove(value);
    }

    public void clear() {
        someType.clear();
    }

    public Iterator<T> iterator() {
        return someType.iterator();
    }


    @Override
    public String toString() {
        return someType.toString();


    }
}
