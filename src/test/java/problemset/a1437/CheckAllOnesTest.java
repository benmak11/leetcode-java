package problemset.a1437;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckAllOnesTest {

    private CheckAllOnes checkAllOnes;
    private int[] testcaseOne;
    private int[] testcaseTwo;
    private int kOne;
    private int kTwo;

    @BeforeEach
    void setUp() {
        checkAllOnes = new CheckAllOnes();
        testcaseOne = new int[]{1,0,0,0,1,0,0,1};
        testcaseTwo = new int[]{1,0,0,1,0,1};
        kOne = 2;
        kTwo = 2;
    }

    @Test
    void test_kLengthApart_testCaseOne() {
        assertTrue(checkAllOnes.kLengthApart(testcaseOne, kOne));
    }

    @Test
    void test_kLengthApart_testCaseTwo() {
        assertFalse(checkAllOnes.kLengthApart(testcaseTwo, kTwo));
    }
}