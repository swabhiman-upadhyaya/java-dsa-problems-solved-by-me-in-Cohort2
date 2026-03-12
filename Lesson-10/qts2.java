// Check if a Number is Strong
// Description
// A number is called a strong number if the sum of the factorial of its digits is equal
// to the number itself. Write a program that accepts a number and checks if it is a
// strong number. . If n is a strong number, print "Yes". . Otherwise, print "No".

import java.util.Scanner;

public class qts2 {

  public static int factorial(int number) {
    int fact = 1;
    for (int i = 1; i <= number; i++) {
      fact *= i;
    }
    return fact;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int on = n;

    int resFactorial, sum = 0;
    int digit;

    while(n != 0) {
      
      digit = n % 10;
      resFactorial = factorial(digit);
      sum += resFactorial;
      n /= 10;

    }
    
    if(sum == on) {
      System.out.println("Yes");
    }
    else {
      System.out.println("No");
    }


    sc.close();
  }
}