import java.util.Scanner;

class SumAvgInArray {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Sum and Avg In Array");
    System.out.print("Enter the size of array ");
    int size = input.nextInt();
    int[] nums = new int[size];
    int i = 0;

    while (i < size) {
      System.out.print("Enter Array Element" + (i + 1) + ":");
      nums[i] = input.nextInt();
      i++;

    }

  }
}