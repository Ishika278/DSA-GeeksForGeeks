class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        for(int i = n - 1; i >= 0; i--)
        {
            if(stack.isEmpty())
            {
                //ans[i] = -1;
                ans.add(-1);
            }
            else if(!stack.isEmpty() && stack.peek() > arr[i])
            {
                 ans.add(stack.peek());
                //ans[i] = stack.peek();
            }
            else if(!stack.isEmpty() && stack.peek() <= arr[i])
            {
                while(!stack.isEmpty() && stack.peek() <= arr[i])
                {
                    stack.pop();
                }
                //stack empty hogya
                if(stack.isEmpty())
                {
                    ans.add(-1);
                    //ans[i] = -1;
                }
                //stack.peek() value arr[i] is bade value h
                else
                {
                     ans.add(stack.peek());
                    //ans[i]= stack.peek();
                }
                // stack.push(arr[i]);
            }
            stack.push(arr[i]);
        }
        Collections.reverse(ans);
        
        return ans;
    }
}