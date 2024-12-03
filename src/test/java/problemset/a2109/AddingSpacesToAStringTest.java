package problemset.a2109;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class AddingSpacesToAStringTest {

    private AddingSpacesToAString add;

    String testcaseInputOne;
    int[] testcaseSpacesOne;

    String testcaseInputTwo;
    int[] testcaseSpacesTwo;

    String testcaseInputThree;
    int[] testcaseSpacesThree;


    @BeforeEach
    void setUp() {
        add = new AddingSpacesToAString();

        testcaseInputOne = "LeetcodeHelpsMeLearn";
        testcaseSpacesOne = new int[]{8, 13, 15};

        testcaseInputTwo = "icodeinpython";
        testcaseSpacesTwo = new int[]{1, 5, 7, 9};

        testcaseInputThree = "spacing";
        testcaseSpacesThree = new int[]{0, 1, 2, 3, 4, 5, 6};
    }

    @Test
    public void test_addingSpaces_1() {
        String result = add.addSpaces(testcaseInputOne, testcaseSpacesOne);
        String expectedResult = "Leetcode Helps Me Learn";
        assertEquals(expectedResult, result);
    }

    @Test
    public void test_addingSpaces_2() {
        String result = add.addSpaces(testcaseInputTwo, testcaseSpacesTwo);
        String expectedResult = "i code in py thon";
        assertEquals(expectedResult, result);
    }

    @Test
    public void test_addingSpaces_3() {
        String result = add.addSpaces(testcaseInputThree, testcaseSpacesThree);
        String expectedResult = " s p a c i n g";
        assertEquals(expectedResult, result);
    }
}