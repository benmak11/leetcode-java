package problemset.a3163;

public class StringCompressionIII {

    public String compressString(String word) {
        StringBuilder res = new StringBuilder();
        int pos = 0;

        while (pos < word.length()) {
            char curr = word.charAt(pos);
            int cntr = 0;

            while (pos < word.length() && cntr < 9 && curr == word.charAt(pos)) {
                pos++;
                cntr++;
            }
            res.append(cntr).append(curr);
        }

        return res.toString();
    }
}
