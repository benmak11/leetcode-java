package problemset.a3005;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountElementsWithMaximumFrequencyTest {

    private CountElementsWithMaximumFrequency max;

    private int[] numTestCaseOne;
    private int[] numTestCaseTwo;

    @BeforeEach
    void setUp() {
        max = new CountElementsWithMaximumFrequency();

        numTestCaseOne = new int[] {1, 2, 2, 3, 1, 4};
        numTestCaseTwo = new int[] {1, 2, 3, 4, 5};
    }

    @Test
    void testcaseOne_maxFrequencyElements() {
        int result = max.maxFrequencyElements(numTestCaseOne);
        assertEquals(4, result);
    }

    @Test
    void testcaseTwo_maxFrequencyElements() {
        int result = max.maxFrequencyElements(numTestCaseTwo);
        assertEquals(5, result);
    }
}