
 //* Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class Solution {
    public static void main(String[] args) {
        ListNode n3 = new ListNode(4, null);
        ListNode n2 = new ListNode(2, n3);
        ListNode n1 = new ListNode(1, n2);

        ListNode p3 = new ListNode(4, null);
        ListNode p2 = new ListNode(3, p3);
        ListNode p1 = new ListNode(1, p2);
        mergeTwoLists(p1, n1);
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newListHead = new ListNode();
        ListNode newListPtr = newListHead;
        ListNode list1ptr = list1;
        ListNode list2ptr = list2;
        while(list1ptr != null || list2ptr != null){
            if(list1ptr!= null && list2ptr !=null ){
                if(list1ptr.val < list2ptr.val){
                   // newListPtr.val = list1ptr.val;
                    ListNode newNode2 = new ListNode(list2ptr.val, null);
                    ListNode newNode1 = new ListNode(list1ptr.val, newNode2 );
                    newListPtr.next = newNode1;
                    newListPtr = newNode2;
                    list1ptr = list1ptr.next;
                    list2ptr = list2ptr.next;
                  //  ListNode newNode = new ListNode(list2ptr.val, null);
                    // newListPtr = newNode;
                    // list1ptr = list1ptr.next;
                }
                else if(list1ptr.val > list2ptr.val){
                  //  newListPtr.val = list2ptr.val;
                    ListNode newNode2 = new ListNode(list1ptr.val, null);
                    ListNode newNode1 = new ListNode(list2ptr.val, newNode2);
                    newListPtr.next = newNode1;
                    newListPtr = newNode2;
                    list1ptr = list1ptr.next;
                    list2ptr = list2ptr.next;
                }
                else if(list1ptr.val == list2ptr.val){
                    newListPtr.val = list1ptr.val;
                    ListNode newNode2 = new ListNode(list2ptr.val, null);
                    ListNode newNode1 = new ListNode(list1ptr.val, newNode2);
                    newListPtr.next = newNode1;
                    newListPtr = newNode2;
                    list2ptr = list2ptr.next;
                    list1ptr = list1ptr.next;
                }
            }
            else if(list1ptr != null){
                ListNode newNode = new ListNode(list1ptr.val,null);
                newListPtr.next=newNode;
            }
            else if(list2ptr !=null){
                ListNode newNode = new ListNode(list2ptr.val, null);
                newListPtr.next = newNode;
            }
            
        }
        return newListHead;
    }
}