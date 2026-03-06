// Description
// Write a program that accepts an integer n as input and checks whether it is a
// prime number. A prime number is a number greater than 1 that has no positive
// divisors other than 1 and itself. . If the number is prime, print "Prime". . Otherwise,
// print "Not Prime".

import java.util.Scanner;

public class qts1 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    if(n <= 1) {
      System.out.println("Not Prime");
      sc.close();
      return;
    }

    boolean isPrime = true;

    for (int i = 2; i < n; i++) {
      if (n % i == 0) {
        isPrime = false;
        break;
      }
    }

    if (isPrime) {
      System.out.println("Prime");
    } else {
      System.out.println("Not Prime");
    }

    sc.close();

  }

}
