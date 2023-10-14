package problemset.a0708;

import datastructures.Node;
import org.junit.Ignore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private Solution solution;

    private Node testcaseOne;
    private Node head_testcaseOne;
    private Node testcaseTwo;
    private Node head_testcaseTwo;

    private Node testcaseThree;

    @BeforeEach
    void setUp() {
        solution = new Solution();

        testcaseOne = new Node(3);
        head_testcaseOne = testcaseOne;
        testcaseOne.next = new Node(4, new Node(1, head_testcaseOne));

        testcaseTwo = null;
        head_testcaseTwo = new Node(1);

        testcaseThree = new Node(1);
    }

    @Test
    void test_insert() {
        int[] expectResult = new int[]{3, 4, 1, 2};
        Node actualResult = solution.insert(testcaseOne, 2);
        int i = 0;
        while (actualResult != head_testcaseOne) {
            assertEquals(expectResult[i], actualResult.val);
            i++;
            actualResult = (Node) actualResult.next;
        }
    }

    @Test
    void test_insert_v2() {
        int[] expectResult = new int[]{1};
        Node actualResult = solution.insert(testcaseTwo, 1);
        int i = 0;
        while (actualResult != null && i < expectResult.length) {
            assertEquals(expectResult[i], actualResult.val);
            i++;
            actualResult = (Node) actualResult.next;
        }
    }
}
