class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int[] table = new int[nums.length];
        int[] hash = new int[nums.length];

        Arrays.sort(nums);
        for(int i=0;i<table.length;i++){
            table[i] = 1;
        }

        for(int i=0;i<hash.length;i++){
            hash[i] = i;
        }

        int max = table[0];
        int lastIndex = 0;
        for(int i=1; i<nums.length; i++){
            for(int j=0; j<i; j++){
                if((nums[i] % nums[j] == 0) && table[j]+1 > table[i]){
                    table[i] = table[j] + 1;
                    hash[i] = j;
                }
            }
            if(table[i] > max){
                max = table[i];
                lastIndex = i;
            }
        }

        List<Integer> lds = new ArrayList<>();
        lds.add(nums[lastIndex]);
        while(hash[lastIndex] != lastIndex){
            lastIndex = hash[lastIndex];
            lds.add(nums[lastIndex]);
        }

        return lds;
    }
}