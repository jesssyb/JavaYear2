import java.util.Scanner;
public class UsingStrings
{
   public static void main(String[] args)
   {
      //The next lines of code will test the first part of the worksheet
      String s = "Hello";
      String t = "World";
      
      System.out.println(s.length() + t.length());
      System.out.println(s.substring(1,2));
      System.out.println(s.substring(s.length() / 2, s.length()));
      System.out.println(s + t);
      System.out.println((t + s) + "\n");   
      
      printStringPieces("Computer Science");
      printStringPieces("APCS");
      
       //After you write the methods rearrange and initials, 
       //uncomment the following lines to test them...
       System.out.println("Rearrange: ");
       System.out.println(rearrange("Harry"));
       System.out.println(rearrange("Huebsch"));
       
       System.out.println("\nInitials: ");
       System.out.println(initials("Harold James Morgan"));
       System.out.println(initials("John Fitzgerald Kennedy"));

   }
   
   public static void printStringPieces(String words)
   {
       //Put a print statement that prints the first letter
       // of the method parameter.
       System.out.println("First letter: " + words.substring(0,1));
       
       //Put a print statement that prints the last letter of 
       //  the method parameter.
       System.out.println("Last letter: " + words.substring(words.length()-1));
       
       //Put a print statement that prints the parameter 
       //  WITHOUT the first letter.
       System.out.println("Without first letter: " + words.substring(1));
       
       //Put a print statement that prints the parameter 
       //  WITHOUT the last letter.
       System.out.println("Without last letter: " + words.substring(0,words.length()-1) + "\n");
       
      
   }
   
   /* Write a method called rearrange that takes a String as input
    * then builds a new String with the first letter, then 
    * a space, then the last letter, then a space, then adds
    * the rest of the String other than the first and last letter
    * (the middle).  It should then return this new String.
    * HINT: To build a String, declare a new String and set it
    * to an empty String (= "";).  Then add things to it, as 
    * in s = s + "more"; where s is the String I'm building
    *
    * As an example, the call rearrange("Harry"); should return
    * the String "H y arr"
    */
    public static String rearrange(String name)
    {
         String newName = name.substring(0,1) + " " + name.substring(name.length()-1) + " " + name.substring(1, name.length()-1);
         return newName;
    }
    
    
    /* Write a method called initials that returns a String with
     * the first, middle, and last initial of a String that holds
     * a three part name passed in as a parameter.  For example,
     * the call initials("Harold James Morgan"); should return
     * the String "HJM".  You may assume that the method only 
     * needs to work for parameters where there are two spaces
     * and letters before, between, and after the two spaces.
     */
     public static String initials(String name)
     {
         String initials = name.substring(0,1) + name.substring(name.indexOf(" ")+1,name.indexOf(" ")+2);
         name = name.substring(name.indexOf(" ") + 1);
         initials += name.substring(name.indexOf(" ")+1, name.indexOf(" ")+2);
         return initials;
     }
   
}