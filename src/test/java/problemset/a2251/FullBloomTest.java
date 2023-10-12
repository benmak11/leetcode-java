package problemset.a2251;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FullBloomTest {

    private FullBloom fullBloom;

    private int[][] testcaseOne;
    private int[] peopleOne;
    private int[][] testcaseTwo;
    private int[] peopleTwo;

    @BeforeEach
    void setUp() {
        fullBloom = new FullBloom();

        testcaseOne = new int[][]{{1, 6}, {3, 7}, {9, 12}, {4, 13}};
        peopleOne = new int[]{2, 3, 7, 11};

        testcaseTwo = new int[][]{{1, 10}, {3, 3}};
        peopleTwo = new int[]{3, 3, 2};
    }

    @Test
    void test_fullBloomFlowers() {
        int[] expectedResult = new int[]{1, 2, 2, 2};
        int[] actualResult = fullBloom.fullBloomFlowers(testcaseOne, peopleOne);
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void test_fullBloomFlowers_v2() {
        int[] expectedResult = new int[]{2, 2, 1};
        int[] actualResult = fullBloom.fullBloomFlowers(testcaseTwo, peopleTwo);
        assertArrayEquals(expectedResult, actualResult);
    }
}