class Solution {
    public void nearlySorted(int[] arr, int k) {
        // code here
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        int i = 0;
        for(int num : arr)
        {
            pq.offer(num);
            if(pq.size() > k)
            {
                arr[i++] = pq.poll();
            }
        }
            while(!pq.isEmpty())
            {
                arr[i++] = pq.poll();
            }
    
        return ;
    }
}
