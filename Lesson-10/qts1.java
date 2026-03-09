// Write a program that accepts two integers, a and b, as input and calculates the
// value of a raised to the power of b (a^b). For example, if a = 2 and b = 3, the result
// is 8 (since 2^3 = 8).

import java.util.Scanner;

public class qts1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

      int a = sc.nextInt();
      int b = sc.nextInt();

      if (a == 0 && b == 0) {
        System.out.println("Undefined");
        return;
      }

      int power = 1;

      for (int i = 1; i <= b; i++) {
        power *= a;
      }

      System.out.println(power);

      sc.close();

    
  }
}