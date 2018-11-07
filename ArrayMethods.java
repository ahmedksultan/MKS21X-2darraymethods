public class ArrayMethods {
     /*
     public String toString(int[][] ary) {
          String result = "[";
          if (ary[0][0] == 0) {
               result = result + "]";
          }
          else {
               for (int a = 0; i < ary.length)
          }
          return result;
     }
     */
     //PART 1
     public static int rowSum(int[][] ary, int x){
          int sum = 0;
          if (! (x > ary.length || x < 0) ) {
               for (int i = 0; i < (ary[x]).length; i++) {
                   sum = sum + ary[x][i];
               }
          }
          return sum;
     }
     public static int columnSum(int[][] ary, int x) {
          int sum = 0;
          if (! (x < 0) ) {
               for (int i = 0; i < ary.length; i++) {
                    if (x < ary[i].length) {
                         sum = sum + ary[i][x];
                    }
               }
          }
          return sum;
     }
     public static int[] allRowSums(int[][] ary) {
          int[] result = new int[ary.length];
          for (int i = 0; i < ary.length; i++) {
               result[i] = rowSum(ary, i);
          }
          return result;
     }
     public static int[] allColSums(int[][] ary) {
          int highest = 0;
          for (int i = 0; i < ary.length; i++) {
               if (ary[i].length > highest) {
                    highest = ary[i].length;
               }
          }
          int[] result = new int[highest];
          for (int i = 0; i < highest; i++) {
               result[i] = columnSum(ary, i);
          }
          return result;
     }
     /*
        public static boolean isColumnMagic(int[][] ary){}
         //checks if the array is column-magic (this means that every column has the same column sum).
         */
     }
