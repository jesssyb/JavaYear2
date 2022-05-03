/*Author: Jessica Bresnahan
Date: ?
Description: A random number is generated and you input numbers until your number is correct*/

import java.util.Scanner;

public class GuessingGame
{
   public static void main(String [] args)
   {
      Scanner input = new Scanner(System.in);
      int guess = -1;
      double random = (int)(Math.random()*101);
      while (guess != random)
      {
         
         System.out.print("Enter a guess 0-100: ");
         guess = input.nextInt();
         if (guess < random)
         {
            System.out.println("Too low!");
         }
         else if (guess > random)
         {
            System.out.println("Too high!");
         }
         else
         {
            System.out.println("Nice job!");
         }
      }
      
   }
}