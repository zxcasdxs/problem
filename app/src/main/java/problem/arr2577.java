package problem;

import java.util.Scanner;

public class arr2577 {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    sc.close();
    
    int result = A * B * C;
    int length = (int)(Math.log10(result)+1);
    int[] arr = new int[length];
    int[] arr2 = new int[10];
    
    for(int i = 0; i < arr.length;i++) {
      arr[i] = result % 10;
      result /= 10;
      for(int j = 0; j < arr2.length; j++) {
        if(arr[i] == j) {
          arr2[j]++;
        } 
      }
    }//for end
    for(int i=0; i<(arr.length - arr2.length); i++) {
      if(arr[i]==0 ) {
          arr2[0]--;
      }
  }

      for(int i = 0; i< arr2.length; i++) {
        System.out.println(arr2[i]);
        
      }
    
  }//M end

}//C end