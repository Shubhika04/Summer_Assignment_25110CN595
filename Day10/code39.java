public class code39 {
 public static void main(String[] args) {
  int n = 5;

   for (int i = 1; i <= n; i++) {
    //print spaces
    for (int j = 1; j <= (n-i); j++) {
      System.out.print(" ");
    }
    //print increasing numbers
    for (int k=1; k<=i; k++) {
      System.out.print(k);
    }
    //print decreasing numbers
    for(int m=(i-1); m>=1; m--) {
      System.out.print(m);  
    }
    System.out.println();
   }
}
}