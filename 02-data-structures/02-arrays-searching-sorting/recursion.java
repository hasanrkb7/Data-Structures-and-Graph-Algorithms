public class recursion {
    public static void main(String[] args) {
        print(1);
    }
    public static void print (int x){
        if (x <= 5){
            System.out.println(x);
            print (x+1);
        }
    }
}
