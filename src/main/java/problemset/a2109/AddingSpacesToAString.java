package problemset.a2109;

public class AddingSpacesToAString {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder build = new StringBuilder();
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            int space = 0;
            if (j < spaces.length)
                space = spaces[j];
            if (space == i) {
                build.append(" ").append(s.charAt(i));
                j++;
            } else
                build.append(s.charAt(i));
        }
        return build.toString();
    }
}
