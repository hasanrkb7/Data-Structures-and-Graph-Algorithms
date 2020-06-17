
package class1;

import java.util.Scanner;
import java.lang.Math;
public class ArmstrongNumber {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please Enter a Number : ");
        int num = input.nextInt();
        
        int temp, x , y;
        x = 0;
        temp = num;
        
        while (temp != 0){
            y = temp%10;
            x = (int) (Math.pow(y, 3) + x);
            temp = temp / 10;
        }
        
        if (num == x){
            System.out.println("Armstrong Number");
        }
        else {
            System.out.println("Not a Armstrong Number");
        }
        
    }
    
}
