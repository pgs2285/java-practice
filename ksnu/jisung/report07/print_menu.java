package ksnu.jisung.report07;
import java.util.Scanner;
public class print_menu {
    Scanner scan = new Scanner(System.in);
    Person[] persons = null;
    UniverManagement uManagement = new UniverManagement();
    printAll PrintAll = new printAll();
    searchUniDB sDb = new searchUniDB();
    public void menu(){
        
        while(true){
            System.out.println("<대학DB관리 프로그램>\n1.대학 구성원 데이터 입력\n2.대학 구성원 데이터 전체 출력\n3.대학 구성원 데이터 조건 검색\n4.대학 구성원 데이터 변경\n5.대학 구성원 데이터 삭제\n0.메인 메뉴로 돌아가기");
            int num = scan.nextInt();
            switch(num){
                
                case 1: persons = uManagement.inputprocess(persons);
                    break;
                case 2: PrintAll.print_all(persons);
                    break;
                case 3:sDb.search(persons);
                    break;
                case 4: 
                    break;
                case 5:
                    break;
                case 0:
                    break;                    
            }
        }
    }
}
