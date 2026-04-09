class Solution {
    
    static void reverse(int arr[], int l, int r) {
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
    
    static void rotateArr(int arr[], int d) {
        int n = arr.length;
        d = d % n;  // if you skip this, expect wrong answers
        
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
    }
}