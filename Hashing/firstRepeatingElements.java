package Hashing;

import java.util.HashMap;
import java.util.Map;

public class firstRepeatingElement {

    static int repeatElement(int[] arr) {
        // int repeat = 0;
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
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            count++;
            if (entry.getValue() != (Integer) 1) {
                return count;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 4, 5, 5, 6 };
        System.out.println(repeatElement(arr));
    }
}
