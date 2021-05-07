package ksnu.jisung.etc;
import java.util.Arrays;
public class gradeAvgMid {
    public int[] print_AvgMid(int[] student){
        float sum = 0;
        for (int i = 0;i < student.length; i++){
            sum += student[i];
        }
        int[] mid = student.clone();
        Arrays.sort(mid);
        if (mid.length % 2 == 1) System.out.println("평균점수:"+sum/student.length+"\n중위값:"+mid[student.length/2]); // 홀수이면
        else System.out.println("평균점수:"+sum/student.length+"\n중위값:"+ (mid[student.length/2]+mid[student.length/2 - 1]) / 2); //짝수일때 8개 기준 3,4
        return student;
    }
}
