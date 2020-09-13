public class DoublyLinkedList {
    public Node head;

    public DoublyLinkedList(Object [] a){
        head = new Node(a[0], null, null);
        Node tail = head;

        for(int i = 1; i < a.length; i++){
            Node n = new Node(a[i], null, null);
            tail.next = n;
            n.prev = tail;
            tail = tail.next;
        }
    }

    public DoublyLinkedList(Node h){
        head = h;
    }


    public void forwardPrint(){
        for(Node x = head; x != null; x = x.next){
            System.out.print(x.element+" ");
        }
        System.out.println();
    }

    public void insertionSort(){
        for(Node i = head; i != null; i = i.next){
            Node count = head;
            for(Node z = i.prev; z != null; z = z.prev){
                if((int)z.element > (int)z.next.element){
                    int temp = (int)z.element;
                    z.element = z.next.element;
                    z.next.element = temp;
                }
                else{
                    break;
                }
            }
        }
    }
}

