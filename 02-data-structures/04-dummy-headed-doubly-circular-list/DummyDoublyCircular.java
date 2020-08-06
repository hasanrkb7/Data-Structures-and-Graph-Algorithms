public class DummyDoublyCircular{
    Node head;

    DummyDoublyCircular(Object [] a) {
        head = new Node(null, null, null);
        Node tail = head;

        for (int i = 0; i < a.length; i++) {
            Node n = new Node(a[i], null, null);

            tail.next = n;
            n.prev = tail;
            tail = tail.next;
        }
        tail.next = head;
        head.prev = tail;
    }

    public void insert(Object elem, int index){
        int count = 0;
        Node n = new Node(elem, null, null);

        for (Node i = head; i != null; i = i.next) {
            if (count == index){
                Node x = i.next;
                n.next = x;
                n.prev = i;
                i.next = n;
                x.prev = n;
                break;
            }
            count++;
        }
    }

    public void insertWithElement(Object data, Object element){
        //int count = 0;
        Node n = new Node(data, null, null);

        for (Node i = head; i != null; i = i.next) {
            if (i.elem == element){
                Node x = i.next;
                n.next = x;
                n.prev = i;
                i.next = n;
                x.prev = n;
                break;
            }
        }
    }

    public void delete(int index){
        int count = 0;

        for (Node i = head; i != null ; i = i.next) {
            if (count == index){
                Node n = i.next;
                Node q = n.next;

                i.next = q;
                q.prev = i;
                n.prev = n.next = null;
                n = null;
                break;
            }
            count++;
        }
    }

    public int countNode(){
        int count = 0;
        for (Node i = head.next; i != head; i = i.next) {
            count++;
        }
        return count;
    }

    public void print(){
        for (Node i = head.next; i != head; i = i.next) {
            System.out.println(i.elem);
        }
        System.out.println();
        System.out.println();
    }

    public void backPrint(){
        for (Node i = head.prev; i != head; i = i.prev) {
            System.out.println(i.elem);
        }
        System.out.println();
        System.out.println();
    }
}
