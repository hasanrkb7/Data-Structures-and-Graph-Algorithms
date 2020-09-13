public class task4 {
    public static void main(String[] args) {
        Object [] a = {9, 8, 2, 4, 6, 5, 14, 53, 1};
        LinkedList list = new LinkedList(a);
        list.selectionSort();
        list.printList();
    }
}
