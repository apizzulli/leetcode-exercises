import java.util.List;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public static void main(String[] args) {
        ListNode one = new ListNode();
        one.val = 1;
        // ListNode two = new ListNode();
        // two.val =2;
        // one.next=two;
        // ListNode three = new ListNode();
        // three.val = 3;
        // ListNode four = new ListNode();
        // four.val = 4;
        // ListNode five = new ListNode();
        // five.val = 5;
        // one.next = two;
        // two.next=three;
        // three.next = four;
        // four.next= five;
         removeNthFromEnd(one, 1);
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        System.out.println("BEFORE: ");
        ListNode t = head;
        while(t!=null){
            System.out.print(t.val + "->");
            t = t.next;
        }
        System.out.println('\n');
        int indexToRemove = getLength(head)-n;
        int i = 0;
        ListNode temp = head;
        if(indexToRemove==0){ //If the node to be removed is the head
            if(head.next==null)
                return null;
            head = head.next;
            System.out.println("\n AFTER: \nOne element: " + head.val);
            return head;
        }
        while(i < indexToRemove-1){
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
        ListNode node = head;
        System.out.println("AFTER:");
        while(node!=null){
            System.out.print(node.val + "->");
            node = node.next;
        }
        return head;
    }
    public static int getLength(ListNode head){
        int length=0;
        ListNode currentNode = head;
        while(currentNode !=null){
            length++;
            currentNode = currentNode.next;
        }
        return length;
    }
}