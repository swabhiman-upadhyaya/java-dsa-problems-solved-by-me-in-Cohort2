import java.util.Scanner;

public class qts6 {
  public static void main(String[] args) {

    try (Scanner sc = new Scanner(System.in)) {

      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();

      int s = (a + b + c) / 2;

      double A = Math.sqrt(s * (s - a) * (s - b) * (s - c));
      System.out.printf("%.2f", A);

      sc.close();
    }
  }
}
