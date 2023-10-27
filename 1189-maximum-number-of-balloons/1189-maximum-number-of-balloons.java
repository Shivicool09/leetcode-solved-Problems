class Solution {
    public int maxNumberOfBalloons(String s) {
         int n1=s.length();
        int b=0,o=0,l=0,n=0,t=0,a=0;
        for(int i=0;i<n1;i++){
            char c=s.charAt(i);
            if('b'==c){
                 b++;
            }
            if('o'==c)
                 o++;
             if('a'==c)
                 a++;     
            if('l'==c)
                 l++;
            if('n'==c)
                 n++;  
            if(b>=1 && o>=2 && n>=1 && l>=2 && a>=1)  {
                   t++;
                   b=b-1;o=o-2;l=l-2;n=n-1;a=a-1;
            }   

        }
       return t;
        
    }
}