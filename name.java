/*Author: Jessica B
Date: ?
Updated: 5/2/2022 - code was completely broken
Description: This program asks for a first, middle, and last name to be inputted to output the first,
middle, and last name separately*/

import java.util.Scanner;
public class name

{
   public static void main(String [] args)
   {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a full name (Ex: John Bob Doe): ");
      String name = input.nextLine();
      
      String first = name.substring(0, name.indexOf(" "));
      name = name.substring(name.indexOf(" ")+1);
      String middle = name.substring(0, name.indexOf(" "));
      String last = name.substring(name.indexOf(" ")+1);
      
      System.out.println("First: " + first + "\nMiddle: " + middle + "\nLast: " + last);
      
      
   }
}