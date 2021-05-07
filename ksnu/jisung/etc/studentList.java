package ksnu.jisung.etc;

public class studentList {
    public int[] printStudent(int[] student){
        for (int i = 0; i < student.length; i++){
            System.out.println(i+1 + ":" + student[i]);
        }
        return student;
    }
}
