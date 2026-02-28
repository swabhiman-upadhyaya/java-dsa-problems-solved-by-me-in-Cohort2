// Write a program that accepts an integer n and calculates the sum of the first n
// natural numbers. Natural numbers start from 1 and go up to n.

import java.util.Scanner;

public class qts3 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {

      int n = sc.nextInt();

      int sum = 0;

      for (int i = 1; i <= n; i++) {
        sum += i;
      }

      System.out.println(sum);

      sc.close();
    }
  }
}
