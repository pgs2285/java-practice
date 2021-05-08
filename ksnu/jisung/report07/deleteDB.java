package ksnu.jisung.report07;
import java.util.Scanner;
public class deleteDB {
    Scanner scan = new Scanner(System.in);
    printAll printall = new printAll();
    UniverManagement uManagement = new UniverManagement();
    public void delete(Person[] persons){
        System.out.println("삭제할 index를 골라주세요 - 현재 순서");
        int end = printall.print_all(persons);
        int index = uManagement.inputNum();
        for(int i = index+1; i<end;i++){
            persons[i-1] = persons[i]; 
        }
        persons[end-1] = null;
    }
}
