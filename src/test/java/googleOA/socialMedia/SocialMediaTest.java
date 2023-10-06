package googleOA.socialMedia;

import datastructures.Event;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SocialMediaTest {

    private SocialMedia socialMedia;

    private List<Event> testcase = new ArrayList<>();

    @BeforeEach
    void setUp() {
        socialMedia = new SocialMedia();
        Event first = new Event(1, "USER_FOLLOW", "");
        Event sec = new Event(1, "USER_FOLLOW", "");
        Event third = new Event(1, "TRENDING_TOPIC", "");
        Event fourth = new Event(1, "TRENDING_TOPIC", "");
        Event fifth = new Event(1, "TRENDING_TOPIC", "");
        Event sixth = new Event(1, "TRENDING_TOPIC", "");
        Event seventh = new Event(1, "TRENDING_TOPIC", "");
        Event eighth = new Event(1, "TRENDING_TOPIC", "");
        Event nineth = new Event(1, "TRENDING_TOPIC", "");
        Event tenth = new Event(1, "DIRECT_MESSAGE", "");
        Event eleventh = new Event(1, "DIRECT_MESSAGE", "");
        Event twelveth = new Event(1, "DIRECT_MESSAGE", "");
        Event thirteenth = new Event(1, "DIRECT_MESSAGE", "");
        Event fourteenth = new Event(1, "DIRECT_MESSAGE", "");
        Event fifteenth = new Event(1, "DIRECT_MESSAGE", "");
        Event sixteenth = new Event(1, "TRENDING_TOPIC", "");

        testcase = List.of(first, sec, third, fourth, fifth, sixth, seventh, eighth,
                nineth, tenth, eleventh, twelveth, thirteenth, fourteenth, fifteenth, sixteenth);
    }

    @Test
    void collapseEvents() {
        List<String> expectedResult = List.of(
                "USER_FOLLOW",
                "USER_FOLLOW",
                "TRENDING_TOPIC (+6 more)",
                "DIRECT_MESSAGE (+5 more)",
                "TRENDING_TOPIC"
        );

        List<String> actualResult = socialMedia.collapseEvents(testcase);
        for (int i = 0; i < actualResult.size(); i++) {
            assertEquals(expectedResult.get(i), actualResult.get(i));
        }
    }
}