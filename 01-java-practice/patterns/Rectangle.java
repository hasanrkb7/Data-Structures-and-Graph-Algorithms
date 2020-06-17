
package patterns;

import java.util.Scanner;

public class Rectangle {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please Enter Row Number : ");
        int row = input.nextInt();
        System.out.println("Please Enter Column Number : ");
        int col = input.nextInt();
        
        for (int i = 1; i <= row; i++){
            
            for (int j = 1; j <= col; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        
        
        
    }
    
}
