//  Calculating electricity bills on given using acc to conditions

import java.util.Scanner;

public class qts6 {
  public static void main(String[] args) {

    try (Scanner sc = new Scanner(System.in)) {

      double unit = sc.nextDouble();
      double result;

      if (unit >= 0 && unit <= 100) {
        result = 4.2 * unit;
        System.out.println(result);
      } else if (unit >= 101 && unit <= 200) {
        result = 6 * unit;
        System.out.println(result);
      } else if (unit >= 201 && unit <= 400) {
        result = 8 * unit;
        System.out.println(result);
      } else {
        result = 13 * unit;
        System.out.println(result);
      }

      sc.close();
    }
  }
}
