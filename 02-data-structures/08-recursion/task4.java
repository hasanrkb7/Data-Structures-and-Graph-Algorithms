import java.util.Scanner;
public class task4 {
    public static String bin(int n){
        if(n==0) {
            return "0";
        }
        if(n==1) {
            return "1";
        }
        else {
            return bin(n / 2) + (n % 2);
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a Decimal Number: ");
        int num = sc.nextInt();
        String s = bin(num);
        System.out.println(s);
    }
}
