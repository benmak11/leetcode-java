package problemset.a0150;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvaluateReversePolishNotationTest {

    private EvaluateReversePolishNotation ev;
    private String[] testcaseOne;
    private String[] testcaseTwo;

    private String[] testcaseThree;

    @BeforeEach
    void setUp() {
        ev = new EvaluateReversePolishNotation();
        testcaseOne = new String[]{"2","1","+","3","*"};
        testcaseTwo = new String[]{"4","13","5","/","+"};
        testcaseThree = new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
    }

    @Test
    void evalRPN() {
        int expectedResult = 9;
        int actualResult = ev.evalRPN(testcaseOne);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void evalRPN_2() {
        int expectedResult = 6;
        int actualResult = ev.evalRPN(testcaseTwo);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void evalRPN_3() {
        int expectedResult = 22;
        int actualResult = ev.evalRPN(testcaseThree);
        assertEquals(expectedResult, actualResult);
    }

}