package Hashing;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class firstElementtoOccurKtimes {

    public int firstElementKTime(int[] a, int n, int k) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
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

        for (Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == (Integer) k) {
                answer = (Integer) entry.getKey();
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        firstElementtoOccurKtimes obj = new firstElementtoOccurKtimes();
        int ans[] = { 1, 7, 4, 3, 4, 8, 7 };
        int size = ans.length;
        System.out.println(obj.firstElementKTime(ans, size, 2));

    }
}
