package problemset.a0692;

import java.util.*;

public class TopKFrequentWords {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> wordCount = new HashMap<>();
        for (String w : words) {
            wordCount.put(w, wordCount.getOrDefault(w, 0) + 1);
        }
        List<String> res = new ArrayList(wordCount.keySet());
        Collections.sort(res, (w1, w2) -> wordCount.get(w1).equals(wordCount.get(w2)) ?
                w1.compareTo(w2) : wordCount.get(w2) - wordCount.get(w1));

        return res.subList(0, k);
    }
}
