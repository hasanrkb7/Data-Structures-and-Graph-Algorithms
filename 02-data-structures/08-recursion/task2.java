import java.util.Scanner;
public class task2 {
    public static int fibo(int n) {
        if (n == 0){
            return 0;
        }
        else if (n == 1){
            return 1;
        }
        else {
            return fibo(n-1) + fibo(n-2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give a Number: ");
        int num = sc.nextInt();
        int f = fibo(num);
        System.out.print(num + "th Fibonacci number is " + f);
    }
}
