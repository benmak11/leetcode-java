package problemset.a0872;

import datastructures.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeafSimilarTreesTest {

    private LeafSimilarTrees ls;

    private TreeNode testcaseOneTree_1;
    private TreeNode testcaseOneTree_2;


    @BeforeEach
    void setUp() {
        ls = new LeafSimilarTrees();

        testcaseOneTree_1 = new TreeNode(3, new TreeNode(5, new TreeNode(6, null, null),
                new TreeNode(2, new TreeNode(7, null, null), new TreeNode(4, null, null))),
                new TreeNode(1, new TreeNode(9, null, null), new TreeNode(8, null, null)));
        testcaseOneTree_2 = new TreeNode(3, new TreeNode(5, new TreeNode(6, null, null),
                new TreeNode(7, null, null)), new TreeNode(1, new TreeNode(4, null, null),
                new TreeNode(2, new TreeNode(9, null, null), new TreeNode(8, null, null))));
    }

    @Test
    void test_leafSimilar() {
        boolean actualResult = ls.leafSimilar(testcaseOneTree_1, testcaseOneTree_2);
        assertTrue(actualResult);
    }
}