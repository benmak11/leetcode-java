package problemset.a0070;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClimbingStairsTest {

    private ClimbingStairs climb;
    private int testcaseOne;
    private int testcaseTwo;
    @BeforeEach
    void setUp() {
        climb = new ClimbingStairs();
        testcaseOne = 2;
        testcaseTwo = 3;
    }

    @Test
    void test_climbStairsOne() {
        int expectedResult = 2;
        int actualResult = climb.climbStairs(testcaseOne);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void test_climbStairsTwo() {
        int expectedResult = 3;
        int actualResult = climb.climbStairs(testcaseTwo);
        assertEquals(expectedResult, actualResult);
    }
}