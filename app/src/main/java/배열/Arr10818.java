package 배열;

import java.util.Scanner;

public class Arr10818 {

  public static void main(String[] args) {

    Scanner scn = new Scanner(System.in);
    
    int N = scn.nextInt();
    int min = 1000000;
    int max = -1000000;
    
     for(int i = 0; i < N; i++) {
       int a = scn.nextInt();
       if(a<min) {
         min=a;
       } if(a>max) {
         max=a;
       } 
     } System.out.println(min + " " + max);

    
    scn.close();
  }
}