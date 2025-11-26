class LoopDemo {
   LoopDemo() {
   }

   public static void main(String[] var0) {
      System.out.println("=== while loop demonstration ===");

      for(int var1 = 1; var1 <= 5; ++var1) {
         System.out.println("while loop count: " + var1);
      }

      System.out.println("\n=== do–while loop demonstration ===");
      int var2 = 1;

      do {
         System.out.println("do–while loop count: " + var2);
         ++var2;
      } while(var2 <= 5);

      System.out.println("\nExample: do–while executes once even when condition is false");
      int var3 = 6;

      do {
         System.out.println("This line executes once even though k = " + var3);
         ++var3;
      } while(var3 <= 5);

      System.out.println("\n=== for loop demonstration ===");

      int var4;
      for(var4 = 1; var4 <= 5; ++var4) {
         System.out.println("for loop count: " + var4);
      }

      System.out.println("\nEven numbers from 1 to 10:");

      for(var4 = 1; var4 <= 10; ++var4) {
         if (var4 % 2 == 0) {
            System.out.print("" + var4 + " ");
         }
      }

      System.out.println("\n\nReverse counting from 5 to 1:");

      for(var4 = 5; var4 >= 1; --var4) {
         System.out.println(var4);
      }

      System.out.println("\nPattern printing using nested for loop:");

      for(var4 = 1; var4 <= 3; ++var4) {
         for(int var5 = 1; var5 <= 3; ++var5) {
            System.out.print("* ");
         }

         System.out.println();
      }

   }
}
