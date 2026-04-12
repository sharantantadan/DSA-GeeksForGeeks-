class Solution {
    ArrayList<Integer> find(int arr[], int x) {
        ArrayList<Integer> res = new ArrayList<>();
        
        int first = firstOcc(arr, x);
        int last = lastOcc(arr, x);
        
        res.add(first);
        res.add(last);
        
        return res;
    }
    
    int firstOcc(int[] arr, int x) {
        int left = 0, right = arr.length - 1;
        int ans = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == x) {
                ans = mid;
                right = mid - 1;
            } else if (arr[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }
    
    int lastOcc(int[] arr, int x) {
        int left = 0, right = arr.length - 1;
        int ans = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == x) {
                ans = mid;
                left = mid + 1;
            } else if (arr[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }
}