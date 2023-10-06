package problemset.a0343;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerBreakTest {

    private IntegerBreak integerBreak = new IntegerBreak();

    private int testcaseOne = 2;
    private int testcaseTwo = 10;

    @Test
    void test_integerBreak_one() {
        int expectedResult = 1;
        int actualResult = integerBreak.integerBreak(testcaseOne);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void test_integerBreak_two() {
        int expectedResult = 36;
        int actualResult = integerBreak.integerBreak(testcaseTwo);
        assertEquals(expectedResult, actualResult);
    }

}