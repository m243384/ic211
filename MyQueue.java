public class MyQueue extends CountingQueue {
    public void massEnqueue(String[] s) {
        for(int i=0; i<s.length;i++) {
            super.enqueue(s[i]); //can't go super two levels, skips counter, can only work one level up
        }
    }
}