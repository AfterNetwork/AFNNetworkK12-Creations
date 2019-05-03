import java.util.Scanner;


import java.util.Random;
class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter order");
    String text = keyboard.nextLine();
    System.out.println("Your order is " + text);
  keyboard.close();
  }
}
