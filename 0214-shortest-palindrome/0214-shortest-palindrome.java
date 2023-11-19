class Solution {
    public String shortestPalindrome(String s) {
        int n=s.length();
        int max=n-1;
        for(int i=n-1;i>=0;i--){
            if(helper(s,0,i)){
                max=i;
                break;
            }
        }
        String s1=reverse(s.substring(max+1));
        return s1+s;
    }
    
    public boolean helper(String s, int st, int end){
        while(st<end){
            if(s.charAt(st++)!=s.charAt(end--))return false;
        }
        return true;
    }

    public String reverse(String s){
        int n=s.length();
        char[] arr=s.toCharArray();
        int st=0,end=n-1;
        while(st<end){
            char temp=arr[st];
            arr[st]=arr[end];
            arr[end]=temp;
            st++;
            end--;
        }
        return new String(arr);
    }
}