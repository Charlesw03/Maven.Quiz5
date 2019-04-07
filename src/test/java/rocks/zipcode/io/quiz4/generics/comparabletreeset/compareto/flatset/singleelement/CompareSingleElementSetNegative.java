package rocks.zipcode.io.quiz4.generics.comparabletreeset.compareto.flatset.singleelement;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.quiz4.generics.ComparableTreeSet;

/**
 * @author leon on 11/12/2018.
 */
public class CompareSingleElementSetNegative {
    @Test
    public void test1() {
        // given
        ComparableTreeSet<String> a = new ComparableTreeSet<>("ax");
        ComparableTreeSet<String> b = new ComparableTreeSet<>("bx");

        // when
        Integer actual = a.compareTo(b);

        // then
        Assert.assertTrue(actual < 0);
    }

    @Test
    public void test2() {
        // given
        ComparableTreeSet<String> a = new ComparableTreeSet<>("ax");
        ComparableTreeSet<String> c = new ComparableTreeSet<>("cx");

        // when
        Integer actual = a.compareTo(c);

        // then
        Assert.assertTrue(actual < 0);
    }

    @Test
    public void test3() {
        // given
        ComparableTreeSet<String> a = new ComparableTreeSet<>("ax");
        ComparableTreeSet<String> d = new ComparableTreeSet<>("dx");

        // when
        Integer actual = a.compareTo(d);

        // then
        Assert.assertTrue(actual < 0);
    }
}
