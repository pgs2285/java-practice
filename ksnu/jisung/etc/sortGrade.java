package ksnu.jisung.etc;
import java.util.Arrays;
public class sortGrade {
    public int[] Sort(int[] student){
        int[] sortStudent = student.clone();
        Arrays.sort(sortStudent);
        return sortStudent;
    }
    public void printSort(int[] student){
        student = Sort(student);
        for(int i = 0; i < student.length; i++){
            System.out.println(i+1+":"+student[i]);
        }
    }
}
