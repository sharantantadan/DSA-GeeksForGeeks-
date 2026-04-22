import java.util.Arrays;

class Solution {
    public int findMinDiff(int arr[], int m) {
        if (m == 0 || arr.length == 0) return 0;
        
        Arrays.sort(arr);
        
        int minDiff = Integer.MAX_VALUE;
        
        for (int i = 0; i + m - 1 < arr.length; i++) {
            int diff = arr[i + m - 1] - arr[i];
            minDiff = Math.min(minDiff, diff);
        }
        
        return minDiff;
    }
}
