/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class1;

import java.util.Scanner;

/**
 *
 * @author Rakibul Hasan Remon
 */
public class Palindrome {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please Enter a Number : ");
        int num = input.nextInt();
        int temp, x;
        x = 0;
        temp = num;
        
        while (temp != 0){
        
            x = temp%10 + x*10;
            temp = temp / 10;
        }
        if (x == num){
            System.out.println("Palindrome Number");
        }
        else{
            System.out.println ("Not a Palindrome Number");
        }
    }
    
}
