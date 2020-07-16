
package linkedlist;

public class linkedList {
        Node head;

    linkedList(int [] a) {
        Node x = new Node(a[0], null);
        head = x;
        Node tail = head;

        for (int n = 1; n < a.length; n++) {
            Node y = new Node (a[n], null);

            tail.next = y;
            tail = y;
        }
    }
}