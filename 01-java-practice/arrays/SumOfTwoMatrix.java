/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Scanner;

/**
 *
 * @author Rakibul Hasan Remon
 */
public class SumOfTwoMatrix {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please Enter Row Size : ");
        int row = input.nextInt();
        System.out.print("Please Enter Column Size : ");
        int column = input.nextInt();
        
        int [][] a = new int [row][column];
        int [][] b = new int [row][column];
        int [][] c = new int [row][column];
        
        System.out.println("Input the Number for A Matrix : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("A ["+i+"] ["+j+"] = ");
                a [i][j] = input.nextInt();  
            }
            
        }
        
        System.out.println("Input the Number for B Matrix : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("B ["+i+"] ["+j+"] = ");
                b [i][j] = input.nextInt();  
            }
            
        }
        
        System.out.println("Printing the A matrix : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(a[i][j]+" ");  
            }
            System.out.println("");
            
        }
        
        System.out.println("Printing the B matrix : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(b[i][j]+" ");  
            }
            System.out.println("");
        }
        
        System.out.println("Printing the Sum matrix : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                c [i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j]+" ");  
            }
            System.out.println("");
        }
        
    }
    
}
