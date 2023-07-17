class Solution {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }
        
        return powoptimized(x, n);
    }
    
    public double powoptimized(double x, int n) {
        if (n == 0) {
            return 1;
        }
        
        double halfPow = powoptimized(x, n / 2);
        double result = halfPow * halfPow;
        
        if (n % 2 != 0) {
            result *= x;
        }
        
        return result;
    }
}
