class Solution {
    int floorSqrt(int n) {
        if (n < 2) return n;

        int left = 1, right = n / 2;
        int ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (mid <= n / mid) {   // avoids overflow
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }
}