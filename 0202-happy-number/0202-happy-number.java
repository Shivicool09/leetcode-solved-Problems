class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer>set=new HashSet<>();
        while(!set.contains(n)){
            set.add(n);
            int add=0;
            while(n!=0){
                int ans= n % 10;
                add+=ans*ans;
                n=n/10;
            }
            n=add;
            
        }
        return n==1;
    }
}