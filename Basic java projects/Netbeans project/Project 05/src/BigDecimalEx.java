/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
import java.math.BigDecimal;
import java.text.NumberFormat;
public class BigDecimalEx {
 public static void main(String args[]){
     
       NumberFormat currency=NumberFormat.getCurrencyInstance();
   BigDecimal objTotal=new BigDecimal(150);
    BigDecimal objNewValue=new BigDecimal(100);
   System.out.println(currency.format(Integer.parseInt(objTotal.add(objNewValue).toString())));
   
 }  
}
