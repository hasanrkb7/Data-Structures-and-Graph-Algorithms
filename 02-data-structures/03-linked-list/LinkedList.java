public class LinkedList {
    Node head;

    LinkedList(int [] a) {
        Node x = new Node(a[0], null);
        head = x;
        Node tail = head;

        for (int n = 1; n < a.length; n++) {
            Node y = new Node (a[n], null);

            tail.next = y;
            tail = y;
        }
    }
    public void copyList (){
        Node copyHead = new Node(head.element, null);
        Node copyTail = copyHead;
        for(Node i = head.next; i != null; i = i.next){
            Node copyNode = new Node (i.element, null);

            copyTail.next = copyNode;
            copyTail = copyNode;
        }
    }

    public void insert(int element, int index){
        int count = 1;
        for (Node n = head; n != null ; n=n.next) {
            if (index == 0){
                Node x = new Node (element, null);
                x.next = head;
                head = x;
                break;
            }
            if (count == index){
                Node x = new Node (element, null);
                x.next = n.next;
                n.next = x;
            }
            count++;
        }
    }

    public void delete(int index){
        int count = 1;
        for(Node i = head, j = head.next; i != null; i = i.next, j= j.next){
            if (index == 0) {
                Node temp = head;
                head = head.next;
                temp.next = null;
            }
            if(count == index){
                i.next = j.next;
                break;
            }
            //Deleting Last Index
            if (j.next == null){
                i.next = null;
            }
            count++;
        }
    }

    public int countNode (){
        int count = 0;
        for (Node n=head; n != null; n=n.next){
            count++;
        }
        return count;
    }

/*
    public void reverse (){

        Object [] r = new Object [countNode()];
        int i = 0;
        for (Node n = head; n!= null; n=n.next){
            r[i]= n.element;
            i++;
        }
        int j = countNode()-1;
        for (Node n = head; n!= null; n=n.next){
            n.element = r[j];
            j--;
        }
    }

 */

    public void leftRotate(){
        Node temp = head;
        Node tail = head;
        head = head.next;
        for (Node i = tail; i.next != null;) {
            i = i.next;
            if (tail.next == null){
                tail.next = temp;
                temp = null;
            }
        }
    }

    public void print(){
        for (Node i = head; i != null; i=i.next) {
            System.out.println(i.element);
        }
        System.out.println();
        System.out.println();
    }

    public void printSameElemnet(){
        for (Node i = head; i != null; i=i.next) {
            for (Node j = i.next; j != null; j=j.next) {
                if (i.element == j.element){
                    System.out.println(i.element);
                    break;
                }
            }
        }
        System.out.println();
        System.out.println();
    }
}