package problemset.a2864;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumOddBinaryNumberTest {

    private MaximumOddBinaryNumber odd;

    private String testcaseOne;
    private String testcaseTwo;

    @BeforeEach
    void setUp() {
        odd = new MaximumOddBinaryNumber();

        testcaseOne = "010";
        testcaseTwo = "0101";
    }

    @Test
    void test_maximumOddBinaryNumber() {
        String expectedResult = "001";
        String actualResult = odd.maximumOddBinaryNumber(testcaseOne);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void test_maximumOddBinaryNumber_2() {
        String expectedResult = "1001";
        String actualResult = odd.maximumOddBinaryNumber(testcaseTwo);
        assertEquals(expectedResult, actualResult);
    }
}