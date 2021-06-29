package problem;

import java.util.Scanner;

public class for2439 {

  public static void main(String[] args) {

    Scanner scn = new Scanner(System.in);

    int n = scn.nextInt();


    for(int i = 1; i<=n; i++) {
      int m = n-i;
      for(int k = m; k>0; k--) {

        System.out.print(' ');
      }

      for(int j = i; j>0; j--) {

        System.out.print('*');
      }
      System.out.println();
      m--;
    }
  }

}


