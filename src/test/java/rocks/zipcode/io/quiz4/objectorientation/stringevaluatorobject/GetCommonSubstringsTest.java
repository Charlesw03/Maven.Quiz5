package rocks.zipcode.io.quiz4.objectorientation.stringevaluatorobject;

import org.junit.Test;
import rocks.zipcode.io.quiz4.objectorientation.StringEvaluatorObject;
import rocks.zipcode.io.quiz4.utils.TestUtils;

/**
 * @author leon on 11/12/2018.
 */
public class GetCommonSubstringsTest {
    @Test
    public void test1() {
        // given
        String firstInput = "XXB";
        String secondInput = "XXXB";
        String[] expected = {"X", "XX", "XXB", "XB", "B"};
        test(firstInput, secondInput, expected);
    }

    @Test
    public void test2() {
        // given
        String firstInput = "AAXB";
        String secondInput = "AAAB";
        String[] expected = {"A", "AA", "B"};
        test(firstInput, secondInput, expected);
    }


    @Test
    public void test3() {
        // given
        String firstInput = "Xapple";
        String secondInput = "Candy apples!";
        String[] expected = {"a", "ap", "app", "appl", "apple", "e", "l", "le", "p", "pl", "ple", "pp", "ppl", "pple"};
        test(firstInput, secondInput, expected);
    }


    @Test
    public void tes4() {
        // given
        String firstInput = "Xrreducible complexity";
        String secondInput = "Deductive operations";
        String[] expected = {" ", "c", "d", "du", "duc", "e", "e ", "ed", "edu", "educ", "i", "o", "p", "r", "t", "u", "uc"};
        test(firstInput, secondInput, expected);
    }

    @Test
    public void test5() {
        // given
        String firstInput = "Xeter piper picked a pepper";
        String secondInput = "Jimmy neutron was a fancy scientist";
        String[] expected = {" ", " a", " a ", "a", "a ", "c", "e", "i", "r", "t"};
        test(firstInput, secondInput, expected);
    }

    private void test(String firstInput, String secondInput, String[] expected) {
        // when
        String[] actual = new StringEvaluatorObject(firstInput).getCommonSubstrings(secondInput);

        // then
        TestUtils.assertArrayEquals(expected, actual);
    }

}
