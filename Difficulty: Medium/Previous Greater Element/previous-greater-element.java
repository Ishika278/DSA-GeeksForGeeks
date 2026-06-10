class Solution {
    public ArrayList<Integer> preGreaterEle(int[] arr) {
        
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;

        for(int i = 0 ; i < n; i++)
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

            stack.push(arr[i]);
          }

      
        return ans;
        
    }
}