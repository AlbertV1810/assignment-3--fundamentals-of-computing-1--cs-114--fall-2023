import java.util.Scanner;

public class RunMatrix {
  public static void main(String[] args) {
    System.out.print("Please enter a positive number for the size of your matrix: ");
    Scanner input = new Scanner(System.in);
    int arraySize = input.nextInt();
    int[][] inputMatrix = new int[arraySize][arraySize];
    int row;
    int column;
    int matrixValue = 1;

    System.out.println("Your matrix is " + arraySize + "x" + arraySize + "\n" );
    System.out.println("Printing your matrix with default values: " + "\n");
    for(row = 0; row < arraySize; row++){ //Prints non populated matrix
      for(column = 0; column < arraySize; column++){
        System.out.print(inputMatrix[row][column] + "\t");
      }
      System.out.println();
    }
    System.out.println();

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

    input.close();
    }
    public static void printMatrix(){
    System.out.print("Please enter a positive number for the size of your matrix: ");
    Scanner input = new Scanner(System.in);
    int arraySize = input.nextInt();
    int[][] inputMatrix = new int[arraySize][arraySize];
    int row;
    int column;
    int matrixValue = 1;

    System.out.println("Your matrix is " + arraySize + "x" + arraySize + "\n" );
    System.out.println("Printing your matrix with default values: " + "\n");
    for(row = 0; row < arraySize; row++){ //Prints non populated matrix
      for(column = 0; column < arraySize; column++){
        System.out.print(inputMatrix[row][column] + "\t");
      }
      System.out.println();
    }
    System.out.println();
    }



  }
