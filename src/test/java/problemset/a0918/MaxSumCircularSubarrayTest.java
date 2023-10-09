package problemset.a0918;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxSumCircularSubarrayTest {

    private MaxSumCircularSubarray max;

    private int[] testcaseOne;
    private int[] testcaseTwo;
    private int[] testcaseThree;

    @BeforeEach
    void setUp() {
        max = new MaxSumCircularSubarray();
        testcaseOne = new int[]{1, -2, 3, -2};
        testcaseTwo = new int[]{5, -3, 5};
        testcaseThree = new int[]{-3, -2, -3};
    }

    @Test
    void test_maxSubarraySumCircular() {
        int expectedResult = 3;
        int actualResult = max.maxSubarraySumCircular(testcaseOne);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void test_maxSubarraySumCircular_V2() {
        int expectedResult = 10;
        int actualResult = max.maxSubarraySumCircular(testcaseTwo);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void test_maxSubarraySumCircular_V3() {
        int expectedResult = -2;
        int actualResult = max.maxSubarraySumCircular(testcaseThree);
        assertEquals(expectedResult, actualResult);
    }
}