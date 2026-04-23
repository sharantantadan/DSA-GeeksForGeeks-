class Solution {
    // Function to find starting and end index
    static int[] findIndex(int arr[], int key) {
        int first = -1, last = -1;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                if (first == -1) {
                    first = i;
                }
                last = i;
            }
        }
        
        return new int[]{first, last};
    }
}