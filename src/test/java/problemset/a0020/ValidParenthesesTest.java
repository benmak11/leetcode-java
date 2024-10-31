package problemset.a0020;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ValidParenthesesTest {

    private ValidParentheses valid;
    String testInput1;
    String testInput2;
    String testInput3;

    @BeforeEach
    public void setUp() throws Exception {
        valid = new ValidParentheses();
        testInput1 = "()";
        testInput2 = "()[]{}";
        testInput3 = "(]";
    }

    @Test
    public void test_validParentheses1() {
        boolean res = valid.validParentheses(testInput1);
        assertTrue(res);
    }

    @Test
    public void test_validParentheses2() {
        boolean res = valid.validParentheses(testInput2);
        assertTrue(res);
    }

    @Test
    public void test_validParentheses3() {
        boolean res = valid.validParentheses(testInput3);
        assertFalse(res);
    }
}