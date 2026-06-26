class Solution {
    static ArrayList<Integer> nextGreatest(int arr[]) {
        // code here
        int n = arr.length;
        ArrayList<Integer> num = new ArrayList<>();
    
        int max = -1;
        for(int i = n - 1; i >= 0; i--)
        {
            int curr = arr[i];
            num.add(max);
            
            if(curr > max)
            {
                max = curr;
            }
        }
        Collections.reverse(num);
        return num;
        
    }
}