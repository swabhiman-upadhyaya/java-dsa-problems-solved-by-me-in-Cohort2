import java.util.Scanner;

public class qts2 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {

      String name = sc.nextLine();
      int age = sc.nextInt();

      System.out.println("Hello " + name + " you are " + age + " years old");

      sc.close();
    }
  }
}
