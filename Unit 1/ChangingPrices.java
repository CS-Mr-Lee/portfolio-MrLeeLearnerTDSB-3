/**
* Name: Mr. Lee
* Date: Feb 8
* Description: Input, Comments, Constants, Strings
*/

import java.util.Scanner;

public class ChangingPrices {

   /**
   * taxes in Ontario (combined)
   */
   final static double TAX = 0.13;

   public static void main(String [] args) {
   
      final double DON_AMNT = 2.00;
   
      Scanner in = new Scanner(System.in);
      double price;
      String donate;
      
      //getting the price and whether they want to donate
      System.out.println("How much does a pair of pants cost?");
      price = in.nextDouble();
      
      in.nextLine(); //new line character not taken, so
                     //we take that new line and throw it away
      /*
      
      */
      
      System.out.println("Ok! Would you like to donate to the Salvation Army?");
      donate = in.nextLine();
      
      price += addTax(price);
      
      if (donate.equals("yes")) {
         price += DON_AMNT;
      } else {
         price = price;
      }
      
      System.out.println("You are paying $" + price + ".");
      System.out.printf("You are paying $%.2f.\n", price);
   }
   
   /**
   * Name: addTax
   * Description: calculates the Ontario tax based on the given price
   * @param price how much things cost(Parameters)
   * @.param colour the colour of the taxes?
   * @return (return) double value - tax value of the given cost (only tax)
   */
   public static double addTax(double price) {
      return price * TAX;
   }
}