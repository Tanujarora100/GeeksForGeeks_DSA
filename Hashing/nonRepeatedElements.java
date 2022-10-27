package Hashing;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class nonRepeated {
    static ArrayList<Integer> nonRepeat(int[] arr, int n) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                int freq = map.get(arr[i]);
                freq++;
                map.put(arr[i], freq);
            } else {
                map.put(arr[i], 1);
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                ans.add((Integer) entry.getKey());
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 3, 4, 4, 5, 7, 6, 11, 12, 11, 13, 14, 15, 17, 17, 18, 19, 18, 20, 21, 22, 20 };
        int n = arr.length;
        ArrayList<Integer> fin = nonRepeat(arr, n);
        System.out.println(fin);
    }
}
