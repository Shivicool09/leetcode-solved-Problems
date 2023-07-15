class Solution {
    public boolean detectCapitalUse(String word) {
        int n=word.length();
        boolean case1=true,case2=true,case3=true;
        
        
        for(int i=0;i<n;i++){
            if(!Character.isUpperCase(word.charAt(i))){
                 case1= false;
                break;
            }
        }
            if(case1){
                return true;
            }
        
        for(int i=0;i<n;i++){
        
        
         if(!Character.isLowerCase(word.charAt(i))){
            case2= false;
             break;
        }
        }
        
            if(case2){
        return true;
            }
        
        
            if(!Character.isUpperCase(word.charAt(0))){
                case3=false;
            }
            if(case3){
                for(int i=1;i<n;i++){
                    if(!Character.isLowerCase(word.charAt(i))){
                        case3=false;
                        break;
                    }
                }
      
            }
        if(case3){
            return true;
        }
        return false;
    }
}