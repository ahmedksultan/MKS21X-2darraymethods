public class ArrayMethods {
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
     public static boolean isRowMagic(int[][] ary) {
          boolean result = false;
          for (int i = 1; i < ary.length; i++) {
               if (rowSum(ary, i) != rowSum(ary, i-1)) {
                    return false;
               }
          }
          return true;
     }
     public static boolean isColumnMagic(int[][] ary) {
          boolean result = false;
          for (int i = 1; i < ary.length; i++) {
               if (columnSum(ary, i) != columnSum(ary, i-1)) {
                    return false;
               }
          }
          return true;
     }
}
