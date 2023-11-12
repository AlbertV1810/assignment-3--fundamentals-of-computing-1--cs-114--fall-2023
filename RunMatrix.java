import java.util.Scanner;

public class RunMatrix {
  public static void main(String[] args) {
    System.out.print("Please enter a positive number for the size of your matrix: ");
    Scanner input = new Scanner(System.in);
    int arraySize = input.nextInt();
    int[][] inputMatrix = new int[arraySize][arraySize];

    System.out.println("Your matrix is " + arraySize + "x" + arraySize );
    for(int row = 0; row < arraySize; row++){
      for(int column = 0; column < arraySize; column++){
        System.out.print(inputMatrix[row][column] + "\t");
      }
      System.out.println();
    }

    input.close();
  }
}
