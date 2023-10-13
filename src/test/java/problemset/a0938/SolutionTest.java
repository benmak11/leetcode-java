package problemset.a0938;

import datastructures.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private Solution solution;

    private TreeNode testcaseOne;
    private TreeNode testcaseTwo;
    private TreeNode testcaseThree;

    @BeforeEach
    void setUp() {
        solution = new Solution();

        testcaseOne = new TreeNode(10, new TreeNode(5, new TreeNode(3), new TreeNode(7)),
                new TreeNode(15, null, new TreeNode(18)));

        testcaseTwo = new TreeNode(10, new TreeNode(5, new TreeNode(3, new TreeNode(1), null),
                new TreeNode(7, new TreeNode(6), null)), new TreeNode(15, new TreeNode(13), new TreeNode(18)));

        testcaseThree = new TreeNode(7);
    }

    @Test
    void test_rangeSumBST() {
        int expectedResult = 32;
        int actualResult = solution.rangeSumBST(testcaseOne, 7, 15);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void test_rangeSumBST_v2() {
        int expectedResult = 23;
        int actualResult = solution.rangeSumBST(testcaseTwo, 6, 10);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void test_rangeSumBST_v3() {
        int expectedResult = 0;
        int actualResult = solution.rangeSumBST(testcaseThree, 1, 4);
        assertEquals(expectedResult, actualResult);
    }
}
