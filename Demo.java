public class Demo {
     public static void main (String[] args) {
          System.out.println("\n---STARTING TEST---\n");
          int[][] test1 = new int[5][5];
          int[][] test2 = new int[5][3];
          for (int a = 0; a < test1.length; a++) {
               for (int b = 0; b < test1[a].length; b++) {
                    test1[a][b] = 1;
               }
          }
          for (int a = 0; a < test2.length; a++) {
               for (int b = 0; b < test2[a].length; b++) {
                    test2[a][b] = b;
               }
          }
          System.out.println("Testing rowSum (EXPECTED: 5) ...");
          System.out.println(ArrayMethods.rowSum(test1, 0));
          System.out.println("Testing rowSum (EXPECTED: 3) ...");
          System.out.println(ArrayMethods.rowSum(test2, 1));
          System.out.println("Testing rowSum [[out of bounds]] (EXPECTED: 0) ...");
          System.out.println(ArrayMethods.rowSum(test2, 7));
          System.out.println("\nTesting columnSum (EXPECTED: 5) ...");
          System.out.println(ArrayMethods.columnSum(test1, 0));
          System.out.println("Testing columnSum (EXPECTED: 10) ...");
          System.out.println(ArrayMethods.columnSum(test2, 2));
          System.out.println("Testing columnSum [[out of bounds]] (EXPECTED: 0) ...");
          System.out.println(ArrayMethods.columnSum(test1, -8));
          System.out.println("Testing columnSum [[out of bounds]] (EXPECTED: 0) ...");
          System.out.println(ArrayMethods.columnSum(test1, 30));
     }
}
