class Solution {
    
    public int minTime(int[] arr, int k) {
        int low = 0, high = 0;
        
        for (int x : arr) {
            low = Math.max(low, x); // max board
            high += x;              // total sum
        }
        
        int ans = high;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (canPaint(arr, k, mid)) {
                ans = mid;
                high = mid - 1; // try smaller
            } else {
                low = mid + 1;
            }
        }
        
        return ans;
    }
    
    private boolean canPaint(int[] arr, int k, int maxTime) {
        int painters = 1;
        int current = 0;
        
        for (int x : arr) {
            if (current + x <= maxTime) {
                current += x;
            } else {
                painters++;
                current = x;
                
                if (painters > k) return false;
            }
        }
        
        return true;
    }
}