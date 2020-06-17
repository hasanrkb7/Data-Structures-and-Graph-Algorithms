package array;

import java.util.Scanner;

public class DiogonalAndUpperAndLowerElement {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please Enter Row Size : ");
        int row = input.nextInt();
        System.out.print("Please Enter Column Size : ");
        int column = input.nextInt();
        
        int [][] a = new int [row][column];
        
        int sumOfDigonalElement = 0;
        int sumOfUpperElement = 0;
        int sumOfLowerElement = 0;
        
        System.out.println("Input the Number for the Matrix : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("A ["+i+"] ["+j+"] = ");
                a [i][j] = input.nextInt();  
            }
            
        }
        
        System.out.println("Printing the A matrix : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(a[i][j]+" ");  
            }
            
            System.out.println("");
            
        }
        
        
            for (int i = 0; i < row; i++){
                for (int j = 0; j < column; j++){
                    if (i == j){
                        sumOfDigonalElement = sumOfDigonalElement + a[i][j];
                    }
                    if (i < j){
                        sumOfUpperElement = sumOfUpperElement + a[i][j];
                    }
                    if (i > j){
                        sumOfLowerElement = sumOfLowerElement + a[i][j];
                    }
                }
            }
            System.out.print("Sum Of Digonal Element is = "+sumOfDigonalElement);
            System.out.println("");
            System.out.print("Sum Of Upper Element is = "+sumOfUpperElement);
            System.out.println("");
            System.out.print("Sum Of Lower Element is = "+sumOfLowerElement);
            System.out.println("");
        
    }
    
}
