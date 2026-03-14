// Sum of Digits of a Number
// Loop, Recursion

// Write a program that takes an integer n as input and computes the sum of its
// digits. The input number is always positive.

import java.util.Scanner;

public class qts1 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int rem;
    int sum = 0;

    while(n != 0) {
      rem = n % 10;
      sum += rem;
      n = n / 10;
    }
    System.out.println(sum);

    sc.close();
  }
}