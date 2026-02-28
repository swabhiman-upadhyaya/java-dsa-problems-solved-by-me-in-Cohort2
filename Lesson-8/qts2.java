// PRINT NATURAL NUMBER FROM N TO 1

import java.util.Scanner;

class Solution {
  public static void printNumbersNTo1(int n) {
    for (int i = n; i >= 1; i--) {
      System.out.print(i + " ");
    }
  }
}

public class qts2 {
  public static void main(String[] args) {
    try(Scanner sc = new Scanner(System.in)) {

      int no = sc.nextInt();

      // Here as the method inside the Class solution is static so we'll use the class
      // to call the function.....
      Solution.printNumbersNTo1(no);

    }

  }
}