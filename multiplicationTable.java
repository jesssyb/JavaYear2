/*Author: Jessica Bresnahan
Date: ?
Description: User is asked to input a number to output the multiples of a number leading
up to the number inputted*/

import java.util.Scanner;

public class multiplicationTable
{
   public static void main(String [] args)
   {
      Scanner input = new Scanner(System.in);
      int num = -1;
      while (num < 0)
      {
         System.out.print("Enter a positive integer: ");
         num = input.nextInt();
         if (num < 0)
         {
            System.out.println("Error! Must be a positive integer.");
         }
      }
      
      multiplicationTable(num);
   }
   
   public static void multiplicationTable(int num)
   {
      for (int y = 1; y <= num; y++)
      {
         for (int z = y; z <= (y* 10); z +=y )
         {
            System.out.print(z + " ");
         }
         System.out.println();
      }
      
   }
}