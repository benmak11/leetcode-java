package problemset.a1343;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumOfSubArraysTest {

    private NumOfSubArrays sum = new NumOfSubArrays();

    private int[] testcase1 = new int[]{2,2,2,2,5,5,5,8};
    private int[] testcase2 = new int[]{11,13,17,23,29,31,7,5,2,3};

    @Test
    void test_numOfSubArrays_1() {
        int expectedResult = 3;
        int actualResult = sum.numOfSubarrays(testcase1, 3, 4);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void test_numOfSubArrays_2() {
        int expectedResult = 6;
        int actualResult = sum.numOfSubarrays(testcase2, 3, 5);
        assertEquals(expectedResult, actualResult);
    }
}
