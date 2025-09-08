package problemset.a1317;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertIntegerToTheSumOfTwoNoZeroIntegerTest {

    private ConvertIntegerToTheSumOfTwoNoZeroInteger convert;

    private int testCaseOne;
    private int testCaseTwo;

    @BeforeEach
    void setUp() {
        convert = new ConvertIntegerToTheSumOfTwoNoZeroInteger();

        testCaseOne = 2;
        testCaseTwo = 11;
    }

    @Test
    void getNoZeroIntegers_testCaseOne() {
        int[] expected = {1, 1};
        int[] actual = convert.getNoZeroIntegers(testCaseOne);

        assertArrayEquals(expected, actual);
    }

    @Test
    void getNoZeroIntegers_testCaseTwo() {
        int[] expected = {2, 9};
        int[] actual = convert.getNoZeroIntegers(testCaseTwo);

        assertArrayEquals(expected, actual);
    }
}