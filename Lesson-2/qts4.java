import java.util.Scanner;

public class qts4 {
  public static void main(String[] args) {

    try (Scanner objScanner = new Scanner(System.in)) {

      int P = objScanner.nextInt(); // Principal Ammount
      double r = objScanner.nextDouble(); // Annual interst in decimal
      int t = objScanner.nextInt(); // Time in years
      int n = objScanner.nextInt(); // How many times the bank add up the interest...........

      double A = P * Math.pow((1 + r / n), (n * t));

      System.out.printf("%.2f", A);

      objScanner.close();
    }
  }
}
