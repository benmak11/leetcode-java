package problemset.a0080;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesfromSortedArrayIITest {

    private RemoveDuplicatesfromSortedArrayII dup = new RemoveDuplicatesfromSortedArrayII();

    private int[] testCase1 = new int[]{1,1,1,2,2,3};
    private int[] testCase2 = new int[]{0,0,1,1,1,1,2,3,3};


    @Test
    void test_removeDups_1() {
        int[] expectedResult = new int[]{1,1,2,2,3};
        int actualResult = dup.removeDuplicates(testCase1);

        assertEquals(expectedResult.length, actualResult);
    }

    @Test
    void test_removeDups_2() {
        int[] expectedResult = new int[]{0,0,1,1,2,3,3};
        int actualResult = dup.removeDuplicates(testCase2);

        assertEquals(expectedResult.length, actualResult);
    }

}