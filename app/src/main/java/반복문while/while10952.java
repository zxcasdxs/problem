package 반복문while;

import java.util.Scanner;

public class while10952 {

  public static void main(String[] args) {

    Scanner scn = new Scanner(System.in);

    int a = 0;
    int b = 0;
    int sum = 0;


    while(true) {
      a = scn.nextInt();
      b = scn.nextInt();
      sum = a+b;

      if(sum<=0) {
        scn.close();
        break;
      } System.out.println(sum);
    } 

  } 

}
