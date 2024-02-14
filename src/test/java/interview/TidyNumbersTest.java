package interview;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TidyNumbersTest {

    private TidyNumbers coda;
    private List<Integer> testcases;

    @BeforeEach
    void setUp() {
        coda = new TidyNumbers();
        testcases = List.of(132, 1000, 7);
    }

    @Test
    void lastTidyNumber() {
        List<Integer> expectedResult = List.of(129, 999, 7);

        for (int i = 0; i < testcases.size(); i++) {
            int actualResult = coda.getTidyNumber(testcases.get(i));
            assertEquals(expectedResult.get(i), actualResult);
        }
    }
}