package problemset.a0227;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private Solution solution;

    private String testcaseOne;
    private String testcaseTwo;
    private String testcaseThree;
    @BeforeEach
    void setUp() {
        solution = new Solution();

        testcaseOne = "3+2*2";
        testcaseTwo = " 3/2";
        testcaseThree = " 3+5 / 2 ";
    }

    @Test
    void test_calculate() {
        int expectedResult = 7;
        int actualResult = solution.calculate(testcaseOne);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void test_calculate_v2() {
        int expectedResult = 1;
        int actualResult = solution.calculate(testcaseTwo);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void test_calculate_v3() {
        int expectedResult = 5;
        int actualResult = solution.calculate(testcaseThree);
        assertEquals(expectedResult, actualResult);
    }
}