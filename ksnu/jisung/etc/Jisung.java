package ksnu.jisung.etc;
import ksnu.jisung.midterm.*;
import java.util.*;
import ksnu.jisung.report07.*;
import ksnu.jisung.report08.*;
public class Jisung {
    printmenu PrintMenu = new printmenu();
    Scanner scanner = new Scanner(System.in);
    Coffee coffee = new Coffee();
    Average average = new Average();
    AtoZ atoz = new AtoZ(); 
    addXY addxy = new addXY();
    TimesTable timesTable = new TimesTable();
    TimesTable_auto timestable_auto = new TimesTable_auto();
    gradeProcessing gradeprocessing = new gradeProcessing();
    practiceProblem problem = new practiceProblem();
    print_menu pMenu = new print_menu();
    printMenu printLibraryMenu = new printMenu();
    public int printMenu(){
        System.out.println("다음의 프로그램들 중에서 수행할 함수를 선택하세요\n [구현자이름 : 박지성 학번: 1901115]\n 1) 커피 메뉴를 넣으면 가격을 출력해 주는 프로그램");
        System.out.println(" 2) 입력된 수의 평균과 갯수 구하기해서 화면에 프린트하기 \n 3) 알파벳 A부터 Z까지 프린트하기 \n 4) 정수 x와 y를 입력받아, x부터 y까지 더하는 과정과 결과 보이기");
        System.out.println(" 5) 99단 단순 찍기\n 6) 99단 출력 단수와 수의 범위 설정해서 프린트하기 \n"+
        "7) 학생성적 처리 프로그램  \n 8) 배열 연습문제 풀기\n 9) 성적처리 프로그램(중간고사)\n 10) 대학 DB 관리 프로그램 \n 11)도서관 프로그램 \n0)종료");
        int choice = scanner.nextInt();
        return choice;
    }
    public void choice(){
        int menu = printMenu();
        switch(menu){
            case 0: System.exit(0);
                break;
            case 1: coffee.coffeePrint();
                break;
            case 2: average.average();
                break;
            case 3:atoz.printAtoZ();
                break;
            case 4:addxy.printXY();
                break;
            case 5:timestable_auto.printTable();
                break;
            case 6: timesTable.timesTables();
                break;          
            case 9: PrintMenu.loop();
                break;
            case 7: gradeprocessing.printProcess();    
                break;
            case 8: problem.get_number();
                break;    
            case 10: pMenu.menu(); 
                break;
            case 11:printLibraryMenu.PrintMenu();
                break;

        }
    }
    public static void main(String[] args){
        
        Jisung jisung = new Jisung();
        while(true){
            jisung.choice();
        }
    }
}
