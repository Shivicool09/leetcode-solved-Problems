class Solution {
    public int superPow(int a, int[] b) {
          long base =a;
        int m=1337;
        long power=0;
        for(int i=0;i<b.length;i++){
            power=(power*10+b[i]);
            if(power==1140){
                continue;
            }
            power=power%1140;

        }
         

          long ans = 1;

        while (power > 0) {
            if ((power & 1) == 1) {
                ans =(ans*(base))%m;
                
            }

            
            base=((base)*(base))%m;
            power = power >> 1;
        }
return(int) ans;
        
    }
}