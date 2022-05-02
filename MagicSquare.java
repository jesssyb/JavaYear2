import java.util.*;

public class MagicSquare
{
   private int [][] square;
   private int n;
   
   public MagicSquare(int [][] a)
   {
      square = a;
      n = square.length;
   }
   
   public int rowSum(int r)
   {
      int tot = 0;
      if(r < square.length)
      {
         for(int x = 0; x < square.length; x++)
         {
            tot += square[r][x];
         }
      }
      return tot;
   }
   
   public int colSum(int c)
   {
      int tot = 0;
      if(c < square[0].length)
      {
         for(int x = 0; x < square[0].length; x++)
         {
            tot += square[x][c];
         }
      }
      return tot;
   }
   
   public boolean diagSums(int sum)
   {
      int majDiag = 0, minDiag = 0;
      for(int x = 0; x < square.length; x++)
      {
         majDiag += square[x][x];
      }
      
      for(int x = 0; x < square.length; x++)
      {
         minDiag += square[x][square.length-1-x];
      }
      
      if (sum == majDiag && sum == minDiag)
      {
         return true;
      }
      return false;
   }
   
   public boolean exactlyOnce()
   {
      ArrayList<Integer> arr = new ArrayList<Integer>();
      for(int [] x : square)
      {
         for(int y : x)
         {
            arr.add(y);
            for(int r = 0; r < arr.size(); r++)
            {
               if(arr.get(r) == y)
               {
                  if(!(r == arr.size()-1))
                  {
                     return false;
                  }
               }
            }
         }
      }
      return true;
   }
   
   public boolean isMagic()
   {  
      int y = 0;
      for(int x = 0; x < square.length; x++)
      {
         if(this.rowSum(x) == this.colSum(x) && diagSums(this.colSum(x)))
         {
            y+=1;
            if(y == square.length && this.exactlyOnce())
            {
               return true;
            }
         }
      }
       
      return false;
   }
   
   public static void main(String [] args)
   {
      int [][] x = new int[3][3];
      x[0][0] = 2;
      x[0][1] = 7;
      x[0][2] = 6;
      x[1][0] = 9;
      x[1][1] = 5;
      x[1][2] = 1;
      x[2][0] = 4;
      x[2][1] = 3;
      x[2][2] = 8;
      MagicSquare y = new MagicSquare(x);
      System.out.println(y.isMagic());
      
      
      
   }
}