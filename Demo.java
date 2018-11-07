import java.io.*;
import java.util.*;

public class Demo {
     public static void main (String[] args) {
          System.out.println("\n---STARTING TEST---\n");
          //test1 - square array (5 rows * 5 columns)
          int[][] test1 = new int[5][5];
          //test2 - array (5 rows * 3 columns)
          int[][] test2 = new int[5][3];
          //testR - ragged array
          int[][] testR = new int[5][];
               testR[0] = new int[5];
               testR[1] = new int[10];
               testR[2] = new int[1];
               testR[3] = new int[6];
               testR[4] = new int[5];
          //filling test1
          for (int a = 0; a < test1.length; a++) {
               for (int b = 0; b < test1[a].length; b++) {
                    test1[a][b] = 1;
               }
          }
          //filling test2
          for (int a = 0; a < test2.length; a++) {
               for (int b = 0; b < test2[a].length; b++) {
                    test2[a][b] = b;
               }
          }
          //filling testR
          for (int a = 0; a < testR.length; a++) {
               for (int b = 0; b < testR[a].length; b++) {
                    testR[a][b] = 1;
               }
          }
          System.out.println("Testing rowSum (EXPECTED: 5) ...");
          System.out.println(ArrayMethods.rowSum(test1, 0));
          System.out.println("Testing rowSum (EXPECTED: 3) ...");
          System.out.println(ArrayMethods.rowSum(test2, 1));
          System.out.println("Testing rowSum (EXPECTED: 10) ...");
          System.out.println(ArrayMethods.rowSum(testR, 1));
          System.out.println("Testing rowSum [[out of bounds]] (EXPECTED: 0) ...");
          System.out.println(ArrayMethods.rowSum(test2, 7));
          System.out.println("\nTesting columnSum (EXPECTED: 5) ...");
          System.out.println(ArrayMethods.columnSum(test1, 0));
          System.out.println("Testing columnSum (EXPECTED: 10) ...");
          System.out.println(ArrayMethods.columnSum(test2, 2));
          System.out.println("Testing columnSum [[ragged array]] (EXPECTED: 2) ...");
          System.out.println(ArrayMethods.columnSum(testR, 5));
          System.out.println("Testing columnSum [[ragged array]] (EXPECTED: 5) ...");
          System.out.println(ArrayMethods.columnSum(testR, 0));
          System.out.println("Testing columnSum [[out of bounds]] (EXPECTED: 0) ...");
          System.out.println(ArrayMethods.columnSum(test1, -8));
          System.out.println("Testing columnSum [[out of bounds]] (EXPECTED: 0) ...");
          System.out.println(ArrayMethods.columnSum(test1, 30));
          System.out.println("\nTesting allRowSums (EXPECTED: [5, 5, 5, 5, 5]) ...");
          System.out.println(Arrays.toString(ArrayMethods.allRowSums(test1)));
          System.out.println("Testing allRowSums [[ragged array]] (EXPECTED: [5, 10, 1, 6, 5]) ...");
          System.out.println(Arrays.toString(ArrayMethods.allRowSums(testR)));
          System.out.println("\nTesting allColSums (EXPECTED: [5, 5, 5, 5, 5]) ...");
          System.out.println(Arrays.toString(ArrayMethods.allColSums(test1)));
          System.out.println("Testing allColSums (EXPECTED: [0, 5, 10]) ...");
          System.out.println(Arrays.toString(ArrayMethods.allColSums(test2)));
          System.out.println("Testing allColSums [[ragged array]] (EXPECTED: [5, 4, 4, 4, 4, 2, 1, 1, 1, 1]) ...");
          System.out.println(Arrays.toString(ArrayMethods.allColSums(testR)));
     }
}
