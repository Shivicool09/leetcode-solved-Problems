class Solution {
    public int[] constructRectangle(int a) {
        int x=(int)Math.sqrt(a);
        int b[]= new int[2];
        for(int i=x;i>0;i--){
            int n=i;
            if(a%n==0){
                b[0]=a/n;
                b[1]=n;
                
                break;
            }
        }
        return b;
        
    }
}