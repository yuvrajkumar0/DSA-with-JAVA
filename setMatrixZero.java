public class setMatrixZero {
   

   public static void setZeroes(int[][] var0) {
      int var1 = var0.length;
      int var2 = var0[0].length;

      for(int var3 = 0; var3 < var1; ++var3) {
         for(int var4 = 0; var4 < var2; ++var4) {
            if (var0[var3][var4] == 0) {
               for(int var5 = 0; var5 < var2; ++var5) {
                  if (var0[var3][var5] != 0) {
                     var0[var3][var5] = -1;
                  }
               }

               for(int var8 = 0; var8 < var1; ++var8) {
                  if (var0[var8][var4] != 0) {
                     var0[var8][var4] = -1;
                  }
               }
            }
         }
      }

      for(int var6 = 0; var6 < var1; ++var6) {
         for(int var7 = 0; var7 < var2; ++var7) {
            if (var0[var6][var7] == -1) {
               var0[var6][var7] = 0;
            }
         }
      }

   }

   public static void main(String[] var0) {
      int[][] var1 = new int[][]{
        {1, 1, 1, 1}, 
        {1, 0, 0, 1},
        {1, 1, 0, 1}, 
        {1, 1, 1, 1}};
      setZeroes(var1);

      for(int var2 = 0; var2 < var1.length; ++var2) {
         for(int var3 = 0; var3 < var1[0].length; ++var3) {
            System.out.print(var1[var2][var3] + " ");
         }

         System.out.println();
      }

   }
}
