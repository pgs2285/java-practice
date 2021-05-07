package ksnu.jisung.midterm;

public class watchAvg {
    public void WatchAvg(int[][] student){
        float Korean = 0; float English = 0; float Math = 0;
        for(int i = 0; i< student.length; i++){
            Korean += student[i][0];
            English += student[i][1];
            Math += student[i][2];
        }
        System.out.println("국어평균:"+Korean/student.length +"  영어평균:"+English/student.length+"   수학평균"+Math/student.length);
    }
}
