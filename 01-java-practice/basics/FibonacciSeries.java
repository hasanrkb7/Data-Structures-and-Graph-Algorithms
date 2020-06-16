
package class1;

import java.util.Scanner;


public class FibonacciSeries {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        System.out.println("Please Enter Number");
        int times = input.nextInt();
        
        int n1 = 0;
        int n2 = 1;
        int sum;
        sum = 0;
        
        System.out.print("0 , 1 , ");
        for (int i = 3; i <= times; i++){
            sum = n1+n2;
            System.out.print(sum+" , ");
            n1 = n2;
            n2 = sum;
            
        }
    }
    
}
