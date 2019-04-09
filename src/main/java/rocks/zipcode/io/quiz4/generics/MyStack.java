package rocks.zipcode.io.quiz4.generics;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.Stack;

/**
 * @author leon on 11/12/2018.
 */
public class MyStack<SomeType> implements Iterable<SomeType> {
    Stack<SomeType> something = new Stack<>();

    public MyStack() {

    }

    public Boolean isEmpty() {

        return something.isEmpty();
    }

    public void push(SomeType i) {
        something.push(i);
    }

    public SomeType peek() {
        if (something.isEmpty()) {
            return null;
        } else {
            return something.peek();
        }
    }

    public SomeType pop() {
        return something.pop();
    }

    @Override
    public Iterator<SomeType> iterator() {
        return something.iterator();
    }


}
