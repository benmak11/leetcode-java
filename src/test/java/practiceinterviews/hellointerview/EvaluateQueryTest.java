package practiceinterviews.hellointerview;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvaluateQueryTest {

    EvaluateQuery eval;
    String queryOne;
    int queryOneX;
    String queryTwo;
    int queryTwoX;

    @BeforeEach
    void setUp() {
        eval = new EvaluateQuery();
        queryOne = "(((X < 3) or (X > 1)) and (X < 10)))";
        queryOneX = 2;
        queryTwo = "";
        queryTwoX = 4;
    }

    @Test
    void test_evaluateQueryOne() {
        boolean result = eval.evaluateQueryString(queryOne, queryOneX);
        assertTrue(result);
    }

    @Test
    void test_evaluateQueryTwo() {
    }
}