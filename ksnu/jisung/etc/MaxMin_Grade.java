package ksnu.jisung.etc;

public class MaxMin_Grade {
    
    public int[] printMaxMin(int[] student){
        int max = 0; int min = 100;
        for(int i = 0; i< student.length; i++){
            if(student[i] > max) max = student[i];
            if(student[i] < min) min = student[i];
        }
        System.out.print("최고점수:"+max+"\n최소점수:"+min+"\n");
        return student;
    }
    
}
