package linkedlist;

public class Main {
    public static void main(String[] args) {
        
    int [] a = {10,20,30,40,40,50,50,60};
        linkedList list = new linkedList(a);
        System.out.println("Print Linked List: ");
        list.print();
        System.out.println("Print Same Elements on the list:");
        list.printSameElemnet();
        System.out.println("Insert on the last Index:");
        list.insert(70,8);
        list.print();
        System.out.println("Insert on the nth Index:");
        list.insert(45,5);
        list.print();
        System.out.println("Insert on the first Index:");
        list.insert(0,0);
        list.print();
        System.out.println("Reverse Print:");
        list.reverse();
        list.print();
        System.out.println("Print the Actual Linked List:");
        list.reverse();
        list.print();
        System.out.println("Delete first Index:");
        list.delete(0);
        list.print();
        System.out.println("Delete nth Index");

        int [] b = {10,20,30,40,40,50,60};
        LinkedList l = new LinkedList(a);

        l.delete(6);
        l.print();




    }
}