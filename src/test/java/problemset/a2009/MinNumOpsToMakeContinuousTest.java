package problemset.a2009;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinNumOpsToMakeContinuousTest {

    private MinNumOpsToMakeContinuous min;

    private int[] testcaseOne;
    private int[] testcaseTwo;
    private int[] testcaseThree;

    @BeforeEach
    void setUp() {
        min = new MinNumOpsToMakeContinuous();
        testcaseOne = new int[]{4, 2, 5, 3};
        testcaseTwo = new int[]{1, 2, 3, 5, 6};
        testcaseThree = new int[]{1, 10, 100, 1000};
    }

    @Test
    void test_minOperations() {
        int expectedResult = 0;
        int actualResult = min.minOperations(testcaseOne);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    void test_minOperations_v2() {
        int expectedResult = 1;
        int actualResult = min.minOperations(testcaseTwo);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    void test_minOperations_v3() {
        int expectedResult = 3;
        int actualResult = min.minOperations(testcaseThree);
        assertEquals(expectedResult, actualResult);
    }
}
