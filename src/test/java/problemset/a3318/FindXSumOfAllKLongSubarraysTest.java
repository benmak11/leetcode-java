package problemset.a3318;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindXSumOfAllKLongSubarraysTest {

    private FindXSumOfAllKLongSubarrays find;

    private int[] nums1;
    private int k1;
    private int x1;
    private int[] nums2;
    private int k2;
    private int x2;

    @BeforeEach
    void setUp() {
        find = new FindXSumOfAllKLongSubarrays();
        nums1 = new int[]{1,1,2,2,3,4,2,3};
        k1 = 6;
        x1 = 2;
        nums2 = new int[]{3,8,7,8,7,5};
        k2 = 2;
        x2 = 2;
    }

    @Test
    void testCaseOne_findXSumOfAllKLongSubarrays() {
        int[] expected = new int[]{6,10,12};
        int[] actual = find.findXSumOfAllKLongSubarrays(nums1, k1, x1);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testCaseTwo_findXSumOfAllKLongSubarrays() {
        int[] expected = new int[]{11,15,15,15,12};
        int[] actual = find.findXSumOfAllKLongSubarrays(nums2, k2, x2);
        assertArrayEquals(expected, actual);
    }
}