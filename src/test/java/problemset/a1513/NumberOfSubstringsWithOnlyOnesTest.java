package problemset.a1513;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfSubstringsWithOnlyOnesTest {
    private NumberOfSubstringsWithOnlyOnes numSubstrings;

    private String testcaseOne;
    private String testcaseTwo;
    private String testcaseThree;

    @BeforeEach
    void setUp() {
        numSubstrings = new NumberOfSubstringsWithOnlyOnes();

        testcaseOne = "0110111";
        testcaseTwo = "101";
        testcaseThree = "111111";
    }

    @Test
    void test_numSub_testCaseOne() {
        assertEquals(9, numSubstrings.numSub(testcaseOne));
    }

    @Test
    void test_numSub_testCaseTwo() {
        assertEquals(2, numSubstrings.numSub(testcaseTwo));
    }

    @Test
    void test_numSub_testCaseThree() {
        assertEquals(21, numSubstrings.numSub(testcaseThree));
    }
}