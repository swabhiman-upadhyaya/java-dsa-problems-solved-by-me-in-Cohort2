import java.util.Scanner;

public class qts7 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    double r = sc.nextDouble();

    double pi = Math.PI;
    double c = 2 * pi * r;
    double a = pi * (r * r);

    System.out.printf("%.2f\n", c);
    System.out.printf("%.2f", a);

    sc.close();
  }
}
