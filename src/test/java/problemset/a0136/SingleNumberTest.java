package problemset.a0136;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingleNumberTest {

    private SingleNumber singleNumber;

    private int[] testcaseOne;
    private int[] testcaseTwo;
    private int[] testcaseThree;

    @BeforeEach
    void setUp() {
        singleNumber = new SingleNumber();
        testcaseOne = new int[]{2, 2, 1};
        testcaseTwo = new int[]{4, 1, 2, 1, 2};
        testcaseThree = new int[]{1};
    }

    @Test
    void test_singleNumber() {
        int expectedResult = 1;
        int actualResult = singleNumber.singleNumber(testcaseOne);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void test_singleNumber_V2() {
        int expectedResult = 4;
        int actualResult = singleNumber.singleNumber(testcaseTwo);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void test_singleNumber_v3() {
        int expectedResult = 1;
        int actualResult = singleNumber.singleNumber(testcaseThree);
        assertEquals(expectedResult, actualResult);
    }
}