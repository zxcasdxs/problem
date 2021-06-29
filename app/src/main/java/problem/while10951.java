package problem;

import java.util.Scanner;

public class while10951 {

  public static void main(String[] args) {

    Scanner scn = new Scanner(System.in);

    int a = 0;
    int b = 0;
    int sum = 0;


    while(scn.hasNext()) {
      a = scn.nextInt();
      b = scn.nextInt();
      sum = a+b;

      System.out.println(sum);
    } 
  } 

} 


