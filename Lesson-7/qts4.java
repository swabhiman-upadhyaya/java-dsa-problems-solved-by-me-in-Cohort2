import java.util.Scanner;

public class qts4 {

  public static void main(String[] args) {

    try (Scanner sc = new Scanner(System.in)) {

      char ch = sc.next().toLowerCase().charAt(0);

      if (ch >= 'a' && ch <= 'z') {

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
          System.out.println("Vowel");
        } else {
          System.out.println("Consonant");
        }

      } else {
        System.out.println("Invalid input");
      }

      sc.close();
    }
  }
}