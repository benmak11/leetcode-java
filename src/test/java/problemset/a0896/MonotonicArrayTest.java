package problemset.a0896;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MonotonicArrayTest {

    private MonotonicArray mono = new MonotonicArray();

    private int[] testcase1 = new int[]{1,2,3,4};
    private int[] testCase2 = new int[]{6,5,4,4};
    private int[] testCase3 = new int[]{1,3,2};

    @Test
    void test_isMonotonic_1() {
        boolean actualResult = mono.isMonotonic(testcase1);
        assertTrue(actualResult);
    }

    @Test
    void test_isMonotonic_2() {
        boolean actualResult = mono.isMonotonic(testCase2);
        assertTrue(actualResult);
    }

    @Test
    void test_isMonotonic_3() {
        boolean actualResult = mono.isMonotonic(testCase3);
        assertFalse(actualResult);
    }
}