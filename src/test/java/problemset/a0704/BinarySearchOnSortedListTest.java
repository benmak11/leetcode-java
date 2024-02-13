package problemset.a0704;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchOnSortedListTest {

    private BinarySearchOnSortedList sorted;
    private int[] testcaseOne;
    private int target_testcaseOne;
    private int[] testcaseTwo;
    private int target_testcaseTwo;

    @BeforeEach
    void setUp() {
        sorted = new BinarySearchOnSortedList();
        testcaseOne = new int[]{-1,0,3,5,9,12};
        target_testcaseOne = 9;
        testcaseTwo = new int[]{-1,0,3,5,9,12};
        target_testcaseTwo = 2;
    }

    @Test
    void test_binarySearch() {
        int expectedResult = 4;
        int actualResult = sorted.binarySearch(testcaseOne, target_testcaseOne);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void test_binarySearch_2() {
        int expectedResult = -1;
        int actualResult = sorted.binarySearch(testcaseTwo, target_testcaseTwo);
        assertEquals(expectedResult, actualResult);
    }
}