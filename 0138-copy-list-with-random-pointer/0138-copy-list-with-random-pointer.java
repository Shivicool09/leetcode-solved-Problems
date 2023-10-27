/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node head2 = new Node(0);
		Node temp2 = head2;
		Node temp1 = head;
        HashMap<Node, Node> map = new HashMap<>();
		while(temp1!=null){
			Node t = new Node(temp1.val);
      map.put(temp1, t);
			temp2.next = t;
			temp2 = temp2.next;
			temp1 = temp1.next;
		}
		head2 = head2.next;
		temp2 = head2;
		temp1 = head;

        while(temp1 !=null){
            temp2.random = (temp1.random!=null ? map.get(temp1.random) : null);
            temp2 = temp2.next;
            temp1 = temp1.next;
        }
        return head2;
        
    }
}