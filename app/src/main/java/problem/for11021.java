package problem;

import java.util.Scanner;

public class for11021 {

  public static void main(String[] args) {

    Scanner scn = new Scanner(System.in);

    int t = scn.nextInt();

    for(int i = 1; i<=t; i++) {
      int a = scn.nextInt();
      int b = scn.nextInt();

      System.out.println();
      System.out.println("Case #" + i + ": " + (a+b));
    }
  }
}
