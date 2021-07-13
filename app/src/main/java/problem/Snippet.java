package problem;

public class Snippet {
  for(int i = 1; i<= lastday; i++) {
    System.out.printf("%d\t", i);
    if((Firstweek + i -1) % 7 == 6)
      System.out.println();
  }
}

