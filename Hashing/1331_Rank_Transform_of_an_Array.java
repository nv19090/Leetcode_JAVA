import java.util.*;

class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;

        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            array.add(arr[i]);
        }

        Collections.sort(array);

        HashMap<Integer, Integer> mp = new HashMap<>();

        int rank = 1;

for (int i = 0; i < n; i++) {
    if (!mp.containsKey(array.get(i))) {
        mp.put(array.get(i), rank);
        rank++;
    }
}

        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = mp.get(arr[i]);
        }

        return ans;
    }
}
