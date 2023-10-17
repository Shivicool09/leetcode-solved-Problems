class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int scount1=0;
        int scount0=0;
        
        for(int i = 0 ; i< students.length ; i++){
            if(students[i]==1){
                scount1++;
            }else{
                scount0++;
            }
        }
        for(int i = 0 ; i< sandwiches.length ; i++){
            if(sandwiches[i]==1){
                if(scount1==0){
                    return scount0;
                }
                scount1--;
            }else{
                if(scount0==0){
                    return scount1;
                }
                scount0--;
            }
        }

    return 0;
        
    }
}