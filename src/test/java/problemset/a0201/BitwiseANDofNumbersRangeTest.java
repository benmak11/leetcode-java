package problemset.a0201;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BitwiseANDofNumbersRangeTest {

    private BitwiseANDofNumbersRange bit;

    private int[] testcaseOne;
    private int[] testcaseTwo;
    private int[] testcaseThree;

    @BeforeEach
    void setUp() {
        bit = new BitwiseANDofNumbersRange();
        testcaseOne = new int[]{5, 7};
        testcaseTwo = new int[]{0, 0};
        testcaseThree = new int[]{1, 2147483647};
    }

    @Test
    void test_rangeBitwiseAnd() {
        var expectedResult = 4;
        var actualResult = bit.rangeBitwiseAnd(testcaseOne[0], testcaseOne[1]);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void test_rangeBitwiseAnd_2() {
        var expectedResult = 0;
        var actualResult = bit.rangeBitwiseAnd(testcaseTwo[0], testcaseTwo[1]);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void test_rangeBitwiseAnd_3() {
        var expectedResult = 0;
        var actualResult = bit.rangeBitwiseAnd(testcaseThree[0], testcaseThree[1]);
        assertEquals(expectedResult, actualResult);
    }
}