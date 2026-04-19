import java.util.*;

class Solution {
    // Function to return kth largest element from an array.
    public static int KthLargest(int arr[], int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : arr) {
            pq.add(num);
            if (pq.size() > k) {
                pq.poll();
            }
        }

        return pq.peek();
    }
}