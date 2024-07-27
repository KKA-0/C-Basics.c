import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class customQueue {
    private int front;
    private int rear;
    private int size;
    private int[] array;
    private int count;

    public customQueue(int size) {
        this.front = -1;
        this.rear = 0;
        this.array = new int[size];
        this.size = size;
        this.count = 0;
    }

    public void enQueue( int val ){
        if(count == size){
            System.out.println("Queue is Full!");
            return;
        } 

        array[rear] = val;
        rear = ( rear + 1 ) % size;
        count++;
    }

    public int deQueue(){
        if(count == 0){
            System.out.println("Queue is Empty");
            return -1;
        }
        front = (front + 1) % size;
        int val = array[front];
        array[front] = 0;
        count--;
        return val;
    }

    public String toString() {
        return Arrays.toString(array);
    }


    public static void main(String[] args) {
        customQueue cq = new customQueue(6);
        cq.enQueue(1);
        cq.enQueue(2);
        cq.enQueue(3);
        cq.enQueue(4);
        cq.enQueue(5);
        cq.deQueue();
        cq.deQueue();
        cq.enQueue(5);
        cq.enQueue(5);
        cq.enQueue(5);
        cq.enQueue(5);
        




        System.out.println(cq);
    }
}
