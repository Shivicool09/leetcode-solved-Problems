class Solution {
    public String predictPartyVictory(String senate) {
           Queue<Character> queue = new LinkedList<>();

        for (int i = 0; i < senate.length(); i++) {
            queue.add(senate.charAt(i));
        }
        boolean isAllSameSenate = false;
        int skipD = 0;
        int skipR = 0;
        while (!isAllSameSenate) {


            int i = 0;
            int len = queue.size();

            while (i < len) {
                if (queue.peek() == 'R') {
                    queue.remove();
                    if (skipR > 0) {
                        skipR--;
                    } else {
                        skipD++;
                        queue.add('R');
                    }
                } else {
                    queue.remove();
                    if (skipD > 0) {
                        skipD--;
                    } else {
                        skipR++;
                        queue.add('D');
                    }
                }
                i++;
            }
            if(len == queue.size()){
                isAllSameSenate = true;
            }
        }
    
        char ch = queue.remove();
        if (ch == 'R') {
            return "Radiant";
        } else {
            return "Dire";
        
    }
    }
}