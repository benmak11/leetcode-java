package problemset.a1957;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeleteCharactersToMakeFancyStringTest {

    private DeleteCharactersToMakeFancyString delete;
    String test1;
    String test2;
    String test3;

    @BeforeEach
    void setUp() {
        delete = new DeleteCharactersToMakeFancyString();
        test1 = "leeetcode";
        test2 = "aaabaaaa";
        test3 = "aab";
    }

    @Test
    void test_makeFancyString1() {
        String result = delete.makeFancyString(test1), expectedResult = "leetcode";
        assertEquals(expectedResult, result);
    }

    @Test
    void test_makeFancyString2() {
        String result = delete.makeFancyString(test2), expectedResult = "aabaa";
        assertEquals(expectedResult, result);
    }

    @Test
    void test_makeFancyString3() {
        String result = delete.makeFancyString(test3), expectedResult = "aab";
        assertEquals(expectedResult, result);
    }
}