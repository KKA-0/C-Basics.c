public class Solution {
    private ListNode head;
    private ListNode tail;
    private int size;

    private class ListNode {
        private ListNode next;
        private int value;
        ListNode(int value){
            this.value = value;
        }
        ListNode(int value,ListNode next){
            this.next = next;
            this.value = value;
        }
    }
    public void InsertNode(int value) {
        ListNode node = new ListNode(value);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }

        size += 1;
    }
    public void display() {
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("END");
    }
    public void recurseList(ListNode head) {
        if(head == null) return;
        System.out.print(head.value + " -> ");
        recurseList(head.next);
    }
    
    public static void main(String[] args) {
        Solution LL = new Solution();
        LL.InsertNode(1);
        LL.InsertNode(2);
        LL.InsertNode(3);
        LL.InsertNode(5);
        LL.recurseList(LL.head);
        // LL.display();
    }
}
