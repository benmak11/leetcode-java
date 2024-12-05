package problemset.a2337;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovePiecesToObtainAStringTest {

    private MovePiecesToObtainAString move;

    String startTestCaseOne;
    String targetTestCaseOne;
    String startTestCaseTwo;
    String targetTestCaseTwo;
    String startTestCaseThree;
    String targetTestCaseThree;

    @BeforeEach
    void setUp() {
        move = new MovePiecesToObtainAString();

        startTestCaseOne = "_L__R__R_";
        targetTestCaseOne = "L______RR";

        startTestCaseTwo = "R_L_";
        targetTestCaseTwo = "__LR";

        startTestCaseThree = "_R";
        targetTestCaseThree = "R_";
    }

    @Test
    void canChange_One() {
        boolean result = move.canChange(startTestCaseOne, targetTestCaseOne);
        assertTrue(result);
    }

    @Test
    void canChange_Two() {
        boolean result = move.canChange(startTestCaseTwo, targetTestCaseTwo);
        assertFalse(result);
    }

    @Test
    void canChange_Three() {
        boolean result = move.canChange(startTestCaseThree, targetTestCaseThree);
        assertFalse(result);
    }
}