public class CountingQueue extends Queue{
    private int counter = 0;

    public void enqueue(String s) {
        super.enqueue(s);
        counter++;
    }

    public String dequeue() {
        this.counter--;
        return super.dequeue();
    }

    public boolean empty() {
        return counter == 0; //improves implementation without affecting interface, overridden inheritance from Queue
    }

    public static void main(String[] args) {

    }
}
