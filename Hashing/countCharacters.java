package Hashing;

import java.util.HashMap;
import java.util.Map;
//Given a string S. Count the characters that have ‘N’ number of occurrences. If a character appears consecutively it is counted as 1 occurrence.
public class countCharacters {

    static int getCount(String S, int N) {
        char[] ch = S.toCharArray();
      //Converting to a Character Array so that we can access i-1 Index to Compare and Put a Check.
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < ch.length; i++) {
            if (map.containsKey(ch[i])) {
                int freq = map.get(ch[i]);
                if (ch[i - 1] != ch[i]) {
                    freq++;
                    //Checking to make sure that adjacent Elements are only counted once and not twice.
                }
                map.put(ch[i], freq);

            } else {
                map.put(ch[i], 1);
            }
        }
        int count = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == N) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(getCount("geeksforgeeks", 2));
    }
}
