package com.lang.cal;

public class MainCalender extends CalFuntion{

  static char[] weeks = {'일', '월', '화', '수', '목', '금', '토'};
  static int [][] days = {{ 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, // 평년
                          { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}}; // 윤년

  static int isLeap(int year) {
    return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0 ;
  }//e
  
  static int fristDayWeek(int year, int month) {
    int weeks = 0;
    int leapSum = 0;
    int yridx = isLeap(year);
    int date = 0;
    
    for (int i = 1900 ; i <year ; i++) {
      leapSum += isLeap(i);
    } weeks = (year - 1900 + leapSum) % 7;
    
    for(int i = 0; i < month - 1; i++) {
      date += days[yridx][i];
    } weeks += (date + 1) % 7;
    
    return weeks % 7;
  }//e
  
  public void Show_Calender(int year, int month) throws Exception {
    int yridx = isLeap(year);
    int lastday = days[yridx][month - 1];
    int Firstweek = fristDayWeek(year,month);
    
    System.out.printf(
        "년도 : %d   월 : %d\t %s\t 첫 요일 위치 : %d (일:0 월:1 화:2 수:3 목:4 금:5 토:6) \n",
        year, month, isLeap(year)==1 ?"<윤년>":"<평년>", Firstweek);
    
    for (char Value : weeks) {
      System.out.printf("%1$c\t", Value);
    } System.out.println();
    
    for (int i = 0; i < Firstweek; i++) {
      System.out.printf("\t");
    }
    
    for(int i = 1; i<= lastday; i++) {
      if(arr[year-1900][month][i-1] == null) {
        System.out.printf("%d □\t", i);
      } else {System.out.printf("%d ■\t", i);}
      if((Firstweek + i -1) % 7 == 6)
        System.out.println();
    }//달력구현
    
    System.out.println("조회할 일 선택 : ");
    try {
      loopDDate : 
        while(true) {
      System.out.println("일정 검색"); 
      
      loopDDay:while(true) {
        System.out.println("일>>>");
      day = sc.nextLine();
      if(day.equals("") || day==null) {
        System.out.println("오류!\t이 칸은 비울수 없습니다.");
        continue loopDDay;
      } if(day.equals("취소")) {
        System.out.println("취소 후 메인 메뉴로 돌아가는중....");
        Thread.sleep(1000);
        mainMenu();
      } else {
        if(day.length()!=2) {
          System.out.println("오류!\t두 자릿수로 일을 입력 하세요.");
          continue loopDDay;
        } else { 
          a = Integer.parseInt(day);}//2else end
      }//1else end
      if(a < 1 || a > 31 ) {
        System.out.println("오류!\t 1~31 일을 입력 하세요.");
      } else {break loopDDay;}//3else end
      } //day while end
      
      String smonth = String.format("%02d", month); 
      msg = "select * from cal where Caldate = "+ "'"+ year +"-"+ smonth +"-"+ day + "'" ;
      System.out.println(msg);
      int OK = ST.executeUpdate(msg);
      if (OK==0) {
        System.out.println("데이터 조회 실패");
      } else {
        System.out.println("데이터 조회 성공");
        break loopDDate;
      }
}//while end
    } catch (Exception ex) { System.out.println("에러이유 " + ex);
    }//try C end
    
    listIn();
    update();
    
  }//Show_Calender end

  static void Scan_ERROR() {
    System.out.printf("\n 올바른 값을 입력하세요");
    System.exit(0);
  }//e
  
  public void Scan_Insert() throws Exception {
    connect();
    int year = 0;
    int month = 0;
    
    System.out.print("년도를 입력(1900년 이후) : ");
    year = sc.nextInt();
    sc.nextLine();
    if(year < 1900) {
      Scan_ERROR();
    }
    
    System.out.print("월을 입력 (1 ~ 12월) : ");
    loopMonth:while(true) {
      System.out.println("월>>>");
    String Smonth = sc.nextLine();
    if(Smonth.equals("") || Smonth==null) {
      System.out.println("오류!\t이 칸은 비울수 없습니다.");
      continue loopMonth;
    } if(Smonth.equals("취소")) {
      System.out.println("취소 후 메인 메뉴로 돌아가는중....");
      Thread.sleep(1000);
      new CalFuntion().mainMenu();
    } else {
      if(Smonth.length()!=2) {
        System.out.println("오류!\t두 자릿수로 월을 입력 하세요.");
        continue loopMonth;
      } else { 
        month = Integer.parseInt(Smonth);}//2else end
    }//1else end
    if(month < 1 || month > 12 ) {
      System.out.println("오류!\t 1~12 월을 입력 하세요.");
    } else {break loopMonth;}//3else end
    } //month while end
    
    Show_Calender(year, month);
  }//M end
  
}//C end
