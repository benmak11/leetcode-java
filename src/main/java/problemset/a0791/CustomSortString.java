package problemset.a0791;

public class CustomSortString {

    public String customSortString(String order, String s) {
        int[] count = new int[26];
        for (char c : s.toCharArray())
            count[c - 'a']++;

        StringBuilder res = new StringBuilder();
        for (char c : order.toCharArray()) {
            while (count[c - 'a']-- > 0)
                res.append(c);
        }

        for (char c = 'a'; c <= 'z'; c++) {
            while (count[c - 'a']-- > 0)
                res.append(c);
        }

        return res.toString();
    }
}
