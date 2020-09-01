public class task6 {
    public static int sumList(Node h){
        if(h.next==null) {
            return (int) h.elem;
        }
        else {
            return (int) h.elem + sumList(h.next);
        }
    }
    public static void main(String[]args){
        Object [] a ={10,20,30,40,50};
        LinkedList m = new LinkedList(a);
        System.out.println(sumList(m.head));
    }
}
