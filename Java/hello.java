import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int XP = 50;
    System.out.println("Type in how much XP you want, you have currently have 50 XP");
       XP +=  keyboard.nextInt();
      System.out.println("You have " + XP + " XP.");
        keyboard.close(); 
  }
}
