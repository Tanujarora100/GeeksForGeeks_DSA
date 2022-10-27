package Hashing;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class repeatedElements {

    static ArrayList<Integer> repeated(int[] arr) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        // Linked HashMap to Maintain the Order of the elements Compared to the Normal
        // Hashmap.
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                int freq = map.get(arr[i]);
                freq++;
                map.put(arr[i], freq);
            } else {
                map.put(arr[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() != 1)
                ans.add((Integer) entry.getKey());
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 9, 2, 3, 4, 8, 7, 7, 9, 11, 12, 11, 13, 13, 14 };
        ArrayList<Integer> ans = repeated(arr);
        System.out.println(ans);

    }
}
