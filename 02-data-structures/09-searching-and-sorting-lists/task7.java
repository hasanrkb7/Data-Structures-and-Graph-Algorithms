public class task7 {
    static int p = 0;
    static int q = 1;
    static int temp = 1;
    static int l = 1;
    public static int fib(int x) {
        if (x == 1) {
            return 0;
        }
        if (x == 2) {
            return 1;
        }
        if (x == 3) {
            return 1;
        }
        else {
            temp += q;
            q = temp - q;
            l++;
            if (l <= (x - 3)){
                fib(x);
            }
            return temp;
        }
    }
    public static void main(String[] args) {
        System.out.println("Fibonacci:  "+fib(15));
    }
}
