package ksnu.jisung.report07;
import java.util.Scanner;

public class searchUniDB {
    UniverManagement umManagement = new UniverManagement();  
    Scanner scan = new Scanner(System.in);
    
    public void search(Person[] persons){
        System.out.println("1.사람 이름으로 검색 2. 나이로 검색");
        int number = umManagement.inputNum();
        switch(number){
            case 1: System.out.print("이름으로 검색");
                String name = scan.next(); searchByName(persons, name);
                break;
            case 2:System.out.print("기준:2021년 나이로 검색(최소나이 최대나이):");
                int min = umManagement.inputNum(); int max = umManagement.inputNum(); searchByAge(persons,max,min);
                break;
        }
    }

    public void searchByName(Person[] persons,String name){
        for(Person p:persons){
            if((p.name).equals(name)){
                print(p);
            }
        }
    }

    public void searchByAge(Person[] persons,int max, int min){      
        for(Person p: persons){
            if((2021 - p.birthyear + 1) <= max && (2021 - p.birthyear + 1) >= min){
                print(p);
            }
        }
    }

    public void print(Person p){
        if(p.classify == 0)
            System.out.print("Person :"+p.toString());
        if(p.classify == 1)
            System.out.print("Student: "+p.toString());
        if(p.classify == 2)
            System.out.print("Researcher: "+p.toString());
        if(p.classify == 3)
            System.out.print("Professor :"+p.toString());
        System.out.println();
    }
}
