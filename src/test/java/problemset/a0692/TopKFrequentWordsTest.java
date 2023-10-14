package problemset.a0692;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TopKFrequentWordsTest {

    private TopKFrequentWords tk;

    private String[] testcaseOne;
    private String[] testcaseTwo;

    @BeforeEach
    void setUp() {
        tk = new TopKFrequentWords();
        testcaseOne = new String[]{"i","love","leetcode","i","love","coding"};
        testcaseTwo = new String[]{"the","day","is","sunny","the","the","the","sunny","is","is"};
    }

    @Test
    void test_topKFrequent() {
        List<String> expectedResult = List.of("i", "love");
        List<String> actualResult = tk.topKFrequent(testcaseOne, 2);
        for (int i = 0; i < actualResult.size(); i++) {
            assertEquals(expectedResult.get(i), actualResult.get(i));
        }
    }

    @Test
    void test_topKFrequent_v2() {
        List<String> expectedResult = List.of("the", "is", "sunny", "day");
        List<String> actualResult = tk.topKFrequent(testcaseTwo, 4);
        for (int i = 0; i < actualResult.size(); i++) {
            assertEquals(expectedResult.get(i), actualResult.get(i));
        }
    }
}