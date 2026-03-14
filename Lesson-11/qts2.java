// Check if a Number is Automorphic

// Description
// A number is called an Automorphic number if its square ends with the number
// itself. For example: . 25 is Automorphic because: 25^2 = 625 . The last two digits
// are 25 (which matches the number itself). Write a program that accepts a positive
// integer n and checks whether it is an Automorphic number. . If n is an
// Automorphic number, print "Yes". . Otherwise, print "No".

import java.util.Scanner;

public class qts2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int LdOfnSquare = 1;
    int LdOfn = 1;

    int n = sc.nextInt();
    int nSquare = n * n;

    while (n != 0) {
      LdOfnSquare = nSquare % 10;
      LdOfn = n % 10;

      if (LdOfn != LdOfnSquare) {
        System.out.println("No");
        return;
      }

      n /= 10;
      nSquare /= 10;
    }

    if (LdOfn == LdOfnSquare) {
      System.out.println("Yes");
      return;
    }

    sc.close();
  }
}

/* ANOTHER METHOD..... */

// int digits = String.valueOf(n).length();
// int mod = (int)Math.pow(10, digits);

// if(nSquare%mod==n)System.out.println("Yes");else System.out.println("No")
// ;
