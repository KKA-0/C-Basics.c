public class Solution {
    
    private int size = 0;
    private NodeList head;
    private NodeList tail;

    public void InsertNode(int value) {
        
        NodeList node = new NodeList(value);
        node.next = head;
        head = node;

        if(head == tail){
            head = node;
        }

        size += 1;
    }

    private class NodeList{
        private int value;
        private NodeList next;

        NodeList(int value){
            this.value = value;
        }
        NodeList(int value, NodeList next){
            this.next = next;
            this.value = value;
        }
    }
    
    public void display(){
        NodeList temp = head;
        while (temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("END");
    }

    public void RemoveNth(int n) {
        NodeList fast = head; 
        NodeList current = head.next;
        NodeList prev = null;

        for(int i = 0; i < n; i++){
            fast = fast.next;
        }

        while(fast != null){
            fast = fast.next;
            prev = current;
            current = current.next; 
        }

        if(prev == null){
            head = current.next;
            current.next = null;
            return head;
        }

        prev.next = current.next;
        current.next = null;
    }

    public static void main(String[] args) {
        Solution LL = new Solution();
        int n = 4;
        LL.InsertNode(0);
        LL.InsertNode(1);
        LL.InsertNode(2);
        LL.InsertNode(3);
        LL.InsertNode(4);
        // LL.RemoveNth(n);
        LL.display();
    }
}
