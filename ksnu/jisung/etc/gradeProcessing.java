package ksnu.jisung.etc;
import java.util.Scanner;

public class gradeProcessing {
    inputGrade inputgrade = new inputGrade();
    studentList studentlist = new studentList();
    findStudent_num findStudent = new findStudent_num();
    MaxMin_Grade MaxMin_grade = new MaxMin_Grade();
    sortGrade sort_Grade = new sortGrade();
    gradeAvgMid grade_AvgMid = new gradeAvgMid();
    Scanner scan = new Scanner(System.in);
    int[] student;
    public int menuProcess(){
        int num;
        System.out.println("<학생 성적 처리 프로그램>\n1) 학생 성적 입력\n2)학생 전체 성적 리스트 보기\n3)학생의 번호로 성적 보기\n4)성적 최고 점수, 최저 점수 보기\n5)성적 평균점수, 중위값 점수 보기\n6)성적 정렬해서 보기\n0)메인 메뉴로 돌아감");
        System.out.print("입력:");
        num = scan.nextInt();
        
        return num;
    }

    public void printProcess(){
        int exit = 0;
        while (exit == 0){
            int num = menuProcess();
            switch(num){
                case 0: exit++; break;
                case 1: student = inputgrade.InputGrade(); break;
                case 2: studentlist.printStudent(student); break;
                case 3: findStudent.findStudent(student); break;
                case 4: MaxMin_grade.printMaxMin(student); break;
                case 5: grade_AvgMid.print_AvgMid(student); break;
                case 6: sort_Grade.printSort(student); break;
            }}
    }
}
