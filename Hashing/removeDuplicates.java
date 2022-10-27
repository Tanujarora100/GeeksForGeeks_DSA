package Hashing;

import java.util.ArrayList;
import java.util.HashMap;

public class removeDuplicates {

    public static ArrayList<Integer> brute(int[] arr) {
        ArrayList<Integer> output = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (!output.contains(arr[i])) {
                    if (arr[i] == arr[j]) {
                        output.add(arr[j]);
                    }
                }
            }
        }
        return output;
    }

    public static ArrayList<Integer> optimised(int[] arr) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                continue;
            } else {
                map.put(arr[i], true);
                ans.add(arr[i]);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 1, 1, 1, 2, 2, 3, 3, 4, 5, 6, 7, 7, 7, 9, 7, 10, 11, 10, 11, 11 };
        ArrayList<Integer> ans = optimised(arr);
        System.out.println(ans);
        ArrayList<Integer> brute = brute(arr);
        System.out.println(brute);

    }

}
