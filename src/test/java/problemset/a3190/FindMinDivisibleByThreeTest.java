package problemset.a3190;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindMinDivisibleByThreeTest {

    private FindMinDivisibleByThree finder;

    private int[] testcaseOne;
    private int[] testcaseTwo;

    @BeforeEach
    void setUp() {
        finder = new FindMinDivisibleByThree();

        testcaseOne = new int[]{1,2,3,4};
        testcaseTwo = new int[]{3, 6, 9};
    }

    @Test
    void test_findMinimumOperations_one() {
        assertEquals(3, finder.findMinimumOperations(testcaseOne));
    }

    @Test
    void test_findMinimumOperations_two() {
        assertEquals(0, finder.findMinimumOperations(testcaseTwo));
    }
}