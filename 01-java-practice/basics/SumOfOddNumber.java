package class1;
import java.util.Scanner;

public class SumOfOddNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Please Enter a starting Number");
        int num1 = input.nextInt();
        System.out.println("Please Enter a End number ");
        int num2 = input.nextInt();
        int sum = 0;

        for (int i = num1; i <= num2; i++) {
            
            if (i%2!=0){
            sum = sum + i;
            }
            
        }
        
        
        System.out.println(sum);
        
    }
    
}

