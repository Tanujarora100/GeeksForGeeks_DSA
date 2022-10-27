package Hashing;

import java.util.HashMap;
import java.util.Map.Entry;

public class mostFrequent {

    static int frequent(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                int freq = map.get(arr[i]);
                freq++;
                map.put(arr[i], freq);
            } else {
                map.put(arr[i], 1);
            }
        }
        int count = 0, res = -1;
        for (Entry<Integer, Integer> val : map.entrySet()) {
            if (val.getKey() != -1) {
                if (count < val.getValue()) {
                    res = val.getKey();
                    count = val.getValue();
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 8, 3, 10, 1, 6, -1, 14, -1, -1, 4, 7, 13, -1, -1, -1, -1, -1, -1, -1 };
        // frequent(arr);
        System.out.println(frequent(arr));
    }
}
