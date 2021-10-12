import java.util.Scanner;
public class Adventure
{
   public static void main(String [] args)
   {
      Scanner input = new Scanner(System.in);
      System.out.print("You are on an island surrounded by water.\nThere is a path to the woods to the north, the seas to the south,\na raft to the west, and a beach shack to the east.\n\nWhich way do you want to go? (n, s, e, w)?: ");
      String command = input.nextLine();
      
      if (command.equals("n"))
      {
         System.out.println("You enter the forest and hear some rustling. There may be tigers here or it's just some monkeys.");
      }
      else if (command.equals("s"))
      {
         System.out.println("You stand on the shore and watch the waves crash onto the sand. Off in the distance you see dolphins. But, there is no escape in sight.");
      }
      else if (command.equals("e"))
      {
         System.out.println("You enter the beach shack, there is a person inside! But, they are a cannibal. You become their dinner.");
      }
      else if (command.equals("w"))
      {
         System.out.println("You approach the raft, it has a big hole ripped into it. You decide it would make the perfect shelter instead.");
      }
      else
      {
         System.out.println("That is not a direction you can go in!");
      }
      
      System.out.println("End of adventure!");
   }
}
