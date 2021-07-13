package problem;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class TestCal {
  public void printMenu() {
    
    System.out.println("+----------------------+");
    System.out.println("| 1. 일정 등록 ");          
    System.out.println("| 2. 일정 검색");           
    System.out.println("| 3. 달력 보기");
    System.out.println("| h. 도움말 q. 종료");
    System.out.println("+----------------------+");
}
  
  public void runPrompt() {
    
    printMenu();
    Scanner scanner = new Scanner(System.in);
    Calendar cal = Calendar.getInstance();
    
    
    
    for (;;) {
                            
        String cmd = scanner.next();
        if (cmd.equals("1")); //cmdRegister();
        else if(cmd.equals("2")); //cmdSearch();
        else if(cmd.equals("3")) cmdCal(scanner, cal);
        else if(cmd.equals("h")) printMenu();
        else if(cmd.equals("q")) break;
        
    }

    System.out.println("Thanks, Bye~");
    scanner.close();
    
}
  
  private void cmdCal(Scanner s, Calendar c) {
    
    int month = 1;
    int year = 2020;
    
    System.out.println("연도를 입력하세요.(exit: -1)");
    System.out.print("YEAR> ");
    year = s.nextInt();
        
    System.out.println("월을 입력하세요:");
    System.out.print("MONTH> ");
    month = s.nextInt();
    
    if (month >12 || month <1) {
        System.out.println("잘못된 입력 입니다.");
        
    } else{ c.printCalendar(year, month);;
        
        System.out.println("");
    }
        
        return;
    }
  
  public void registerPlan(String strDate, String plan) throws ParseException {
    
    Date date = new SimpleDateFormat("yyyy-MM-dd").parse(strDate);
    System.out.println(date);
    
}
  public static void main(String[] args) throws ParseException {
    
    Calendar cal = new Calendar();
    
cal.registerPlan("2020-07-08", "Let's hava dinner!");
    
    
}
  private HashMap<Date, String> planMap;
  
  public Calendar() {
      planMap = new HashMap<Date, String>();
  
  }

}//C end
