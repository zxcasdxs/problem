package problem;

import java.util.Scanner;

public class for2439_1 {
  public static void main(String[] args) {

    Scanner scn = new Scanner(System.in);

    int n = scn.nextInt();

    for(int i = 1; i<=n; i++) {
      int m = n-i;
      for(; m > 0; m--) {
        System.out.print("1");
      }
      for(int j = i; j>0; j--) {
        System.out.print("2");

      }
      System.out.println();
    }
  }
}
