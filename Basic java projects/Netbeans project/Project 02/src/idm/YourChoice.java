/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package idm;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class YourChoice {
  public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     String choice="Y";
     
     while(choice.equalsIgnoreCase("Y")){
         
     
        //get the invoice subtotal from user
         System.out.print("Enter subtotal");
         double subtotal=sc.nextDouble();
         
         //the code that processes user's entry goes here
         
         //see if the user wants to continue
         System.out.print("continue? (Y/N):");
         choice =sc.next();
         System.out.println();
     }
 }
         
}
