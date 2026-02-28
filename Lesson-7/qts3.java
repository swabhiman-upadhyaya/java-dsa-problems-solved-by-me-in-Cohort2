import java.util.Scanner;

public class qts3 {

  public static void main(String[] args) {

    try (Scanner sc = new Scanner(System.in)) {

      double rating = sc.nextDouble();

      if (rating >= 0.0 && rating <= 2.0) {
        System.out.println("Flop");
      }
      if (rating >= 2.1 && rating <= 3.4) {
        System.out.println("Semi-hit");
      }
      if (rating >= 3.5 && rating <= 4.5) {
        System.out.println("Hit");
      }
      if (rating >= 4.6 && rating <= 5.0) {
        System.out.println("Super Hit");
      }

    }
  }
}
