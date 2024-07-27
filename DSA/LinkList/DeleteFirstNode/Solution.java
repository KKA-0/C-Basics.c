package LinkList.DeleteFirstNode;
import java.util.LinkedList;
import java.util.List;

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

    public void DeleteFirstNodeFun() {
        
        // Node node = head.next;
        // head.next = null;
        // head = node;

        Node node = head;
        head = head.next;
        node.next = null;


    }
    
    public static void main(String[] args) {
        Solution LL = new Solution();
        LL.InsertNode(6);
        LL.InsertNode(5);
        LL.InsertNode(4);
        LL.InsertNode(3);
        LL.InsertNode(2);
        LL.InsertNode(1);
        LL.InsertNode(6);
        LL.DeleteFirstNodeFun();
        LL.display();
    }    
}
