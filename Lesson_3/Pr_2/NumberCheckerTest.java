package Lesson_3.Pr_2;

import static org.junit.Assert.*;
import org.junit.Test;

public class NumberCheckerTest {

    @Test
    public void testNumberInInterval() {
        NumberChecker checker = new NumberChecker();
        assertTrue(checker.numberInInterval(30));
        assertTrue(checker.numberInInterval(99));
    }

    @Test
    public void testNumberBelowInterval() {
        NumberChecker checker = new NumberChecker();
        assertFalse(checker.numberInInterval(10));
        assertFalse(checker.numberInInterval(24));
    }

    @Test
    public void testNumberAboveInterval() {
        NumberChecker checker = new NumberChecker();
        assertFalse(checker.numberInInterval(101));
        assertFalse(checker.numberInInterval(200));
    }
}

