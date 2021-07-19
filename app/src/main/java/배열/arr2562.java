package 배열;

import java.util.Scanner;

public class arr2562 {
  public static void main(String[] args) {
    
    Scanner scn = new Scanner(System.in);
    

    int[] num = new int[9];
    int max = num[0];
    int count = 1;
    int i;
    
    for(i = 0; i < num.length; i++) {
      num[i] = scn.nextInt();
      if(max<num[i]) {
        count = i+1;
        max = num[i];
      }
    } scn.close();
    System.out.println(max);
    System.out.println(count);
  }

}
