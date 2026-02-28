import java.util.Scanner;;

public class qts2 {
  public static void main(String[] args) {

    try (Scanner sc = new Scanner(System.in)) {
      int n1 = sc.nextInt();

      if (n1 % 2 == 0) {
        System.out.println("Even");
      } else {
        System.out.println("Odd");
      }

      sc.close();

    }
  }
}