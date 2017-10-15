/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_prg_03_08_software_sales;

import javax.swing.JOptionPane;
/**
 *
 * @author bluebackdev
 * A software company sells a package that retails for $99. Quantity discounts
 * are given according to the following table:
 * 
 *      Quantity            Discount
 *      10-19               20%
 *      20-49               30%
 *      50-99               40%
 *      100 or more         50%
 * 
 * Write a program that asks the user to enter the number of packages purchased.
 * The program should then display the amount of the discount (if any) and the
 * total amount of the purchase after the discount.
 */
public class JAVA_PRG_03_08_Software_Sales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Define constants for comparison
        final int INT_20_MIN = 10;
        final int INT_20_MAX = 19;
        final int INT_30_MIN = 20;
        final int INT_30_MAX = 49;
        final int INT_40_MIN = 50;
        final int INT_40_MAX = 99;
        final int INT_50_MIN = 100;
        
        // Define unit price
        final int INT_UNIT_PRICE = 99;
        
        // Declare variable to hold user input for comparison
        int intUserInput;
        
        // Define discount rates as floats: total cost - discount rate
        final float FLT_DISCOUNT_20 = 1.0f - 0.2f; // 0.8f or 80% of total price
        final float FLT_DISCOUNT_30 = 1.0f - 0.3f; // 0.7f or 70% of total price
        final float FLT_DISCOUNT_40 = 1.0f - 0.4f; // 0.6f or 60% of total price
        final float FLT_DISCOUNT_50 = 1.0f - 0.5f; // 0.5f or 50% of total price
        
        // Declare float to hold final purchase cost
        float fltPurchaseCost;
        
        // Declare string to hold user input and output message
        String strUserInput;
        String strOutputMessage;
        
        // Get user input
        strUserInput = JOptionPane.showInputDialog("Please enter the number of\n" +
                "units that you are purchasing.");
        
        // Convert user input to integer for comparison
        intUserInput = Integer.parseInt(strUserInput);
        
        // Determine discount to apply, then calculate final purchase cost from
        // calculated discount constants as defined above
        if(intUserInput > 0 && intUserInput < INT_20_MIN)
        {
            fltPurchaseCost = (float)intUserInput * (float)INT_UNIT_PRICE;
            strOutputMessage = String.format("You do not qualify for a discount.\n"
                    + "Your final purchase cost is $%.2f", fltPurchaseCost);
            JOptionPane.showMessageDialog(null, strOutputMessage);
        }
        else if(intUserInput >= INT_20_MIN && intUserInput <= INT_20_MAX)
        {
            fltPurchaseCost = ((float)intUserInput * (float)INT_UNIT_PRICE) * FLT_DISCOUNT_20;
            strOutputMessage = String.format("You qualify for 20%% discount.\n"
                    + "Your final purchase cost is $%.2f", fltPurchaseCost);
            JOptionPane.showMessageDialog(null, strOutputMessage);
        }
        else if(intUserInput >= INT_30_MIN && intUserInput <= INT_30_MAX)
        {
            fltPurchaseCost = ((float)intUserInput * (float)INT_UNIT_PRICE) * FLT_DISCOUNT_30;
            strOutputMessage = String.format("You qualify for 30%% discount.\n"
                    + "Your final purchase cost is $%.2f", fltPurchaseCost);
            JOptionPane.showMessageDialog(null, strOutputMessage);
        }
        else if(intUserInput >= INT_40_MIN && intUserInput <= INT_40_MAX)
        {
            fltPurchaseCost = ((float)intUserInput * (float)INT_UNIT_PRICE) * FLT_DISCOUNT_40;
            strOutputMessage = String.format("You qualify for 40%% discount.\n"
                    + "Your final purchase cost is $%.2f", fltPurchaseCost);
            JOptionPane.showMessageDialog(null, strOutputMessage);
        }
        else if(intUserInput >= INT_50_MIN)
        {
            fltPurchaseCost = ((float)intUserInput * (float)INT_UNIT_PRICE) * FLT_DISCOUNT_50;
            strOutputMessage = String.format("You qualify for 50%% discount.\n"
                    + "Your final purchase cost is $%.2f", fltPurchaseCost);
            JOptionPane.showMessageDialog(null, strOutputMessage);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "ERROR CALCULATING DISCOUNT\n" +
                    "PRICE COULD NOT BE CALCULATED");
        }
        
        // For using JOptionPane
        System.exit(0);
    }
    
}
