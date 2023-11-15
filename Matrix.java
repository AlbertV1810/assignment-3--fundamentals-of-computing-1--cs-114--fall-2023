import java.util.Scanner;
public class Matrix {
  static Scanner input = new Scanner(System.in);
  static int arraySize = input.nextInt();
  static int[][] inputMatrix = new int[arraySize][arraySize];
  static int row, column;
  static int matrixValue = 1;

  private static void swap(){


  }

  public static void printMatrix(){
    System.out.println("Your matrix is " + arraySize + "x" + arraySize + "\n" );
    System.out.println("Printing your matrix with default values: " + "\n");
    for(row = 0; row < arraySize; row++){ //Prints non populated matrix
      for(column = 0; column < arraySize; column++){
        System.out.print(inputMatrix[row][column] + "\t");
      }
      System.out.println();
    }
    input.close();
  }

  public static void populateMatrix(){
    System.out.println("Populating Matrix... ");
    System.out.println("Printing populated Matrix: ");
    for(row = 0; row < arraySize; row++){ //Prints populated matrix
      for(column = 0; column < arraySize; column++){
        inputMatrix[row][column] = matrixValue++; //Gives a value to each place in the matrix
        System.out.print(inputMatrix[row][column] + "\t");
        }
       System.out.println();
    }
    System.out.println();
  }
  public static void flipMatrix(){

  }
}
