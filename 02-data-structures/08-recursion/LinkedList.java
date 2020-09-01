public class LinkedList {
    Node head;
    int size;
    public LinkedList(Object [] a){
        head=new Node(a[0],null);
        Node prev = head;

        for(int i=1;i<a.length;i++){
            Node newNode = new Node(a[i],null);
            prev.next = newNode;
            prev = newNode;
        }
    }
}
