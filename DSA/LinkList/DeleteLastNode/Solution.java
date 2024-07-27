import org.w3c.dom.Node;

public class Solution {


    private Node head;
    private Node tail;
    private int size;

    public void InsertNode(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }

        size += 1; 
    }

    private class Node {
        private Node next;
        private int value;

        Node(Node next, int value){
            this.next = next;
            this.value = value;
        }
        Node(int value){
            this.value = value;
        }
    }

    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("END");
    }

    public void DeleteLastNodeFun() {
        Node node = head;
        while(node.next !=  tail){
            node = node.next;
        }
        node.next = null;
        tail = node;
    }

    public static void main(String[] args) {
        Solution LL = new Solution();
        LL.InsertNode(4);
        LL.InsertNode(3);
        LL.InsertNode(2);
        LL.InsertNode(1);
        LL.InsertNode(0);
        LL.DeleteLastNodeFun();
        LL.display();
    }
}
