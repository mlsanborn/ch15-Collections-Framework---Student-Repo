import java.util.Scanner;
import java.util.*;


/**
   A program that implements the sieve of Eratosthenes.
*/
public class Sieve
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.println("Compute primes up to which integer?");
      int n = in.nextInt();
      Set<Integer> siev = new HashSet<>();
      

      for(int num = 0; num <= Math.sqrt(n); num++){
          for(int num2 = num; num2 < Math.sqrt(n); num2++){
              if (num%num2 == 0 && num != 2) {siev.remove(num);}
            }
          num++;
        }


   }
}
