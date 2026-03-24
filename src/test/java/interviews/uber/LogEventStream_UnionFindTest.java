package interviews.uber;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LogEventStream_UnionFindTest {

    private LogEventStream_UnionFind unionFind;
    String[] logEvents;
    int numRiders;

    @BeforeEach
    void setUp() {
        unionFind = new LogEventStream_UnionFind();

        logEvents = new String[]
                        { "1670000001 Alice shared-ride-with Bob",
                                "1670000042 Charlie shared-ride-with Dan",
                                    "1670000450 Bob shared-ride-with Charlie",
                                        "1670000501 Alice shared-ride-with Eve",
                                            "1670000621 Bob shared-ride-with Dan" };
        numRiders = 5;
    }

    @Test
    void test_findConnectedTimestamp() {
        String result = unionFind.findConnectedTimestamp(logEvents, numRiders);
        assertEquals("1670000501", result);
    }
}