class Solution {
      public int dayOfYear(String date) {
        int year = Integer.parseInt(date.substring(0,4));
        int month = Integer.parseInt(date.substring(5,7));
        int day = Integer.parseInt(date.substring(8,10));

        
        int sum =0;

        if(year!=1900 && year%4==0 && month>2) sum+=1;
        for(int i = 1;i<7;i++){
            if(i==month) break;
            if(i==2) sum+=28;
            else if(i%2!=0) sum+=31;
            else sum+=30;
        }
        for(int i=7;i<month;i++){
            if(i==7) sum+=31;
            else if(i%2==0) sum+=31;
            else sum+=30;
        }
        
        return sum+day;
    }
}