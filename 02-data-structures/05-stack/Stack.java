public interface Stack {
    public void push(Object element) throws StackOverflowException;
    public Object pop () throws StackUnderflowException;
    public Object peek () throws StackUnderflowException;
    public boolean isEmpty ();
}
