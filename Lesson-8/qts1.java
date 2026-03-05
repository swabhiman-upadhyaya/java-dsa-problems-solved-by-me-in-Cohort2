// PRINT NATURAL NUMBER FROM 1 TO N

import java.util.Scanner;

class Solution {
  public static void printNumbers1ToN(int n) {
    for (int i = n; i <= n; i++) {
      System.out.print(i + " ");
    }
  }
}

public class qts1 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {

      int no = sc.nextInt();

      // Here as the method inside the Class solution is static so we'll use the class
      // to call the function.....
      Solution.printNumbers1ToN(no);

      sc.close();
    }
  }
}