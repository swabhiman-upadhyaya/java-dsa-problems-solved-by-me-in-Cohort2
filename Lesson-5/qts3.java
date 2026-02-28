import java.util.Scanner;

public class qts3 {
  public static void main(String[] args) {

    try (Scanner sc = new Scanner(System.in)) {

      int age = sc.nextInt();
      String name = sc.nextLine();

      if (age >= 18) {
        System.out.println(name + " is a valid voter.");
      } else {
        System.out.println(name + " is not a valid voter.");
      }

      sc.close();
    }
  }
}
