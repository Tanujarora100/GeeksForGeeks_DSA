package Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class find3Repeated {

    static ArrayList<Integer> repeated(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
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

        for (Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= (Integer) 3) {
                ans.add(entry.getKey());
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, 2, 3, 16, 3, 15, 16, 15, 15, 16, 2, 3 };
        int[] arr2 = { 2, 4, 3, 2, 3, 4, 5, 5, 3, 2, 2, 5 };
        ArrayList<Integer> ans = repeated(arr);
        ArrayList<Integer> ans2 = repeated(arr2);
        System.out.println(ans);
        System.out.println(ans2);
    }
}
