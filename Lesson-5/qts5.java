// Calculate the final ammount after applying the given discounts

import java.util.Scanner;

public class qts5 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int amount = sc.nextInt();
    int discount = 0;

    if (amount >= 0 && amount <= 5000) {
      discount = 0;
      System.out.println(amount - discount);
    }
    else if (amount >= 5001 && amount <= 7000) {
      discount = (amount * 5) / 100;
      System.out.println(amount - discount);
    }
    else if (amount >= 7001 && amount <= 9000) {
      discount = (amount * 10) / 100;
      System.out.println(amount - discount);
    }
    else {
      discount = (amount * 20) / 100;
      System.out.println(amount - discount);
    }
    
    sc.close();

  }
}