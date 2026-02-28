// Factorial of a number

import java.util.Scanner;

public class qts4 {
  public static void main(String[] args) {

    try (Scanner objScanner = new Scanner(System.in)) {

      int n = objScanner.nextInt();

      // As factorial will be growing very fast so int can't able to handle and gives
      // a garbage value but long
      // will give us the correct value "range(int) = 2.1 billion"
      long fact = 1;

      for (int i = 1; i <= n; i++) {
        fact *= i;
      }
      
      System.out.println(fact);
    }

  }
}