class Solution {
    public int evalRPN(String[] tokens) {
         Stack<Integer> stack = new Stack<>();
        for(String x:tokens){
            if(x.equals("+") ||x.equals("-") || x.equals("*") || x.equals("/")){
                int temp =stack.pop();
                int temp1=stack.pop();
                int result=0;
               if(x.equals("+")){
                   result=temp+temp1;
               }
               else if(x.equals("-")){
                   result=temp1-temp;
               }
               else if(x.equals("*")){
                   result=temp1*temp;
               }
               else{
                   result=temp1/temp;
               }
                stack.add(result);
            }
           
        
        else{
            stack.add(Integer.parseInt(x));
        }
        }
        return stack.pop();
        
    }
}