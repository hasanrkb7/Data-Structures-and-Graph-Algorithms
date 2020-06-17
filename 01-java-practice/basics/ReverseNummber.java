
package class1;

import java.util.Scanner;

public class ReverseNummber {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please Enter a Number");
        int num = input.nextInt();
        int temp, x;
        x = 0;
        temp = num;
        
        while (temp != 0){
        
            x = temp%10 + x*10;
            temp = temp / 10;
        }
        
        System.out.println(x);
        
    }
    
}
