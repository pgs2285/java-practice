package ksnu.jisung.midterm;
import java.util.Scanner;
public class printmenu {
    
    Scanner scan = new Scanner(System.in);
    enterGrade EnterGrade = new enterGrade();
    watchGrade WatchGrade = new watchGrade();
    reviseGrade ReviseGrade = new reviseGrade();
    watchAvg WatchAvg = new watchAvg();
    watchBest WatchBest = new watchBest();
    int number = 0;
    int count = 0;
    int[][] student;
    public void printMenu(){
        System.out.println("<성적처리 프로그램>\n1.성적 입력하기(3과목)\n2.성적 보기 \n3.성적수정하기\n4.평균성적보기\n5.최고/최저 성적보기\n0.메인메뉴 돌아가기");
        int num = 0;
        while(true){
        try{ num = scan.nextInt(); break; }
        catch(Exception e){
            System.out.println("정수 숫자를 입력해 주세요");
            scan = new Scanner(System.in);
        }
    }
        Process(num);
    }

    public void Process(int num){
        switch(num){
            case 0: count++;
            break;
            case 1: student = EnterGrade.EnterNum(number);
            break;
            case 2: WatchGrade.WatchGrade(student);
            break;
            case 3: student = ReviseGrade.ReviseGrade(student);
            break;
            case 4: WatchAvg.WatchAvg(student);
            break;
            case 5: WatchBest.WatchBest(student);
            break;
        }
    }
    public void loop(){
        count = 0;
        while(count == 0){
            printMenu();
        }
    }
}
