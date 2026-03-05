// Write a program that accepts two integers start and end as input and calculates:
// 1. The sum of all even numbers within the range [start, end] (inclusive). 2. The sum
// of all odd numbers within the range [start, end] (inclusive). .. If start is greater
// than end, swap the values before calculating the sum.

import java.util.Scanner;

public class qts6 {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {

      int start = sc.nextInt();
      int end = sc.nextInt();

      int temp;
      int even_sum = 0;
      int odd_sum = 0;

      if (start > end) {
        temp = start;
        start = end;
        end = temp;
      }

      for (int i = start; i <= end; i++) {
        if (i % 2 == 0) {
          even_sum += i;
        } else {
          odd_sum += i;
        }
      }

      System.out.println(even_sum);
      System.out.println(odd_sum);
    }
  }
}