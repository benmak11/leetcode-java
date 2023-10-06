package datastructures;

public class Event {

    int timestamp;
    String category;
    String displayTest;

    public Event(int timestamp, String category, String displayTest) {
        this.timestamp = timestamp;
        this.category = category;
        this.displayTest = displayTest;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDisplayTest() {
        return displayTest;
    }

    public void setDisplayTest(String displayTest) {
        this.displayTest = displayTest;
    }
}
