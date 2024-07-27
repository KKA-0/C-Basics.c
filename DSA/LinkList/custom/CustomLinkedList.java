import org.w3c.dom.Node;

class CustomLinkedList {

    private Node head;
    private Node tail;
    private int size;

    public CustomLinkedList(){
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }

        size += 1;
    }

    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("END");
    }

    public void InsertAtIndex(int index,int value){
        if(index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        
        if(index == 0) {
            insertFirst(value);
            return;
        }
        Node temp = head;
        int I = 0;
        while(I != index - 1){
            temp = temp.next;
            I++;
        }
        Node node = new Node(value);
        Node nodeTemp = temp.next;
        temp.next = node;
        temp.next.next = nodeTemp;
    } 

    private class Node {
        private int value;
        private Node next;

        public Node (int value){
            this.value = value;
        }

        public Node (int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }


   public static void main(String[] args) {
        CustomLinkedList LL = new CustomLinkedList();
        int index = 0;
        int value = 9;
        // LL.insertFirst(3);
        // LL.insertFirst(4);
        // LL.insertFirst(6);
        // LL.insertFirst(7);
        // LL.insertFirst(2);
        LL.InsertAtIndex(index, value);
        LL.display();
   }
}
