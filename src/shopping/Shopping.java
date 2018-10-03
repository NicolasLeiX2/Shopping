/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package shopping;

import java.util.Scanner;

/**
 * Nicolas Lei
 * October 3, 2018
 */
public class Shopping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);
        
        double USB,KB,MS;
        double TUSB,TKB,TMS;
        double tax,total;
        tax = 0.13;
        USB = 19.99;
        KB = 49.99;
        MS = 25.99;
        
        //All the product times the amount
        System.out.println("How many USB storage device did you purchase");
        TUSB = keyedInput.nextInt() * USB;
        System.out.println("How many Keyboards did you purchase");
        TKB = keyedInput.nextInt() * KB;
        System.out.println("How many Mouses did you purchase");
        TMS = keyedInput.nextInt() * MS;
        
        //Sum of all the products price, plus tax
        total = (TUSB + TKB + TMS) * tax + (TUSB + TKB + TMS);
        System.out.println("The total of your order is $" + total);
    }
    
}
