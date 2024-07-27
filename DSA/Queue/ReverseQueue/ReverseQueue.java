import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {

    public Queue ReverseQueueFun(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()) {
            int i = queue.remove();
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            int i = stack.pop();
            queue.offer(i);
        }
        return queue;
    }


    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
        queue.offer(6);
        ReverseQueue QueueClass = new ReverseQueue();
        // QueueClass.ReverseQueueFun(queue);
        System.out.println(QueueClass.ReverseQueueFun(queue));
    }
}
