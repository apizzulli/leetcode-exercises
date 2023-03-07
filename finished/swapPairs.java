import java.util.List;

/**
 * Definition for singly-linked list.*/
 class ListNode {
 int val;
 ListNode next;
 ListNode() {}
 ListNode(int val) { this.val = val; }
 ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 
class Solution {
    public static void main(String[] args) {
        ListNode n4 = new ListNode(4, null);
        ListNode n3 = new ListNode(3, n4);
        ListNode n2 = new ListNode(2, n3);
        ListNode n1 = new ListNode(1,n2);
        swapPairs(n1);
    }
    public static ListNode swapPairs(ListNode head) {
        if(head != null){
            ListNode currentNode = head;
            while(currentNode.next!=null){
                currentNode.next = currentNode.next.next;
                ListNode temp = currentNode;
                currentNode = currentNode.next;
            }
        }
        return head;
    }
}