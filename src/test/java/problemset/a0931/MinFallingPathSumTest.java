package problemset.a0931;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinFallingPathSumTest {

    private MinFallingPathSum sum;
    private int[][] testcaseOne;
    private int[][] testcaseTwo;

    @BeforeEach
    void setUp() {
        sum = new MinFallingPathSum();
        testcaseOne = new int[][]{{2, 1, 3}, {6, 5, 4}, {7, 8, 9}};
        testcaseTwo = new int[][]{{-19, 57}, {-40, -5}};
    }

    @Test
    void test_minFallingPathSum_v1() {
        var expectedResult = 13;
        var actualResult = sum.minFallingPathSum(testcaseOne);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void test_minFallingPathSum_v2() {
        var expectedResult = -59;
        var actualResult = sum.minFallingPathSum(testcaseTwo);
        assertEquals(expectedResult, actualResult);
    }
}