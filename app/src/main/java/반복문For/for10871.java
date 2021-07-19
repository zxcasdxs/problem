package 반복문For;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class for10871 {

  public static void main(String[] args) throws NumberFormatException, IOException {

    Scanner scn = new Scanner(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    //Scanner로 n,x 입력
    int n, x;
    n = scn.nextInt();
    x = scn.nextInt();

    //25줄 nextLine 엔터코드 중복. 24줄 추가로 잔여 엔터코드 제거.
    scn.nextLine();
    String a = scn.nextLine();
    String[] arr = new String[n];
    arr = a.split(" ");
    //arr.split => ("") 괄호 따옴표 안의 기호로 문자열 구분하여 분리 " " / "-" / ","등...

    for(int i = 0; i<n; i++) {
      int j = Integer.parseInt(arr[i]);
      if(j<x) bw.write(j+" ");
    }
    bw.close();
  }
}
//https://www.acmicpc.net/problem/10871
//https://www.acmicpc.net/board/view/58118
