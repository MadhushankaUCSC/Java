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

public class InvoiceApp {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Invoice  Total Calculor");
        String choice = "Y";

        double discountPercent = 0.1;
        while (choice.equalsIgnoreCase("Y")) {
            System.out.print("Enter sub total:");
            double subTotal = sc.nextDouble();
            System.out.println("Discount Percent is:" + 0.1);

            double discountAmount = (subTotal * discountPercent);
            System.out.println("discount Amount is:" + discountAmount);
            double invoiceTotal = subTotal - discountAmount;
            System.out.println("invoice Total is:" + invoiceTotal);

            System.out.println();

            System.out.print("continue (Y/N) :");
            choice = sc.next();

            System.out.println();

        }

    }
}
