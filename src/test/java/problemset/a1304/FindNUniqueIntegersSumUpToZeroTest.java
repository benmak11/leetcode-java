package problemset.a1304;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FindNUniqueIntegersSumUpToZeroTest {

    private FindNUniqueIntegersSumUpToZero findNUniqueIntegersSumUpToZero;

    private int testCaseOne;
    private int testCaseTwo;
    private int testCaseThree;

    @BeforeEach
    void setUp() {
        findNUniqueIntegersSumUpToZero = new FindNUniqueIntegersSumUpToZero();

        testCaseOne = 5;
        testCaseTwo = 3;
        testCaseThree = 1;
    }

    @Test
    void testCaseOne_sumZero() {
        int[] expected = {1, -1, 2, -2, 0};
        int[] actual = findNUniqueIntegersSumUpToZero.sumZero(testCaseOne);
        int truthCount = 0;
        for (int num : actual) {
            if (Arrays.stream(expected).anyMatch(x -> x == num))
                truthCount++;
        }
        assertEquals(expected.length, truthCount);
    }

    @Test
    void testCaseTwo_sumZero() {
        int[] expected = {-1, 0, 1};
        int[] actual = findNUniqueIntegersSumUpToZero.sumZero(testCaseTwo);
        int truthCount = 0;
        for (int num : actual) {
            if (Arrays.stream(expected).anyMatch(x -> x == num))
                truthCount++;
        }
        assertEquals(expected.length, truthCount);
    }

    @Test
    void testCaseThree_sumZero() {
        int[] expected = {0};
        int[] actual = findNUniqueIntegersSumUpToZero.sumZero(testCaseThree);
        int truthCount = 0;
        for (int num : actual) {
            if (Arrays.stream(expected).anyMatch(x -> x == num))
                truthCount++;
        }
        assertEquals(expected.length, truthCount);
    }
}
