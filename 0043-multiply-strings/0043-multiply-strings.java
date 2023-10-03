class Solution {
    public String multiply(String num1, String num2) {
         if(num1.charAt(0) == '0' || num2.charAt(0) == '0') {
            return "0";
        }

        int[] result = new int[num1.length() + num2.length()];
        for(int i=num2.length()-1; i >= 0; i--) {
            for(int j=num1.length()-1; j >= 0; j--) {
                int product = Character.getNumericValue(num1.charAt(j)) * Character.getNumericValue(num2.charAt(i));
                int sum = product + result[i+j+1];
                result[i+j+1] = sum % 10;
                result[i+j] += sum / 10;
            }
        }

        StringBuilder res = new StringBuilder();
        for(int val: result) {
            if(!(res.length() == 0 && val == 0)) {  
                res.append(val);
            }
        }

        return res.toString();
        
    }
}