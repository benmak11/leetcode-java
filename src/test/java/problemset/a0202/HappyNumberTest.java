package problemset.a0202;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HappyNumberTest {

    private HappyNumber happy;

    private int testcaseOne;
    private int testcaseTwo;
    @BeforeEach
    void setUp() {
        happy = new HappyNumber();

        testcaseOne = 19;

        testcaseTwo = 2;
    }

    @Test
    void test_isHappy() {
        boolean actualResult = happy.isHappy(testcaseOne);
        assertTrue(actualResult);
    }

    @Test
    void test_isHappy_v2() {
        boolean actualResult = happy.isHappy(testcaseTwo);
        assertFalse(actualResult);
    }
}