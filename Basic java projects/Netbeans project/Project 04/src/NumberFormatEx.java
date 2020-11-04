/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */

import java.text.NumberFormat;
public class NumberFormatEx {
  public static void main(String args[]){
     
     double price=11.575;
     
     
     String priceString=NumberFormat.getCurrencyInstance().format(price);
     System.out.println(priceString);
     
     double majority=.505;
   
     String majorityString=NumberFormat.getPercentInstance().format(majority);
     System.out.println(majorityString);
     
     double miles=15341.253;
     NumberFormat bk=NumberFormat.getNumberInstance();
     bk.setMaximumFractionDigits(2);
     String milesString=bk.format(miles);
      System.out.println(milesString);
  }  
}
