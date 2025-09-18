package problemset.a1935;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumNumberOfWordsYouCanTypeTest {

    private MaximumNumberOfWordsYouCanType max;

    private String testCaseOne_Text;
    private String testCaseOne_BrokenLetters;

    private String testCaseTwo_Text;
    private String testCaseTwo_BrokenLetters;

    private String testCaseThree_Text;
    private String testCaseThree_BrokenLetters;

    @BeforeEach
    void setUp() {
        max = new MaximumNumberOfWordsYouCanType();

        testCaseOne_Text = "hello world";
        testCaseOne_BrokenLetters = "ad";

        testCaseTwo_Text = "leet code";
        testCaseTwo_BrokenLetters = "lt";

        testCaseThree_Text = "leet code";
        testCaseThree_BrokenLetters = "e";
    }

    @Test
    void canBeTypedWords_testCaseOne() {
        assertEquals(1, max.canBeTypedWords(testCaseOne_Text, testCaseOne_BrokenLetters));
    }

    @Test
    void canBeTypedWords_testCaseTwo() {
        assertEquals(1, max.canBeTypedWords(testCaseTwo_Text, testCaseTwo_BrokenLetters));
    }

    @Test
    void canBeTypedWords_testCaseThree() {
        assertEquals(0, max.canBeTypedWords(testCaseThree_Text, testCaseThree_BrokenLetters));
    }
}