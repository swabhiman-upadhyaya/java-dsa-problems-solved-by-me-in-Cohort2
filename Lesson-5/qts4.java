// Leap year: a year can be leaf year if it is divisible by "4", but not by "100" -OR- "year" is not divisible by "100"

import java.util.Scanner;

public class qts4 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {

      int year = sc.nextInt();

      if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
        System.out.println("Leaf year");
      } else {
        System.out.println("Not a leaf year");
      }

      sc.close();
    }
  }
}
