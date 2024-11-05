package problemset.a2914;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumNumberOfChangesToMakeBinaryStringBeautifulTest {

    private MinimumNumberOfChangesToMakeBinaryStringBeautiful bea;
    String sTest1;
    String sTest2;
    String sTest3;
    String sTest4;

    @BeforeEach
    void setUp() {
        bea = new MinimumNumberOfChangesToMakeBinaryStringBeautiful();
        sTest1 = "1001";
        sTest2 = "10";
        sTest3 = "0000";
        sTest4 = "00101100";
    }

    @Test
    void test_minChanges1() {
        int result = bea.minChanges(sTest1);
        int expected = 2;
        assertEquals(expected, result);
    }

    @Test
    void test_minChanges2() {
        int result = bea.minChanges(sTest2);
        int expected = 1;
        assertEquals(expected, result);
    }

    @Test
    void test_minChanges3() {
        int result = bea.minChanges(sTest3);
        int expected = 0;
        assertEquals(expected, result);
    }

    @Test
    void test_minChanges4() {
        int result = bea.minChanges(sTest4);
        int expected = 1;
        assertEquals(expected, result);
    }
}