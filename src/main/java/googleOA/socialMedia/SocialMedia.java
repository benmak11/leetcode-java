package googleOA.socialMedia;

import datastructures.Event;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SocialMedia {

    Map<String, Integer> categoryLimit =
            Map.of("USER_FOLLOW", 1, "TRENDING_TOPIC", 2, "DIRECT_MESSAGE", 5);
    public List<String> collapseEvents(List<Event> events) {
        List<String> res = new ArrayList<>();
        String previousCategory = null;
        int previousCategoryCount = 0;

        for (Event event : events) {
            if (event.getCategory().equals(previousCategory))
                previousCategoryCount++;
            else {
                if (previousCategory != null) {
                    if (categoryLimit.containsKey(previousCategory)) {
                        if (previousCategoryCount > categoryLimit.get(previousCategory)) {
                            String val = previousCategory + "(+" + String.valueOf(previousCategoryCount - 1) + " more)";
                            res.add(val);
                        } else {
                            for (int i = 0; i < previousCategoryCount; i++) {
                                res.add(previousCategory);
                            }
                        }
                    }
                }
                previousCategoryCount = 1;
            }
            previousCategory = event.getCategory();
            if (previousCategoryCount == 0) previousCategoryCount++;
        }

        return res;
    }
}
