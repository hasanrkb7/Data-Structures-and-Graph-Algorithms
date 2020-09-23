public class LinkedList{
    public Node head;

    public LinkedList(Object [] a){
        head = new Node(a[0],null);
        Node tail = head;
        for(int i = 1; i < a.length; i++){
            Node n1 = new Node(a[i],null);
            tail.next = n1;
            tail = n1;
        }
    }

    public void printList(){
        for(Node x =  head; x != null; x = x.next){
            System.out.print(x.element +" ");
        }
        System.out.println();
    }

    public void bubbleSort(){
        for(Node x = head; x != null; x = x.next){
            for(Node y = x.next; y != null; y = y.next){
                if((int)x.element >= (int)y.element){
                    Object temp = x.element;
                    x.element = y.element;
                    y.element = temp;
                }
            }
        }
    }
    public void selectionSort(){
        for(Node x = head; x != null; x = x.next){
            Node min = x;
            for(Node y = x.next; y != null; y = y.next){
                if((int)min.element > (int)y.element){
                    min = y;
                }
            }
            int temp = (int) x.element;
            x.element = min.element;
            min.element = temp;
        }
    }
}
