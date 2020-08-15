public class ArrayQueue implements queue{
    Object [] array;
    int size;
    int front, rare;

    public ArrayQueue(){
        array = new Object [5];
        size = 0;
        front = rare = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if (size == 0){
            return  true;
        }
        return false;
    }

    @Override
    public void enqueue(Object elem) throws StackOverflowException{
        if (size == array.length){
            throw new StackOverflowException ();
        }
        else {
            array[rare] = elem;
            rare = (rare + 1) % array.length;
            size++;
        }
    }


    @Override
    public Object dequeue() throws StackUnderflowException{
        if (size == 0){
            throw new StackUnderflowException();
        }
        else {
            Object o = array [front];
            array [front] = null;
            front = (front+1) % array.length;
            size--;
            return o;
        }
    }

    @Override
    public Object peek() throws StackUnderflowException{
        if (size == 0){
            throw new StackUnderflowException ();
        }
        else {
            Object o = array [front];
            return o;
        }
    }
    public void printQueue(){
        for (int i = front; i < array.length; i++) {
            System.out.println(array [i]);
        }
    }
    public void printArray(){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array [i]);
        }
    }
}
