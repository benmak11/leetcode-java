package problemset.a0997;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindTheTownJudgeTest {

    private FindTheTownJudge judge;

    @BeforeEach
    void setUp() {
        judge = new FindTheTownJudge();
    }

    @Test
    void test_findJudge() {
        int expectedResult = 2;
        int[][] testcaseArray = {{1, 2}};
        int n = 2;
        int actualResult = judge.findJudge(n, testcaseArray);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void test_findJudge_2() {
        int expectedResult = 3;
        int[][] testcaseArray = {{1, 3}, {2, 3}};
        int n = 3;
        int actualResult = judge.findJudge(n, testcaseArray);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void test_findJudge_3() {
        int expectedResult = -1;
        int[][] testcaseArray = {{1, 3}, {2, 3}, {3, 1}};
        int n = 3;
        int actualResult = judge.findJudge(n, testcaseArray);
        assertEquals(expectedResult, actualResult);
    }
}