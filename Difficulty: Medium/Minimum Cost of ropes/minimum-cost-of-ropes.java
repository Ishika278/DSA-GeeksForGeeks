class Solution {
    public static int minCost(int[] arr) {
        // code here
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int rope : arr)
        {
            pq.offer(rope);
        }
        int cost = 0;
        while(pq.size() > 1)
        {
            int first = pq.poll();
            int second = pq.poll();
            int Bigr = first + second;
            
            cost = Bigr + cost;
            pq.offer(Bigr);
        }
        return cost;
    }
}