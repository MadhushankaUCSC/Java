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
public class StudentReport{ 
public static void main(String args[])
{
    
    Scanner sc=new Scanner(System.in);
    int count=0;
    int rang80_100=0;
    int rang75_79=0;
    int rang70_74=0;
    int rang0_69=0;      
    
    
    while(count<3)
    {
        System.out.print("Enter student no :");
        int studentNo = sc.nextInt();
        System.out.print("Enter mark01: ");
        int mark01 = sc.nextInt();
        System.out.print("Enter mark02: ");
        int mark02 = sc.nextInt();
        System.out.print("Enter mark03: ");
        int mark03 = sc.nextInt();
       
        int average =(mark01+mark02+mark03)/3;
                
        count = count + 1;
         if(average>80)
            rang80_100= rang80_100 +1;
                    
         else
             
             if(average>=74)
                    rang75_79= rang75_79 +1;
             else
                   if(average>=69)
                       rang70_74= rang70_74 +1;
         
                    else
                        rang0_69= rang0_69 +1;
         
       
                
    }
      System.out.println("rang80_100:"+rang80_100);
         System.out.println ("rang75_79:"+rang75_79);
        System.out.println(" rang70_74:"+ rang70_74);
        System.out.println("rang0_69:"+rang0_69);
}
}

        

