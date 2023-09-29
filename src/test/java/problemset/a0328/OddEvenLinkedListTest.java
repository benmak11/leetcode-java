package problemset.a0328;

import datastructures.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OddEvenLinkedListTest {

    private OddEvenLinkedList odd = new OddEvenLinkedList();

    private ListNode testCaseOne = null;
    private ListNode testCaseTwo = null;

    @Test
    void test_oddEvenList_1() {
        testCaseOne = new ListNode(1);
        testCaseOne.next = new ListNode(2);
        testCaseOne.next.next = new ListNode(3);
        testCaseOne.next.next.next = new ListNode(4);
        testCaseOne.next.next.next.next = new ListNode(5);

        ListNode expectedResult = new ListNode(1);
        expectedResult.next = new ListNode(3);
        expectedResult.next.next = new ListNode(5);
        expectedResult.next.next.next = new ListNode(2);
        expectedResult.next.next.next.next = new ListNode(4);

        ListNode actualResult = odd.oddEvenList(testCaseOne);
        while (expectedResult != null && actualResult != null) {
            assertEquals(expectedResult.val, actualResult.val);
            expectedResult = expectedResult.next;
            actualResult = actualResult.next;
        }
    }

    @Test
    void test_oddEvenList_2() {
        testCaseTwo = new ListNode(2);
        testCaseTwo.next = new ListNode(1);
        testCaseTwo.next.next = new ListNode(3);
        testCaseTwo.next.next.next = new ListNode(5);
        testCaseTwo.next.next.next.next = new ListNode(6);
        testCaseTwo.next.next.next.next.next = new ListNode(4);
        testCaseTwo.next.next.next.next.next.next = new ListNode(7);

        ListNode expectedResult = new ListNode(2);
        expectedResult.next = new ListNode(3);
        expectedResult.next.next = new ListNode(6);
        expectedResult.next.next.next = new ListNode(7);
        expectedResult.next.next.next.next = new ListNode(1);
        expectedResult.next.next.next.next.next = new ListNode(5);
        expectedResult.next.next.next.next.next.next = new ListNode(4);

        ListNode actualResult = odd.oddEvenList(testCaseTwo);
        while (expectedResult != null && actualResult != null) {
            assertEquals(expectedResult.val, actualResult.val);
            expectedResult = expectedResult.next;
            actualResult = actualResult.next;
        }
    }
}