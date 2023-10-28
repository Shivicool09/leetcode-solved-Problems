class Solution {
    public boolean predictTheWinner(int[] nums) {
        if(nums.length<=2){
            return true;
        }    
        return h(nums,0,nums.length-1,0,0,0);
    }
    public boolean h(int[] nums,int start,int end,int p1, int p2,int ifp1){
        if(start==end){
           if(ifp1==0){
               p1+=nums[start];
           }else{
               p2+=nums[start];
           }
           return p1>=p2;
        } 
        if(ifp1==0){
           boolean check1 = h(nums,start+1,end,p1+nums[start],p2,1);     
           boolean check2 = h(nums,start,end-1,p1+nums[end],p2,1);
           return check1 || check2;
        }else{
            boolean check1 = h(nums,start+1,end,p1,p2+nums[start],0);
            boolean check2 = h(nums,start,end-1,p1,p2+nums[end],0);    
            return check1 && check2;  
        }
    }
}