package Hashing;


import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class repeatedCharacter {
    static char repeatElement(String str) {

        char repeat;
        char hello = 'n';
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {

            if (map.containsKey(str.charAt(i))) {
                int freq = map.get(str.charAt(i));
                freq++;
                map.put(str.charAt(i), freq);
            } else {
                map.put(str.charAt(i), 1);
            }
        }

        for (Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() != (Integer) 1) {
                repeat = entry.getKey();
                return repeat;
            }
        }
        return hello;
    }

    public static void main(String[] args) {
        String str = "TANUJJ";
        System.out.println(repeatElement(str));
    }
}
