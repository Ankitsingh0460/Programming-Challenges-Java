import java.util.Scanner;

class Factorial {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter number");
    int num = input.nextInt();
    int fact = 1;
    for (int i = 1; i <= num; i++) {
      fact = fact * i;
    }
    System.out.println("Factorial is :" + fact);

  }
}
