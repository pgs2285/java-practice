package ksnu.jisung.report07;
import java.util.Scanner;

public class UniverManagement {
    
    Scanner scan = new Scanner(System.in);
    
    public int inputNum(){
        int number = 0;
        while(true){
            try{
                number = scan.nextInt();
                break;
            }catch(Exception e){
                System.out.println("숫자 입력값 오류");
                scan = new Scanner(System.in);
            }
        }
        return number;    
    }

    public Person[] inputprocess(Person[] persons){
        System.out.println("몇 명을 입력하시겠습니까?");
        int number = inputNum();
        persons = new Person[number];
        for(int i = 0; i < number; i++){
            System.out.println(i+":구성원의 형태를 선택하세요 1. 일반인\t2. 학생\t3. 연구원\t4. 교수");
            int selection = inputNum();
            System.out.print("정보를 입력하세요");
            switch(selection){
                case 1:persons[i] = new Person();
                    process_Person(persons, i); break;
                case 2:persons[i] = new Student();
                    process_Student(persons, i); break;
                case 3:persons[i] = new Researcher();
                    process_Researcher(persons, i); break;
                case 4:persons[i] = new Professor();
                    process_Professor(persons, i); break;            
            }
        }
        return persons;
    }

    public void process_Person(Person[] persons, int i){
        System.out.println("(citizenNumber name birthyear순)");  
        persons[i].classify = 0; 
        persons[i].citizenNumber = inputNum();
        persons[i].name = scan.next();
        persons[i].birthyear = inputNum();
    }

    public void process_Student(Person[] persons, int i){
        System.out.println("(citizenNumber name birthyear studentNumber dept순)");
        persons[i].classify = 1;
        persons[i].citizenNumber = inputNum();
        persons[i].name = scan.next();
        persons[i].birthyear = inputNum();
        Student s = (Student)persons[i];
        s.studentNumber = inputNum();
        s.dept = scan.next();
    }

    public void process_Researcher(Person[] persons, int i){
        System.out.println("(citizenNumber name birthyear employeeNumber dept순)");
        persons[i].classify = 2;
        persons[i].citizenNumber = inputNum();
        persons[i].name = scan.next();
        persons[i].birthyear = inputNum();
        Researcher r = (Researcher)persons[i];
        r.employeeNumber = inputNum();
        r.dept = scan.next();
    }

    public void process_Professor(Person[] persons, int i){
        System.out.println("(citizenNumber name birthyear dept position순)");
        persons[i].classify = 3;
        persons[i].citizenNumber = inputNum();
        persons[i].name = scan.next();
        persons[i].birthyear = inputNum();
        Professor p = (Professor)persons[i];
        p.dept = scan.next();
        p.position = scan.next();
    }

    
}
