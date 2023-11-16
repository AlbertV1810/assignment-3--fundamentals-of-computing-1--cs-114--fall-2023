import java.util.Scanner;
public class Matrix {
  static Scanner input = new Scanner(System.in);
  static int arraySize = input.nextInt();
  static int[][] inputMatrix = new int[arraySize][arraySize];
  static int row, column, rowTwo, columnTwo, hold;
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
    hold = inputMatrix[row][column];
    inputMatrix[row][column] = inputMatrix[rowTwo][columnTwo];
    inputMatrix[rowTwo][columnTwo] = hold;
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
    if(rowTwo == 0 && columnTwo == arraySize-1){
     for(rowTwo = 0; rowTwo < arraySize - 1; rowTwo++){
      for(columnTwo = arraySize - 1; columnTwo >= 0; columnTwo--){
        System.out.print(ANSI_YELLOW + inputMatrix[row][column] +"\t");
      }
    }
    }
    else{
      for (row  = arraySize - 1; row >= 0; row--) {
        for (column = arraySize - 1; column >= 0; column--){
          Matrix.swap();
          System.out.print(inputMatrix[rowTwo][columnTwo] + "\t");
          }
          System.out.println();
      }
    }
  }
}
