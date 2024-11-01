package problemset.a2485;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindThePivotIntegerTest {

    private FindThePivotInteger find;

    private int testcaseOne;
    private int testcaseTwo;
    private int testcaseThree;

    @BeforeEach
    void setUp() {
        find = new FindThePivotInteger();

        testcaseOne = 8;
        testcaseTwo = 1;
        testcaseThree = 4;
    }

    @Test
    void test_pivotInteger() {
        int expectedResult = 6;
        int actualResult = find.pivotInteger(testcaseOne);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void test_pivotInteger_2() {
        int expectedResult = 1;
        int actualResult = find.pivotInteger(testcaseTwo);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void test_pivotInteger_3() {
        int expectedResult = -1;
        int actualResult = find.pivotInteger(testcaseThree);
        assertEquals(expectedResult, actualResult);
    }
}