package problemset.a2785;

import java.util.*;

public class SortVowelsInString {

    private Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');

    public String sortVowels(String s) {
        char[] charArray = s.toCharArray();
        List<Character> vowelList = new ArrayList<>();
        for (char c : charArray) {
            if (vowels.contains(Character.toLowerCase(c))) {
                vowelList.add(c);
            }
        }

        Collections.sort(vowelList);
        int index = 0;

        for (int i = 0; i < charArray.length; i++) {
            char curr = Character.toLowerCase(charArray[i]);
            if (vowels.contains(curr))
                charArray[i] = vowelList.get(index++);
        }
        return new String(charArray);
    }
}
