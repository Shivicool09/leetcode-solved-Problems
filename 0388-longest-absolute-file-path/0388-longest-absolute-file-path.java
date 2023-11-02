class Solution {
    public int lengthLongestPath(String input) {
       String []file=input.split("\n");
       int longl=0;
       int curl=0;
       Stack<Integer>stack=new   Stack<>(); 
        for(String s:file){
            int level=0;
            boolean isFile=false;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='\t')level++;
                else if(s.charAt(i)=='.')isFile=true;
            }
            while (stack.size() > level) {
                curl -= stack.pop();
            }
            int items=s.length()-level+1;
            curl+=items;
            if(isFile){
                if(curl-1>longl){
                    longl=curl-1;
                }
            }  

            stack.add(items);
       }
    return longl;    
    }
}