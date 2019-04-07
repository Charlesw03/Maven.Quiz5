package rocks.zipcode.io.quiz4.objectorientation.palindromeobject;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.quiz4.fundamentals.PalindromeEvaluator;
import rocks.zipcode.io.quiz4.objectorientation.PalindromeObject;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeObjectIsPalindromeTestNegative {
    @Test
    public void test1() {
        test("Racecarx");
    }

    @Test
    public void test2() {
        test("Redderx");
    }

    @Test
    public void test3() {
        test("Redrumxmurder");
    }

    public void test(String input) {
        Assert.assertFalse(new PalindromeObject(input).isPalindrome());
    }
}
