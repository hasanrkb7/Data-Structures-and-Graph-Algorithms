
package class1;
import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Please Enter a number : ");
        int num = input.nextInt();
        int factorial = 1;

        for (int i = num; i >= 1; i--) {
            
            factorial = factorial * i;
            
        }
        
        
        System.out.println(factorial);
        
    }
    
}

