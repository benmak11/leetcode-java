package problemset.a0020;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsBalancedParenthesesTest {

    private IsBalancedParentheses balanced;
    char[][] brackets;

    String input1;
    String input2;
    String input3;
    String input4;
    String input5;
    String input6;

    @BeforeEach
    void setUp() {
        balanced = new IsBalancedParentheses();
        brackets = new char[][]{{'(', ')'}, {'{', '}'}, {'[', ']'}, {'<', '>'}};
        input1 = "some string";
        input2 = "[abc(def)gh{i}j]";
        input3 = "[abcdef";
        input4 = "abcd(egf))";
        input5 = ")abcd((egf)";
        input6 = "(abcd[)]efgh";
    }

    @Test
    void test_isBalanced1() {
        boolean res = balanced.isBalanced(input1, brackets);
        assertTrue(res);
    }

    @Test
    void test_isBalanced2() {
        boolean res = balanced.isBalanced(input2, brackets);
        assertTrue(res);
    }

    @Test
    void test_isBalanced3() {
        boolean res = balanced.isBalanced(input3, brackets);
        assertFalse(res);
    }

    @Test
    void test_isBalanced4() {
        boolean res = balanced.isBalanced(input4, brackets);
        assertFalse(res);
    }

    @Test
    void test_isBalanced5() {
        boolean res = balanced.isBalanced(input5, brackets);
        assertFalse(res);
    }

    @Test
    void test_isBalanced6() {
        boolean res = balanced.isBalanced(input6, brackets);
        assertFalse(res);
    }
}