/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns;

import java.util.Scanner;

/**
 *
 * @author Rakibul Hasan Remon
 */
public class Triangle {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please Enter Row Number : ");
        int row = input.nextInt();
        
        for (int i = 1; i <= row; i++){
            
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        
         /*for (int i = row; i >= 1; i--){
            
            for (int j = 1; j < i; j++){
                System.out.print(" ");
            }
            for (int j = 1; j < i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        */

        
        
        
    }
    
}
