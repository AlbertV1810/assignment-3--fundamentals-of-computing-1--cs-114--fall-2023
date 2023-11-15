import java.util.Scanner;

public class RunMatrix {
  public static void main(String[] args) {
    System.out.print("Please enter a positive number for the size of your matrix: ");
    Scanner input = new Scanner(System.in);
    int arraySize = input.nextInt();
    int[][] inputMatrix = new int[arraySize][arraySize];
    int row;
    int column;

    System.out.println("Your matrix is " + arraySize + "x" + arraySize + "\n" );
    System.out.println("Printing your matrix with default values: " + "\n");
    for(row = 0; row < arraySize; row++){
      for(column = 0; column < arraySize; column++){
        System.out.print(inputMatrix[row][column] + "\t");
      }
      System.out.println();
    }
    System.out.println();

    System.out.println("Populating Matrix... ");
    System.out.println("Printing populated Matrix: ");
    for(int rowLimit = 1; rowLimit < (arraySize*arraySize) + 1; rowLimit++){
        System.out.print(rowLimit + "\t");
        if(rowLimit==arraySize){
          System.out.println();
        }
    }


    input.close();
  }
}
