package Hashing;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class sortByKeys {

    static ArrayList<Integer> repeat(int[] arr) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                int freq = map.get(arr[i]);
                freq++;
                map.put(arr[i], freq);
            } else {
                map.put(arr[i], 1);
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (Entry<Integer, Integer> entry : map.entrySet()) {
            ans.add(entry.getKey());
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 2, 8, 5, 6, 8, 8 };
        ArrayList<Integer> ans = repeat(arr);
        System.out.println(ans);
    }
}
