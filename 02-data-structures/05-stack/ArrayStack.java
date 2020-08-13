public class ArrayStack implements Stack {
    int size;
    Object [] array;

    public ArrayStack(){
        size = 0;
        array = new Object[5];
    }

    @Override
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }


    public void push(Object element) throws StackOverflowException{
        if (size == array.length){
            throw new StackOverflowException();
        }
        else{
            array[size] = element;
            size++;
        }
    }

    @Override
    public Object pop() throws StackUnderflowException{
        Object elem;
        if (size == 0) {
            throw new StackUnderflowException();
        }
        else{
            elem = array[size-1];
            array[size-1] = null;
            size--;
        }
        return elem;
    }

    @Override
    public Object peek() throws StackUnderflowException{
        Object elem;
        if (size == 0){
            throw new StackUnderflowException();
        }
        else{
            elem = array[size-1];
        }
        return elem;
    }


    public void print(){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println();
        System.out.println();
    }
}
