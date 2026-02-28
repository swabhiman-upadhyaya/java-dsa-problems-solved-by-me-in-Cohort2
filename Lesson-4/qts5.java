import java.util.Scanner;

public class qts5 {

  public static void main(String[] args) {

    try (Scanner scannerobj = new Scanner(System.in)) {

      int a = scannerobj.nextInt();
      int b = scannerobj.nextInt();

      a = a + b;
      b = a - b;
      a = a - b;

      System.out.println(a);
      System.out.println(b);

      scannerobj.close();
    }
  }
}