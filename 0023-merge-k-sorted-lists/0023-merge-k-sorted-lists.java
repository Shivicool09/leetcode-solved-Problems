


class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
     final ListNode head = new ListNode();
        ListNode curr = head;
        int n=lists.length;
        int mn=Integer.MAX_VALUE;
        int mpos=0;
        while(true)
        {
            boolean flag=false;
            for(int i=0;i<n;i++)
            {    
                if(lists[i]!=null && lists[i].val<mn)
                {
                    mpos=i;
                    mn=lists[i].val;
                    flag=true;
                }
            }  
            if(!flag) 
                break;
            curr.next=lists[mpos];
            curr = curr.next;
            lists[mpos]=lists[mpos].next;
            mn=Integer.MAX_VALUE;
        } 
        return head.next;   
    
    }
}