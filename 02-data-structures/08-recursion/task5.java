import java.sql.SQLOutput;
import java.util.Scanner;
public class task5 {
    public static int pro(int m,int n){
        if(n==1){
            return m;
        }
        else{
            return m * pro(m, (n-1));
        }
    }
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a Number: ");
        int m = sc.nextInt();
        System.out.println("Give the Power of that Number: ");
        int n = sc.nextInt();
        System.out.println(pro(m, n));
    }
}
