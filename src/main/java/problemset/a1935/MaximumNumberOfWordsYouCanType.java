package problemset.a1935;

public class MaximumNumberOfWordsYouCanType {
    public int canBeTypedWords(String text, String brokenLetters) {
        boolean[] isBroken = new boolean[26];
        for (char c : brokenLetters.toCharArray())
            isBroken[c - 'a'] = true;

        int cnt = 0;

        for (String word : text.split(" ")) {
            boolean canType = true;
            for (char c : word.toCharArray()) {
                if (isBroken[c - 'a']) {
                    canType = false;
                    break;
                }
            }
            if (canType)
                cnt++;
        }
        
        return cnt;
    }
}
