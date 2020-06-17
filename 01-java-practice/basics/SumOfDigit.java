
package class1;

import java.util.Scanner;


public class SumOfDigit {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please Enter any Digit : ");
        int num = input.nextInt();
        
        int temp = num; 
        int x, y;
        x = 0;
        
        while (temp != 0){
        
            
                y = temp % 10;
                x = y + x;
                temp = temp / 10;
            }
        
        System.out.println(x);
        
    }
    
}
 