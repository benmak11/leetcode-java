package problemset.a0034;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchRangeTest {

    private SearchRange search;

    private int[] testcaseOne;
    private int[] testcaseTwo;
    private int[] testcaseThree;

    @BeforeEach
    void setUp() {
        search = new SearchRange();

        testcaseOne = new int[]{5, 7, 7, 8, 8, 10};
        testcaseTwo = new int[]{5, 7, 7, 8, 8, 10};
        testcaseThree = new int[]{};
    }

    @Test
    void test_searchRange() {
        int[] expectedResult = new int[]{3, 4};
        int[] actualResult = search.searchRange(testcaseOne, 8);
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void test_searchRange_V2() {
        int[] expectedResult = new int[]{-1, -1};
        int[] actualResult = search.searchRange(testcaseTwo, 6);
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void test_searchRange_V3() {
        int[] expectedResult = new int[]{-1, -1};
        int[] actualResult = search.searchRange(testcaseOne, 0);
        assertArrayEquals(expectedResult, actualResult);
    }
}