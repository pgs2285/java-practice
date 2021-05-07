package ksnu.jisung.midterm;
import java.util.Scanner;
public class reviseGrade {
    Scanner scan = new Scanner(System.in);
    public int[][] ReviseGrade(int[][] student){
        System.out.print("학생의 index번호:");
        int index = scan.nextInt();
        for(int i = 0;i < 3; i++){
            student[index][i] = scan.nextInt();
        }
        return student;
    }
}
