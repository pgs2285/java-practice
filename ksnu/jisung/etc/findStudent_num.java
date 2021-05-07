package ksnu.jisung.etc;
import java.util.Scanner;
public class findStudent_num {
    Scanner scan = new Scanner(System.in);
    public int[] findStudent(int[] student){
        System.out.print("검색할 학생의 번호를 입력하세요:");
        int num = scan.nextInt();
        System.out.print(num+"번 학생의 성적은"+student[num - 1]+"입니다\n");
        return student;
    }
}
