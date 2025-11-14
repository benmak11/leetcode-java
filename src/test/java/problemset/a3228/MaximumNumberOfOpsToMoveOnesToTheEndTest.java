package problemset.a3228;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumNumberOfOpsToMoveOnesToTheEndTest {

    private MaximumNumberOfOpsToMoveOnesToTheEnd max;
    private String testcaseOne;
    private String testcaseTwo;

    @BeforeEach
    void setUp() {
        max = new MaximumNumberOfOpsToMoveOnesToTheEnd();
        testcaseOne = "1001101";
        testcaseTwo = "00111";
    }

    @Test
    void test_maxOperations_happyCase() {
        assertEquals(4, max.maxOperations(testcaseOne));
    }

    @Test
    void test_maxOperations_edgeCase() {
        assertEquals(0, max.maxOperations(testcaseTwo));
    }
}