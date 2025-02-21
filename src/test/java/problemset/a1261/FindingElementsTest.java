package problemset.a1261;

import datastructures.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindingElementsTest {
    private FindingElements findingElements;

    private String[] testCaseOne;
    private String[] testCaseTwo;
    private String[] testCaseThree;

    @BeforeEach
    void setUp() {
        testCaseOne = new String[]{"-1", null, "-1"};
        testCaseTwo = new String[]{"-1", "-1", "-1", "-1", "-1"};
        testCaseThree = new String[]{"-1", null, "-1", "-1", null, "-1"};
    }

    @Test
    void test_findOne() {
        TreeNode node = new TreeNode();
        TreeNode treeNode = node.buildTree(testCaseOne);
        findingElements = new FindingElements(treeNode);
        assertFalse(findingElements.find(1));
        assertTrue(findingElements.find(2));
    }

    @Test
    void test_findTwo() {
        TreeNode node = new TreeNode();
        TreeNode treeNode = node.buildTree(testCaseTwo);
        findingElements = new FindingElements(treeNode);
        assertTrue(findingElements.find(1));
        assertTrue(findingElements.find(3));
        assertFalse(findingElements.find(5));
    }

    @Test
    void test_findThree() {
        TreeNode node = new TreeNode();
        TreeNode treeNode = node.buildTree(testCaseThree);
        findingElements = new FindingElements(treeNode);
        assertTrue(findingElements.find(2));
        assertFalse(findingElements.find(3));
        assertFalse(findingElements.find(4));
        assertTrue(findingElements.find(5));
    }
}