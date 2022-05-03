import java.util.Scanner;
public class countPrime
{
   public static void main(String [] args)
   {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a whole number: ");
      int num = input.nextInt(), count = 0;
      System.out.println("\nThe following are prime numbers leading up to " + num + ":");
      for (int num2 = 2; num2 <= num; num2++)
      {
         if(countPrimes(num2))
         {
            System.out.print(num2 + " ");
            count++;
         }
      }
      System.out.println("\nThe total number of primes is: " + count);
      
   }
   
   public static boolean countPrimes(int num)
   {
      for (int c = 2; c < num; c++)
      {
         if (num % c == 0)
         {
            return false;
         }
      
      }
      return true;
   }
}