public class code38 {
 public static void main(String[] args) {
  int n = 5;

   for (int i = n; i >= 1; i--) {
    //print spaces
    for (int j = 1; j <= (n-i); j++) {
      System.out.print(" ");
    }
    //print stars
    for (int k=1; k<=(2*i-1); k++) {
      System.out.print("*");
    }
    
    System.out.println();
   }
}
}