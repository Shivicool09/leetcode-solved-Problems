/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNodes(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        ListNode temp = head;
        while(temp != null){
            arr.add(temp.val);
            temp = temp.next;
        }
        int max = Integer.MIN_VALUE;
        for(int i = arr.size()-1; i >= 0; i--){
            if(arr.get(i) >= max){
                ans.add(arr.get(i));
                max = arr.get(i);
            }
           
        }
        Collections.reverse(ans);
        ListNode ptr = new ListNode(ans.get(0));
        ListNode curr = ptr;
        for(int i = 1; i < ans.size(); i++){
            curr.next = new ListNode(ans.get(i));
            curr = curr.next;
        }
        return ptr;
    }
}