package ksnu.jisung.etc;
import java.util.Scanner;

public class inputGrade {
    Scanner scan = new Scanner(System.in);
    public int[] InputGrade(){
        int student_num;
        System.out.print("처리할 학생의 수를 입력하세요(최대 100점):");
        student_num = scan.nextInt();
        int[] student = new int[student_num];
        for(int i = 0; i < student_num; i++){
            student[i] = scan.nextInt();
        }
        return student;
    }
}
