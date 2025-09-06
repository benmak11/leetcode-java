package problemset.a3516;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindClosestPersonTest {

    private FindClosestPerson findClosestPerson;
    private int testCaseOneX;
    private int testCaseOneY;
    private int testCaseOneZ;
    private int testCaseTwoX;
    private int testCaseTwoY;
    private int testCaseTwoZ;


    @BeforeEach
    void setUp() {
        findClosestPerson = new FindClosestPerson();

        testCaseOneX = 2;
        testCaseOneY = 7;
        testCaseOneZ = 4;

        testCaseTwoX = 2;
        testCaseTwoY = 5;
        testCaseTwoZ = 6;
    }

    @Test
    void findClosest_testCaseOne() {
        int expected = 1;
        int actual = findClosestPerson.findClosest(testCaseOneX, testCaseOneY, testCaseOneZ);
        assertEquals(expected, actual);
    }

    @Test
    void findClosest_testCaseTwo() {
        int expected = 2;
        int actual = findClosestPerson.findClosest(testCaseTwoX, testCaseTwoY, testCaseTwoZ);
        assertEquals(expected, actual);
    }
}