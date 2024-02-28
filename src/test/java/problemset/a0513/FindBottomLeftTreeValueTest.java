package problemset.a0513;

import datastructures.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindBottomLeftTreeValueTest {

    private FindBottomLeftTreeValue find;

    private TreeNode testcaseOne;
    private TreeNode testcaseTwo;

    @BeforeEach
    void setUp() {
        find = new FindBottomLeftTreeValue();

        testcaseOne = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        testcaseTwo = new TreeNode(1, new TreeNode(2, new TreeNode(4), null),
                new TreeNode(3, new TreeNode(5, new TreeNode(7), null),
                        new TreeNode(6)));
    }

    @Test
    void test_findBottomLeftValue() {
        int expectedResult = 1;
        int actualResult = find.findBottomLeftValue(testcaseOne);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void test_findBottomLeftValue_2() {
        int expectedResult = 7;
        int actualResult = find.findBottomLeftValue(testcaseTwo);
        assertEquals(expectedResult, actualResult);
    }
}