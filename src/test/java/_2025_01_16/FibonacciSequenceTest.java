package _2025_01_16;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FibonacciSequenceTest {

    @Test
    void testConstructorWithNegativeLength() {
        assertThrows(IllegalArgumentException.class, () -> new FibonacciSequence(-1));
    }

    @Test
    void testGenerateWithForLoop() {
        FibonacciSequence fibSeq = new FibonacciSequence(6);
        int[] expected = {0, 1, 1, 2, 3, 5};
        int[] result = fibSeq.findFibonacciFor();
        assertArrayEquals(expected, result);
    }

    @Test
    void testGenerateWithWhileLoop() {
        FibonacciSequence fibSeq = new FibonacciSequence(6);
        int[] expected = {0, 1, 1, 2, 3, 5};
        int[] result = fibSeq.findFibonacciWhile();
        assertArrayEquals(expected, result);
    }

    @Test
    void testGenerateWithDoWhileLoop() {
        FibonacciSequence fibSeq = new FibonacciSequence(6);
        int[] expected = {0, 1, 1, 2, 3, 5};
        int[] result = fibSeq.findFibonacciDoWhile();
        assertArrayEquals(expected, result);
    }

    @Test
    void testGenerateEmptySequence() {
        FibonacciSequence fibSeq = new FibonacciSequence(0);
        int[] expected = {};
        int[] result = fibSeq.findFibonacciFor();
        assertArrayEquals(expected, result);
    }

    @Test
    void testGenerateSingleElementSequence() {
        FibonacciSequence fibSeq = new FibonacciSequence(1);
        int[] expected = {0};
        int[] result = fibSeq.findFibonacciWhile();
        assertArrayEquals(expected, result);
    }
}


