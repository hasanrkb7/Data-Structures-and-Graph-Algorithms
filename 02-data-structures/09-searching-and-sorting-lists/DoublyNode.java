public class DoublyNode {
    public Object element;
    public Node next;
    public Node prev;

    public DoublyNode(Object e, Node n, Node p){
        element = e ;
        next = n;
        prev = p;
    }
}
