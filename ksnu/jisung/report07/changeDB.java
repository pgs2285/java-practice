package ksnu.jisung.report07;
import java.util.Scanner;
public class changeDB {
    printAll printall = new printAll();
    UniverManagement uManagement = new UniverManagement();
    Scanner scan = new Scanner(System.in);
    
    public void changing(Person[] person){
        System.out.println("변경할 index를 말해주세요 - 현재 순서");
        printall.print_all(person);
        int index = uManagement.inputNum();
        uManagement.processing(person, index);
    }

}
