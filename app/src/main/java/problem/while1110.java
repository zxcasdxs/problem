package problem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class while1110 {
  public static void main(String[] args) throws NumberFormatException, IOException{



    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));



    int n = Integer.parseInt(br.readLine());
    int a = n;
    int b = 0;
    int count = 0;

    if(n == 0) {
      System.out.println(1);
    } else {
      do {
        b = (a % 10) * 10 + ((a / 10) + (a % 10)) % 10;
        a = b;
        count++;

      } while(b != n);
      System.out.println(count);

    } 

  }
}

