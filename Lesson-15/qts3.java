// Finding Prime Factors of a Number

// Description
// Write a program to find and print all the prime factors of a given number. A prime
// factor is a factor that is a prime number. If the number is 0 or 1, print No prime
// factors.


import java.util.Scanner;

public class qts3 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    if (n == 0 || n == 1) {
      System.out.println("No prime factors");
    } 
    else {
      for (int i = 2; i <= n; i++) {
        while (n % i == 0) { // keep dividing by i as long as possible
          System.out.println(i);
          n = n / i; // reduce n each time
        }
      }
    }

    sc.close();
  }
}