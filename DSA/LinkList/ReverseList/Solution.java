package LinkList.ReverseList;

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
    private class Node{
        private Node next;
        private int value;
        

        Node(int value){
            this.value = value;
        }

        Node(int value, Node next){
            this.next = next;
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
    public void ReverseFun() {
        Node current = head;
        Node saveList = head.next;
        Node prev = null;
        while(saveList != null){
            current.next = prev;
            prev = current;
            current = saveList;
            saveList = saveList.next;
        }
        current.next = prev;
        head = current;
    }
    public static void main(String[] args) {
        Solution LL = new Solution();
        LL.InsertNode(0);
        LL.InsertNode(1);
        LL.InsertNode(2);
        LL.InsertNode(3);
        LL.InsertNode(4);
        LL.InsertNode(5);
        LL.InsertNode(6);
        LL.ReverseFun();
        LL.display();
    }
}
