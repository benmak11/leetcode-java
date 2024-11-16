package problemset.a3254;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindThePowerOfKSizeSubarrayITest {

    private FindThePowerOfKSizeSubarrayI sub;
    private int[] testcase1;
    private int[] testcase2;
    private int[] testcase3;
    private int[] testcase4;

    @BeforeEach
    void setUp() {
        sub = new FindThePowerOfKSizeSubarrayI();
        testcase1 = new int[]{1, 2, 3, 4, 3, 2, 5};
        testcase2 = new int[]{2, 2, 2, 2, 2};
        testcase3 = new int[]{3, 2, 3, 2, 3, 2};
        testcase4 = new int[]{1, 3, 4};
    }

    @Test
    void test_resultsArray1() {
        int[] result = sub.resultsArray(testcase1, 3);
        int[] expectedResult = new int[]{3, 4, -1, -1, -1};
        for (int i = 0; i < expectedResult.length; i++)
            assertEquals(expectedResult[i], result[i]);
    }

    @Test
    void test_resultsArray2() {
        int[] result = sub.resultsArray(testcase2, 4);
        int[] expectedResult = new int[]{-1, -1};
        for (int i = 0; i < expectedResult.length; i++)
            assertEquals(expectedResult[i], result[i]);
    }

    @Test
    void test_resultsArray3() {
        int[] result = sub.resultsArray(testcase3, 2);
        int[] expectedResult = new int[]{-1, 3, -1, 3, -1};
        for (int i = 0; i < expectedResult.length; i++)
            assertEquals(expectedResult[i], result[i]);
    }

    @Test
    void test_resultsArray4() {
        int[] result = sub.resultsArray(testcase4, 2);
        int[] expectedResult = new int[]{-1, 4};
        for (int i = 0; i < expectedResult.length; i++)
            assertEquals(expectedResult[i], result[i]);
    }
}