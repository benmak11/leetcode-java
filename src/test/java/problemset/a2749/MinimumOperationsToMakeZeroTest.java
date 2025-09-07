package problemset.a2749;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumOperationsToMakeZeroTest {

    private MinimumOperationsToMakeZero minimumOperationsToMakeZero;

    private int testCaseOneNum1;
    private int testCaseOneNum2;
    private int expectedOne;

    private int testCaseTwoNum1;
    private int testCaseTwoNum2;
    private int expectedTwo;

    @BeforeEach
    void setUp() {
        minimumOperationsToMakeZero = new MinimumOperationsToMakeZero();

        testCaseOneNum1 = 3;
        testCaseOneNum2 = -2;
        expectedOne = 3;

        testCaseTwoNum1 = 5;
        testCaseTwoNum2 = 7;
        expectedTwo = -1;
    }

    @Test
    void makeTheIntegerZero_testCaseOne() {
        int result = minimumOperationsToMakeZero.makeTheIntegerZero(testCaseOneNum1, testCaseOneNum2);
        assertEquals(expectedOne, result);
    }

    @Test
    void makeTheIntegerZero_testCaseTwo() {
        int result = minimumOperationsToMakeZero.makeTheIntegerZero(testCaseTwoNum1, testCaseTwoNum2);
        assertEquals(expectedTwo, result);
    }
}
