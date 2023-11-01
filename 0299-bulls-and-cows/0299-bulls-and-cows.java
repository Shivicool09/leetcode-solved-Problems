class Solution {
    public String getHint(String secret, String guess) {
          int bCount=0,cCount=0;
        List <Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        int [][] temp=new int [2][10];
        for(int i=0;i<secret.length();i++)
        {
            if(secret.charAt(i)==guess.charAt(i))
            {
                bCount++;
            }
            else
            {
                l1.add(secret.charAt(i)-'0');
                l2.add(guess.charAt(i)-'0');
            }
        }
        for(int i=0;i<l1.size() && i<l2.size();i++)
        {
            temp[0][l1.get(i)]++;
            temp[1][l2.get(i)]++;
        }
        for(int i=0;i<10;i++)
        {
            if(temp[0][i]!=0 && temp[1][i]!=0)
            {
                cCount=cCount+Math.min(temp[0][i],temp[1][i]);
            }
        }
        return bCount+"A"+cCount+"B";
        
    }
}