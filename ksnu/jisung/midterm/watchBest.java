package ksnu.jisung.midterm;

public class watchBest {
    int Korean_max=0; int Korean_min = 10000; int English_max = 0; int English_min = 10000; int Math_max=0; int Math_min =10000;
    int IKorean_max=0; int IKorean_min = 0; int IEnglish_max = 0; int IEnglish_min = 0; int IMath_max=0; int IMath_min =0;
    public void WatchBest(int[][] student){
        for(int i = 0;i<student.length;i++){
            if(Korean_max < student[i][0]) {Korean_max = student[i][0]; IKorean_max = i;}
            if(Korean_min > student[i][0]) {Korean_min = student[i][0]; IKorean_min = i;}
            if(English_max < student[i][1]) {English_max = student[i][1]; IEnglish_max = i;}
            if(English_min > student[i][1]) {English_min = student[i][1]; IEnglish_min = i;}
            if(Math_max < student[i][2]) {Math_max = student[i][2]; IMath_max = i;}
            if(Math_min > student[i][2]) {Math_min = student[i][2]; IMath_min = i;}
        }
        System.out.println("국어 최고"+IKorean_max+"번" + Korean_max +"국어 최저"+IKorean_min+"번"+Korean_min);
        System.out.println("영어 최고"+IEnglish_max+"번" + English_max +"영어 최저"+IEnglish_min+"번"+English_min);
        System.out.println("수학 최고"+IMath_max+"번" + Math_max +"수학 최저"+IMath_min+"번"+Math_min);
    }
}
