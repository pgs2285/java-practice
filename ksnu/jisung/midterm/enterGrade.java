package ksnu.jisung.midterm;
import java.util.Scanner;
public class enterGrade {
    Scanner scan = new Scanner(System.in);
    int num;
    public int[][] EnterNum(int number){
        while(true){
        System.out.print("성적입력명수 >");
        try{num = scan.nextInt();break;}
        catch(Exception e){
            System.out.println("입력오류 다시입력해주세요");
            scan = new Scanner(System.in);
        }
    }
        int[][] student = new int[num][3];
        student = EnterGrade(student,num);
        return student;
    }
    public int[][] EnterGrade(int[][] student,int num){
        for(int i = 0; i < num; i++){
            try{
                System.out.print(i+"번째 학생 성적입력 >");
                for(int j = 0; j<3;j++){student[i][j] = scan.nextInt();}
            }
            catch(Exception e){
                System.out.println("오류");
                break;
            }
        }
        return student;
    }
}
