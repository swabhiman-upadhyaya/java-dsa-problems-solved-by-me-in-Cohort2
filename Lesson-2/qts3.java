import java.util.Scanner;

public class qts3 {
  public static void main(String[] args) {

    try (Scanner objScanner = new Scanner(System.in)) {

      int a = objScanner.nextInt();
      int b = objScanner.nextInt();

      int temp = a;
      a = b;
      b = temp;

      System.out.println(a);
      System.out.println(b);

      objScanner.close();
    }
  }
}
