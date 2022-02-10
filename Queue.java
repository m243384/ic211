import java.util.Iterator;

/**
 * The Queue class is used to put strings into a linked list of nodes that hold the value of a 
 * string as well as the next node in the Queue.
 * @author MIDN Anna Klemeyer
 */
public class Queue {
    private Node first;
    private Node last;
    /**
     * This is a constructor for an empty Queue.
     */
    public Queue() {
        this.first = null;
    }

    /**
     * Adds s to the back of the queue.
     * @param s The string used for the data in the new Node.
     */
    public void enqueue(String s) {
        Node newNode = new Node(s, null);
        if (this.first == null) {
            this.first = newNode;
            return;
        }
        this.last = this.first;
        while (this.last.next != null) {
            this.last = this.last.next;
        }
        this.last.next = newNode;
        return;
    }

    /**
     * Removes and returns string from the front of the queue.
     * @return The String that was in the front of the Queue.
     */
    public String dequeue() {
        String front = this.first.data;
        this.first = this.first.next;
        return front;
    }

    /**
     * Returns true if the queue is empty.
     * @return The boolean value for whether the Queue is empty or not. 
     */
    public boolean empty() {
        if (this.first == null)
            return true;
        else
            return false;
    }
    /**
     * This is a nested Node class to use in the Queue class. It holds a String variable and a Node 
     * variable for the next Node in the Queue.
     */
    private class Node {
        public String data;
        public Node next;
        public Node(String d, Node n) {
          data = d;
          next = n;
        }
    }
    public static void main(String[] args) {
        Queue example = new Queue();
        example.enqueue("hi");
        example.enqueue("bye");
        Iterator itr = example.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        for (Queue test = example; example != null; example = example.next) {
            System.out.println(example.data);
        }
    }
}