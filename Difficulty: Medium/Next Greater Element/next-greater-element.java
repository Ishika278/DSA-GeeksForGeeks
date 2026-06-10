class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr){
        // code here
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        for(int i = n - 1; i >= 0; i--)
        {
            if(stack.isEmpty())
            {
                ans.add(-1);
            }
            else if(!stack.isEmpty() && stack.peek() > arr[i])
            {
                 ans.add(stack.peek());
            }
            else if(!stack.isEmpty() && stack.peek() <= arr[i])
            {
                while(!stack.isEmpty() && stack.peek() <= arr[i])
                {
                    stack.pop();
                }
            
                if(stack.isEmpty())
                {
                    ans.add(-1);
            
                }
                else
                {
                     ans.add(stack.peek());
        
                }
                
            }
            stack.push(arr[i]);
        }
        Collections.reverse(ans);
        
        return ans;
    }
}