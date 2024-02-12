package problemset.a0169;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MajorityElementTest {
    private MajorityElement mj;
    private int[] testcaseOne;
    private int[] testcaseTwo;

    @BeforeEach
    public void setup() {
        mj = new MajorityElement();
        testcaseOne = new int[]{3,2,3};
        testcaseTwo = new int[]{2,2,1,1,1,2,2};
    }

    @Test
    void test_majorityElement() {
        int expectedResult = 3;
        int actualResult = mj.majorityElement(testcaseOne);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void test_majorityElement_2() {
        int expectedResult = 2;
        int actualResult = mj.majorityElement(testcaseTwo);
        assertEquals(expectedResult, actualResult);
    }
}