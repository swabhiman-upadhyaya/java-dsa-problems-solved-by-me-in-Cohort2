// Reverse a Number

// Description
// Write a program that accepts a positive integer n as input and return the reverse
// of the number.

import java.util.Scanner;

public class qts3 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int rev = 0;

    while(n != 0) {
      int ld = n % 10;
      rev = rev * 10;
      rev += ld;
      n /= 10;
    }
    System.out.println(rev);

    sc.close();
  }
}