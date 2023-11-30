package problemset.a2147;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumOfWaysToDivideLongCorridorTest {

    private NumOfWaysToDivideLongCorridor corridor;
    private String testcaseOne;
    private String testcaseTwp;
    private String testcaseThree;

    @BeforeEach
    void setUp() {
        corridor = new NumOfWaysToDivideLongCorridor();
        testcaseOne = "SSPPSPS";
        testcaseTwp = "PPSPSP";
        testcaseThree = "S";
    }

    @Test
    void test_numberOfWays() {
        int expectedResult = 3;
        int actualResult = corridor.numberOfWays(testcaseOne);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void test_numOfWays_v2() {
        int expectedResult = 1;
        int actualResult = corridor.numberOfWays(testcaseTwp);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void test_numOfWays_v3() {
        int expectedResult = 0;
        int actualResult = corridor.numberOfWays(testcaseThree);
        assertEquals(expectedResult, actualResult);
    }
}