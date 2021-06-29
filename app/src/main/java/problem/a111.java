package problem;

import java.util.Scanner;

public class a111 {


  static class Board{

    String title;
    String name;
    String number;

  }
  static int num = 10;
  static Board[] boards = new Board[num];





  public static void main(String[] args) {

    Scanner keyScan = new Scanner(System.in);


    for(int i = 0; i <= num; i++) {
      boards[i] = new Board();
      boards[i].title = keyScan.nextLine();

      System.out.printf("%s\n", boards[i].title);

    }




  }

}
