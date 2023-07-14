class Solution {
    public int numPrimeArrangements(int n) {
        int count=countPrimes(n);
        long result=factorial(count) * factorial(n-count) % 1000000007;
        return (int) result;
        
    }
    private int countPrimes(int n){
        int count=0;
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                count++;
            }
        }
        return count;
    }
    private boolean isPrime(int num){
        if(num < 2){
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num % i == 0){
                return false; 
            }
        }
        return true;
    }
    private long factorial(int n){
        long result = 1;
        for(int i=2; i<=n;i++){
            result=(result*i) % 1000000007;
        }
        return result;
    }
}