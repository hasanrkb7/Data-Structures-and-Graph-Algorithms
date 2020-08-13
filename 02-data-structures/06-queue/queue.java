public interface queue {
    public int size ();
    public boolean isEmpty();
    public void enqueue(Object elem) throws StackOverflowException;
    public Object dequeue() throws StackUnderflowException;
    public Object peek() throws StackUnderflowException;
}
