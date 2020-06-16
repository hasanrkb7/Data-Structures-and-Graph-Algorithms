
package class1;

import java.util.Scanner;


public class TimeTable {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Please Enter the Starting Number of Time Table : ");
        int startingNum = input.nextInt();
        System.out.println("Please Enter the Ending Number of Time Table : ");
        int endingNum = input.nextInt();
        System.out.println("Please Enter how many times you want want to multiply :  ");
        int times = input.nextInt();
        

        for (int i = startingNum; i <= endingNum; i++) {
            System.out.println("Time Table of "+i);
            
            for (int j = 1; j <= times; j++) {
                
            int multipication = i * j;
            System.out.println(i+" X "+j+" = "+multipication);
                
            }
            
            
        }
        
        
        
        
    }
    
}