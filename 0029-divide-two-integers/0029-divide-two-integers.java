class Solution {
    public int divide(int dividend, int divisor) {
         if(dividend < 0 && divisor < 0){
            return (int) Math.abs(Math.floor(dividend / divisor));
        }else {
            return (int) Math.floor(dividend / divisor);
        }
        
    }
}