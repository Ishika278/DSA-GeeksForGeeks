class Solution {
    public int kthSmallest(int[] arr, int k) {
        // Code here
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int num : arr)
        {
            pq.offer(num);
            if(pq.size() > k)
            {
                pq.poll();
            }
        }
        return pq.peek();
    }
}
