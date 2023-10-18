class Solution {
    public String makeGood(String s) {
        Stack<Character> st = new Stack<>();
     int n= s.length();
     for(int i=0;i<n;i++)
     {
         if( !st.empty()&& (Character.toUpperCase(s.charAt(i))==st.peek() ||Character.toLowerCase(s.charAt(i))==st.peek())&&s.charAt(i)!=st.peek())
         {
             st.pop();
         }
         else
         {
             st.push(s.charAt(i));
         }
     }  
     char a []= new char[st.size()];
     n=st.size()-1;
     while(!st.empty())
     {
         a[n]=st.pop();
         n--;
     }
     return new String(a);
   

        
    }
}