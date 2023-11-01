package problemset.a0501;

import datastructures.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindModeInBinarySearchTreeTest {

    private FindModeInBinarySearchTree find;

    private TreeNode testcaseOne;
    private TreeNode testcaseTwo;

    @BeforeEach
    void setUp() {
        find = new FindModeInBinarySearchTree();

        testcaseOne = new TreeNode(1, null, new TreeNode(2, new TreeNode(2), null));
        testcaseTwo = new TreeNode(0);
    }

    @Test
    void testfindMode_v1() {
        int[] expectedResult = new int[] {2};
        int[] actualResult = find.bfs_findMode(testcaseOne);
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void testfindMode_v2() {
        int[] expectedResult = new int[] {0};
        int[] actualResult = find.bfs_findMode(testcaseTwo);
        assertArrayEquals(expectedResult, actualResult);
    }
}