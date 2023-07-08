class Solution {
    public int lastRemaining(int n) {
        int left = 1, step = 1, remaining = n;
        boolean isLeftToRight = true;
        while (remaining > 1) {
            if (isLeftToRight || remaining % 2 == 1) {
                left += step;
            }
            step *= 2;
            remaining /= 2;
            isLeftToRight = !isLeftToRight;
        }
        return left;
    }
}
        
