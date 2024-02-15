package problemset.a2149;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RearrangeArrayElementsBySignTest {

    private RearrangeArrayElementsBySign sign;
    private int[] testcaseOne;
    private int[] testcaseTwo;

    @BeforeEach
    void setUp() {
        sign = new RearrangeArrayElementsBySign();
        testcaseOne = new int[]{3, 1, -2, -5, 2, -4};
        testcaseTwo = new int[]{-1, 1};
    }

    @Test
    void test_rearrangeArray() {
        int[] expectedResult = new int[]{3, -2, 1, -5, 2, -4};
        int[] actualResult = sign.rearrangeArray(testcaseOne);
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void test_rearrangeArray_2() {
        int[] expectedResult = new int[]{1, -1};
        int[] actualResult = sign.rearrangeArray(testcaseTwo);
        assertArrayEquals(expectedResult, actualResult);
    }
}