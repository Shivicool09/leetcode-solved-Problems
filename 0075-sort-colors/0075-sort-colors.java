class Solution {
    public void sortColors(int[] nums) {
      int[] counts = new int[3];

        for (int i = 0; i < nums.length; i++) {
            counts[nums[i]]++;
        }
        
            for(int i = 0; i< nums.length; i++){
                if(counts[0] > i){
                    nums[i] = 0;
                }
                else if(counts[0]+counts[1] > i){
                    nums[i] = 1;
                }else{
                    nums[i] = 2;
                }
                 
            }
    }
        
}