import java.util.ArrayList;
import java.util.List;

class Solution {
    private List<Integer> res; 
    
    public List<Integer> pancakeSort(int[] arr) {
        res = new ArrayList<>();
        sort(arr, arr.length);
        return res;
    }

    private void sort(int[] arr, int n) {
        if (n == 1) return;
        for (int i = 0; i < n; i++) {
            if (arr[i] == n) {
                reverse(arr, i + 1);
                reverse(arr, n);
                res.add(i + 1);
                res.add(n);
            }
        }

        sort(arr, n - 1);
    }

    private void reverse(int[] arr, int k) {
        int l = 0, r = k - 1;
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
}
