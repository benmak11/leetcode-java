package problemset.a0229;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class MajorityElementIITest {

    private MajorityElementII maj = new MajorityElementII();

    private int[] testCaseOne = new int[]{3, 2, 3};
    private int[] testCaseTwo = new int[]{1};
    private int[] testCaseThree = new int[]{1, 2};

    @Test
    void testMajorityElements_1() {
        List<Integer> expected = List.of(3);
        List<Integer> res = maj.majorityElement(testCaseOne);
        for (int i = 0; i < res.size(); i++) {
            assertEquals(expected.get(i), res.get(i));
        }
    }

    @Test
    void testMajorityElements_2() {
        List<Integer> expected = List.of(1);
        List<Integer> res = maj.majorityElement(testCaseTwo);
        for (int i = 0; i < res.size(); i++) {
            assertEquals(expected.get(i), res.get(i));
        }
    }

    @Test
    void testMajorityElements_3() {
        List<Integer> expected = List.of(1, 2);
        List<Integer> res = maj.majorityElement(testCaseThree);
        for (int i = 0; i < res.size(); i++) {
            assertEquals(expected.get(i), res.get(i));
        }
    }

    @Test
    void testMajorityElementsV2_1() {
        List<Integer> expected = List.of(3);
        List<Integer> res = maj.majElement_VersionTwo(testCaseOne);
        for (int i = 0; i < res.size(); i++) {
            assertEquals(expected.get(i), res.get(i));
        }
    }

    @Test
    void testMajorityElementsV2_2() {
        List<Integer> expected = List.of(1);
        List<Integer> res = maj.majElement_VersionTwo(testCaseTwo);
        for (int i = 0; i < res.size(); i++) {
            assertEquals(expected.get(i), res.get(i));
        }
    }

    @Test
    void testMajorityElementsV2_3() {
        List<Integer> expected = List.of(1, 2);
        List<Integer> res = maj.majElement_VersionTwo(testCaseThree);
        for (int i = 0; i < res.size(); i++) {
            assertEquals(expected.get(i), res.get(i));
        }
    }

}