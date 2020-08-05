public class Node {
    Object elem;
    Node next;
    Node prev;

    Node(Object elem, Node next, Node prev){
        this.elem = elem;
        this.next = next;
        this.prev = prev;
    }
}
