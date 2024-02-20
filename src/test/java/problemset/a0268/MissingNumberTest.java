package problemset.a0268;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MissingNumberTest {

    private MissingNumber missingNumber;

    private int[] testcaseOne;
    private int[] testcaseTwo;
    private int[] testcaseThree;

    @BeforeEach
    void setUp() {
        missingNumber = new MissingNumber();
        testcaseOne = new int[]{3, 0, 1};
        testcaseTwo = new int[]{0, 1};
        testcaseThree = new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1};
    }

    @Test
    void test_missingNumber() {
        int expectResult = 2;
        int actualResult = missingNumber.missingNumber(testcaseOne);
        assertEquals(expectResult, actualResult);
    }

    @Test
    void test_missingNumber_2() {
        int expectResult = 2;
        int actualResult = missingNumber.missingNumber(testcaseTwo);
        assertEquals(expectResult, actualResult);
    }

    @Test
    void test_missingNumber_3() {
        int expectResult = 8;
        int actualResult = missingNumber.missingNumber(testcaseThree);
        assertEquals(expectResult, actualResult);
    }
}
