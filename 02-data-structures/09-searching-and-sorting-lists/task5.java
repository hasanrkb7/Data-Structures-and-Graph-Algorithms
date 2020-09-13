public class task5 {
    public static void main(String[] args) {
        Object [] a = {6,4,7,8,3,5,9,10,1,2};
        DoublyLinkedList list = new DoublyLinkedList(a);
        list.insertionSort();
        list.forwardPrint();
    }
}
