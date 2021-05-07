package ksnu.jisung.midterm;

public class watchGrade {
    public void WatchGrade(int[][] student){
        System.out.println("index      국어     영어     수학");
        for(int i = 0; i < student.length ; i++){
            System.out.println(i+"         "+student[i][0] +"      "+student[i][1]+"       "+student[i][2]);
        }
    }
}
