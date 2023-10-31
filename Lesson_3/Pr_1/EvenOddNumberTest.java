package Lesson_3.Pr_1;


import static org.junit.Assert.*;
import org.junit.Test;

public class EvenOddNumberTest {

    @Test
    public void testEvenNumber() {
        evenOddNumber checker = new evenOddNumber();
        assertTrue(checker.evenOddNumber(2));
        assertTrue(checker.evenOddNumber(4));
        assertTrue(checker.evenOddNumber(0));
        assertTrue(checker.evenOddNumber(-6));
    }

    @Test
    public void testOddNumber() {
        evenOddNumber checker = new evenOddNumber();
        assertFalse(checker.evenOddNumber(1));
        assertFalse(checker.evenOddNumber(3));
        assertFalse(checker.evenOddNumber(7));
        assertFalse(checker.evenOddNumber(-5));
    }

    @Test
    public void testZero() {
        evenOddNumber checker = new evenOddNumber();
        assertTrue(checker.evenOddNumber(0));
    }

    @Test
    public void testNegativeNumber() {
        evenOddNumber checker = new evenOddNumber();
        assertTrue(checker.evenOddNumber(-2));
        assertFalse(checker.evenOddNumber(-3));
    }
}

