import java.util.Scanner;

public class qts1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter 1st number: ");
            int a = sc.nextInt();
            System.out.println("Enter 1st number: ");
            int b = sc.nextInt();

            int sum = a + b;
            System.out.println(sum);
            sc.close();
        }
    }
}