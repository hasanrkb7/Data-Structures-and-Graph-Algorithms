import javax.swing.text.AbstractDocument;

public class ListStack implements Stack{
    int size;
    Node head;

    public ListStack(){
        size = 0;
        head = null;
    }

    @Override
    public boolean isEmpty() {
        if (size == 0){
            return true;
        }
        return false;
    }


    @Override
    public void push(Object element) throws StackOverflowException {
        if(size==0){
            head = new Node(element,null);
            size++;
            return;
        }
        else{
            Node n = new Node(element, null);
            n.next = head;
            head = n;
            //n = head;
            size++;
        }
    }

    @Override
    public Object pop() throws StackUnderflowException {
        if (size == 0){
            throw new StackUnderflowException();
        }
        else{
            Node n = head;
            head = head.next;
            n.next = null;
            size--;
            return n.elem;
        }
    }

    @Override
    public Object peek() throws StackUnderflowException {
        if (size == 0){
            throw new StackUnderflowException();
        }
        else{
            return head.elem;
        }
    }
}
