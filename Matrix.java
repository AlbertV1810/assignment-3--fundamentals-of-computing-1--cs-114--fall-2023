import java.util.Scanner;
public class Matrix {
  static Scanner input = new Scanner(System.in);
  static int arraySize = input.nextInt();
  static int[][] inputMatrix = new int[arraySize][arraySize];
  static int row, column, x1, y1, x2, y2;
  static int matrixValue = 1;

  public static final String ANSI_YELLOW = "\u001B[33m";
  public static final String ANSI_RESET = "\u001B[0m";
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

  private static void swap() {
    int hold = inputMatrix[x1][y1];
    inputMatrix[x1][y1] = inputMatrix[x2][y2];
    inputMatrix[x2][y2] = hold;
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
  public static void flippedMatrix(){
  int [][] flippedMatrix = new int[arraySize][arraySize];
  for (int row = 0; row < arraySize; row++) {
    for (int column = 0; column < arraySize; column++) {
      flippedMatrix[row][column] = inputMatrix[row][column];
      }
  }
  }
}
