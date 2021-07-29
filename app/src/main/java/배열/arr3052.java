package 배열;

import java.util.Scanner;

public class arr3052 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int[] arr = new int[10];
    int count = 0;
    int result = 0;
    
    for(int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt() % 42;
      for(int j = 0; j <arr.length; j++) {
        if (arr[i] != arr[j]) {
          count++;
      }
      }
    
    }// i for end
    
    System.out.println(count);
    
  }//m end

}//c end
