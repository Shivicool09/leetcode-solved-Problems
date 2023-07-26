class Solution {
    public int integerBreak(int n) {
        int[] arr=new int[7];
        int ans=0;
        arr[2]=1; arr[3]=2;  arr[4]=4; arr[5]=6;arr[6]=9;
        if(n<=6) return arr[n];
        int third=4,second=6,first=9;
        for(int i=7;i<=n;i++){
            int temp=first;
             first=ans;
             ans=3*third;
            third=second;
            second=temp;
            first=ans;
          }
        return ans;
        
    }
}