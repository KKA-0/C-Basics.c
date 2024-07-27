import java.util.ArrayDeque;
import java.util.Queue;

public class CreateQueue {

    public static void main(String[] args) {
        
        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
        queue.offer(6);
        queue.poll();
        System.out.println(queue);

    }
}
