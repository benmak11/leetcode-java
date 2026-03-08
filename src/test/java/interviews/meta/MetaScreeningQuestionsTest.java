package interviews.meta;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MetaScreeningQuestionsTest {

    MetaScreeningQuestions metaScreeningQuestions;
    String cwd, cwd2, cwd3, cwd4, cwd5;
    String cd, cd2, cd3, cd4, cd5;

    @BeforeEach
    void setUp() {
        metaScreeningQuestions = new MetaScreeningQuestions();

        cwd = "/a/b/c";
        cd = "../d/./e";
        cwd2 = "/";
        cd2 = "foo";
        cwd3 = "/foo/bar";
        cd3 = "../";
        cwd4 = "/foo/bar";
        cd4 = "../p./";
        cwd5 = "/foo/bar/p";
        cd5 = "../../../../";
    }

    @Test
    void test_resolvePath_one() {
        String expected = "/a/b/d/e";
        String actual = metaScreeningQuestions.resolvePath(cwd, cd);
        assertEquals(expected, actual);
    }

    @Test
    void test_resolvePath_two() {
        String expected = "/foo";
        String actual = metaScreeningQuestions.resolvePath(cwd2, cd2);
        assertEquals(expected, actual);
    }

    @Test
    void test_resolvePath_three() {
        String expected = "/foo";
        String actual = metaScreeningQuestions.resolvePath(cwd3, cd3);
        assertEquals(expected, actual);
    }

    @Test
    void test_resolvePath_four() {
        String expected = "/foo/p.";
        String actual = metaScreeningQuestions.resolvePath(cwd4, cd4);
        assertEquals(expected, actual);
    }

    @Test
    void test_resolvePath_five() {
        String expected = "/";
        String actual = metaScreeningQuestions.resolvePath(cwd5, cd5);
        assertEquals(expected, actual);
    }

    @Test
    void test_resolvePath2_one() {
        String expected = "/a/b/d/e";
        String actual = metaScreeningQuestions.resolvePath2(cwd, cd);
        assertEquals(expected, actual);
    }

    @Test
    void test_resolvePath2_two() {
        String expected = "/";
        String actual = metaScreeningQuestions.resolvePath2(cwd5, cd5);
        assertEquals(expected, actual);
    }
}