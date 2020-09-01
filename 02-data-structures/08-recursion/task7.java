public class task7 {
    public static void revList(Node h){
        if(h==null) {
            return;
        }
        else {
            revList(h.next);
            System.out.println(h.elem);
        }
    }
    public static void main(String[]args){
        Object []a = {10,20,30,40};
        LinkedList m = new LinkedList(a);
        revList(m.head);
    }
}
