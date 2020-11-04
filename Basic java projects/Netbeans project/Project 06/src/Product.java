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
public class Product {
    
    //The Instance variables
    private String code;
    private String discription;
    private double price;
    
    //the Constructor
    public Product()
    {
        price=0;
        discription="";
        code="";
    }
    //another constructor
    public Product(String pCode,String pDes,Double pPrice)
    {
        code=pCode;
        discription=pDes;
        price=pPrice;
    }
        //the set and get method for the code variable
        public void SetCode(String code)
        {
            this.code = code;
        }
        public String getCode()
        {
            return code;
        }
        //a set and  get method for discription variable
        public void setDiscription(String discription)
        {
            this.discription=discription;
        }
        public String getDiscription()
        {
            return discription;
        }
         //a set and  get method for price variable
         public void setPrice(double discription)
         {
             this.price=price;
         }
         public double getPrice()
         {
              return price;
         }
         //a costom get method for the price variable
         public String getFormattedPrice()
         {
             NumberFormat currency=NumberFormat.getCurrencyInstance();
             return currency.format(price);
         }
         
         public void printProduct()
         {
             
            System.out.print(this.code);
            System.out.print(this.discription);
            System.out.print(this.price);
         }
    }         

