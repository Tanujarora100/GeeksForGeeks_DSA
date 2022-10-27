package Hashing;

import java.util.HashMap;
import java.util.Map;

public class findUnique {
/*Given an array of size n which contains all elements occurring in multiples of K,
  except one element which doesn't occur in multiple of K. Find that unique element.*/
 
    public static int Unique(int a[], int n, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // Unique ELement which is not a Multiple of K
        for (int i = 0; i < n; i++) {
            if (map.containsKey(a[i])) {
                int freq = map.get(a[i]);
                freq++;
                map.put(a[i], freq);
            } else {
                map.put(a[i], 1);
            }
        }
        int answer = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() % k != 0) {
                answer = (Integer) entry.getKey();
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 11, 11, 5, 10, 5, 5, 10, 10, 5, 10, 10, 11, 10, 10, 10, 5, 10, 5, 11, 10, 5, 11, 11, 10 };
        int size = arr.length;
        System.out.println(Unique(arr, size, 6));
    }
}
