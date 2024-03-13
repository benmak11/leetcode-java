package problemset.a0791;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomSortStringTest {

    private CustomSortString custom;

    private String testcaseOrderOne;
    private String testcaseSOne;

    private String testcaseOrderTwo;
    private String testcaseSTwo;

    @BeforeEach
    void setUp() {
        custom = new CustomSortString();

        testcaseOrderOne = "cba";
        testcaseSOne = "abcd";
        testcaseOrderTwo = "bcafg";
        testcaseSTwo = "abcd";
    }

    @Test
    void test_customSortString() {
        String expectedResult = "cbad";
        String actualResult = custom.customSortString(testcaseOrderOne, testcaseSOne);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void test_customSortString_2() {
        String expectedResult = "bcad";
        String actualResult = custom.customSortString(testcaseOrderTwo, testcaseSTwo);
        assertEquals(expectedResult, actualResult);
    }
}
